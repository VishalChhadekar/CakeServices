package com.cakebakingservice.controller;

import java.util.Date;
import java.util.Set;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cakebakingservice.bean.Cake;
import com.cakebakingservice.service.CakeServiceClass;

@Controller
public class CakeController {
	@Autowired
	private CakeServiceClass cakeServiceClass;

	@RequestMapping("/")
	public String home() {
		return "home";
	}

	@RequestMapping(value = "/showCakeOrderForm", method = RequestMethod.GET)
	public String showCakeOrder(@ModelAttribute("cake") Cake cake) {
		return "placeOrder";

	}

	@RequestMapping(value = "/orderStatus", method = RequestMethod.POST)
	public String getOrderStatus(@Valid @ModelAttribute("cake") Cake cake, BindingResult result, ModelMap map) {
		// Redirect to same page, if form page has any errors
		if (result.hasErrors())
			return "placeOrder";

		// get select flavor by user, and get it's value from list
		int flavorRate = cakeServiceClass.flavorList.get(cake.getFlavor()); // this get method takes the key and returns
																			// value, if not present returns null

		// set the chosen flavor price to attribute of Cake class
		cake.setFlavorRate(flavorRate);

		if (cake.getIncludeCandles() == null)
			cake.setIncludeCandles(0); // To prevent NullPointerException

		if (cake.getIncludeIncreption() == null)
			cake.setIncludeIncreption(0); // To prevent NullPointerException

		// Calculating Cake price
		double price = cake.getSelectedcake() + flavorRate + cake.getIncludeCandles() + cake.getIncludeIncreption();
		// set calculated price
		cake.setPrice(price);

		// invoke addOrder method of CakeServiceClass and pass the cake object
		int orderId = cakeServiceClass.addOrder(cake);

		// Adding all the above objects to the ModelMap to make them accessible in the
		// view
		map.addAttribute("cake", cake);
		map.addAttribute("indianPrice", cake.getPrice() * 75);
		map.addAttribute("orderId", orderId);
		map.addAttribute("orderDate", new Date().toString()); // Setting the orderDate object

		// in case orderId is less than 1001, then redirect to same placeOrder user
		// form; else return orderStatus
		return orderId >= 1000 ? "orderStatus" : "placeOrder";

	}

	// this method will print the flavorList on placeOrder.jsp page
	@ModelAttribute("flavorList")
	public Set<String> populateFillingList() {
		return CakeServiceClass.flavorList.keySet();
	}
}

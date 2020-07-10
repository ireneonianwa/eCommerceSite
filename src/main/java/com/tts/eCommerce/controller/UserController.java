package com.tts.eCommerce.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import com.tts.eCommerce.model.PurchaseOrder;
import com.tts.eCommerce.model.User;
import com.tts.eCommerce.service.PurchaseOrderService;
import com.tts.eCommerce.service.UserService;



@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	@Autowired 
	private PurchaseOrderService orderService;
	
	 @GetMapping(value = "/users/{username}")
	  public String getUser(@PathVariable(value="username") String username, Model model) {
	    User user = userService.findByUsername(username);
	    List<PurchaseOrder> orders = orderService.findByOrder(order);
	    User loggedInUser = userService.getLoggedInUser();
	    }
}
package com.webapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeContrller {

	
	
	@RequestMapping("/")
	public String log()
	{
		
		return "index";
	}
}

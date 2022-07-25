package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeContorller {

	
	@RequestMapping(value = "/hello")
	public String hello () {
		
		return  "index.html";
	}

	@ResponseBody
	@RequestMapping(value = "/hello2")
	public String hello2 () {
		
		return  "Hello World";
	}
	
	
}

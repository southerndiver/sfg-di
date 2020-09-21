package com.javadiver.sfgdi.controllers;

import org.springframework.stereotype.Controller;

import com.javadiver.sfgdi.services.GreetingService;

@Controller
public class MyController {

	private final GreetingService greetingService;
	
	public MyController(GreetingService greetingService) {
		super();
		this.greetingService = greetingService;
	}

	public String sayHello() {
		return greetingService.sayGreeting();
	}
}

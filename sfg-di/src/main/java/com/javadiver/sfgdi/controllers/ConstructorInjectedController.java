package com.javadiver.sfgdi.controllers;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.javadiver.sfgdi.services.GreetingService;

@Controller
public class ConstructorInjectedController {

	private final GreetingService greetingService;
	
//	@Autowired - autowired on constructor no longer needed in latest Spring
	public ConstructorInjectedController(@Qualifier("constructorGreetingServiceImpl") GreetingService greetingService) {
		// TODO Auto-generated constructor stub
		this.greetingService = greetingService;
	}

	public String getGreeting() {
		return greetingService.sayGreeting();
	}
}

package com.javadiver.sfgdi.controllers;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.javadiver.sfgdi.services.GreetingService;

@Controller
public class I18NController {

	private final GreetingService greetingService;

	public I18NController(@Qualifier("i18NService") GreetingService greetingService) {
		super();
		this.greetingService = greetingService;
	}
	
	public String SayHello() {
		return greetingService.sayGreeting();
	}
	
}

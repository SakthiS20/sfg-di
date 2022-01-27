package net.breezeware.sfgdi.controllers;

import org.springframework.stereotype.Controller;

import net.breezeware.sfgdi.services.GreetingServices;

@Controller
public class MyController {

	private final GreetingServices greetingServices;
	
	
	public MyController(GreetingServices greetingServices) {
		this.greetingServices = greetingServices;
	}


	public String sayHello() {
		return greetingServices.sayGreeting();
	}
}

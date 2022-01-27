package net.breezeware.sfgdi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import net.breezeware.sfgdi.services.GreetingServices;

@Controller
public class ConstructorInjectedController {
	private final GreetingServices greetingServices;
	
	@Autowired
	public ConstructorInjectedController(@Qualifier("constructorGreetingService")GreetingServices greetingServices) {
		this.greetingServices = greetingServices;
	}
	
	public String getGreeting() {
		return greetingServices.sayGreeting();
	}

	
}

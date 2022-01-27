package net.breezeware.sfgdi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import net.breezeware.sfgdi.services.GreetingServices;

@Controller
public class PropertyInjectedController {
	@Qualifier("propertyInjectedGreetingService")
	@Autowired
	public GreetingServices greetingServices;
	
	public String getGreeting() {
		return greetingServices.sayGreeting();
	}
}

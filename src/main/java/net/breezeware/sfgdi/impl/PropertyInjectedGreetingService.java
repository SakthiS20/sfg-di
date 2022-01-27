package net.breezeware.sfgdi.impl;

import org.springframework.stereotype.Service;

import net.breezeware.sfgdi.services.GreetingServices;

@Service
public class PropertyInjectedGreetingService implements GreetingServices{

	@Override
	public String sayGreeting() {
		
		return "Hello World - Property";
	}

}

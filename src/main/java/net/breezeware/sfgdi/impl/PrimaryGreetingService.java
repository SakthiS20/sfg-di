package net.breezeware.sfgdi.impl;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import net.breezeware.sfgdi.services.GreetingServices;

@Primary
@Service
public class PrimaryGreetingService implements GreetingServices {

	@Override
	public String sayGreeting() {
		return "Hello World - From the PRIMARY Bean ";
	}
	

}

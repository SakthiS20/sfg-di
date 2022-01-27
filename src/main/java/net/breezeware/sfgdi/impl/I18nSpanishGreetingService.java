package net.breezeware.sfgdi.impl;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import net.breezeware.sfgdi.services.GreetingServices;

@Profile({"ES","default"})
@Service("i18nService")
public class I18nSpanishGreetingService implements GreetingServices{

	@Override
	public String sayGreeting() {
		return "Hola Mundo - ES";
	}

	
}

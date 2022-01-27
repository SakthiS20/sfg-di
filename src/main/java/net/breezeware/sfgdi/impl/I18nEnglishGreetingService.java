package net.breezeware.sfgdi.impl;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import net.breezeware.sfgdi.services.GreetingServices;

@Profile("EN")
@Service("i18nService")
public class I18nEnglishGreetingService implements GreetingServices{

	@Override
	public String sayGreeting() {
		return "Hello World - EN";
	}

}

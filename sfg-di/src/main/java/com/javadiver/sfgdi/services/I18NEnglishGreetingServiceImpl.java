package com.javadiver.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("EN")
@Service("i18NService")
public class I18NEnglishGreetingServiceImpl implements GreetingService {

	private GreetingRepository greetingRepository;

    public I18NEnglishGreetingServiceImpl(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @Override
    public String sayGreeting() {
        return greetingRepository.getEnglishGreeting()(

}

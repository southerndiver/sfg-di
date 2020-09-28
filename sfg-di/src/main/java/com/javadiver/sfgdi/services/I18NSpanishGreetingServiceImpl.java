package com.javadiver.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"ES", "default"})
@Service("i18NService")
public class I18NSpanishGreetingServiceImpl implements GreetingService {

    private GreetingRepository greetingRepository;

    public I18NSpanishGreetingServiceImpl(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @Override
    public String sayGreeting() {
        return greetingRepository.getSpanishGreeting();
    }

}

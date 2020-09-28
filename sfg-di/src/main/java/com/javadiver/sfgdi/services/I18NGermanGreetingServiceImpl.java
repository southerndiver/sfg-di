package com.javadiver.sfgdi.services;

public class I18NGermanGreetingServiceImpl implements GreetingService {

    private GreetingRepository greetingRepository;

    public I18NGermanGreetingServiceImpl(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @Override
    public String sayGreeting() {
        return greetingRepository.getGermanGreeting();
    }
    
}

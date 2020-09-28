package com.javadiver.sfgdi.services;

public class GreetingServiceFactory {
    private GreetingRepository greetingRepository;

    public GreetingServiceFactory(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    public GreetingService createGreetingService(String lang) {

        switch (lang){
            case "en":
                return new I18NEnglishGreetingServiceImpl(greetingRepository);
            case "de":
                return new I18NGermanGreetingServiceImpl(greetingRepository);
            case "es":
                return new I18NSpanishGreetingServiceImpl(greetingRepository);
            default:
                return new I18NEnglishGreetingServiceImpl(greetingRepository);
        }

    }
}

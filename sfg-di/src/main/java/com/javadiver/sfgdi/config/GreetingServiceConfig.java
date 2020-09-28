package com.javadiver.sfgdi.config;

import com.javadiver.sfgdi.services.GreetingRepository;
import com.javadiver.sfgdi.services.GreetingService;
import com.javadiver.sfgdi.services.GreetingServiceFactory;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

@Configuration
public class GreetingServiceConfig {

    @Bean
    GreetingServiceFactory greetingServiceFactory(GreetingRepository greetingRepository) {
        return new GreetingServiceFactory(greetingRepository);
    }

    @Bean
    @Primary
    @Profile({"default","en"})
    GreetingService englishGreetingService(GreetingServiceFactory greetingFactory) {
        return greetingFactory.createGreetingService("en");
    }

    @Bean
    @Profile({"default","es"})
    GreetingService spanishGreetingService(GreetingServiceFactory greetingFactory) {
        return greetingFactory.createGreetingService("es");
    }

    @Bean
    @Profile({"default","de"})
    GreetingService germanGreetingService(GreetingServiceFactory greetingFactory) {
        return greetingFactory.createGreetingService("de");
    }
}

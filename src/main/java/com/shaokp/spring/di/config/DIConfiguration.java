package com.shaokp.spring.di.config;

import com.shaokp.spring.di.services.EmailServiceImpl;
import com.shaokp.spring.di.services.MessageService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(value = {"com.shaokp.spring.di.consumer"})
public class DIConfiguration {
    @Bean
    public MessageService getMessageService() {
        return new EmailServiceImpl();
    }
}

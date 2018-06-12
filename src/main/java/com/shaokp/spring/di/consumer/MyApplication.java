package com.shaokp.spring.di.consumer;

import com.shaokp.spring.di.services.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MyApplication {
    private MessageService  service;

    @Autowired
    public void setService(MessageService service) {
        this.service = service;
    }

    public boolean processMessage(String msg, String rec) {
        return this.service.sendMessage(msg, rec);
    }
}

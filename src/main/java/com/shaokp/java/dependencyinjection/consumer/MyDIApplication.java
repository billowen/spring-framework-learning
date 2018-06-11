package com.shaokp.java.dependencyinjection.consumer;

import com.shaokp.java.dependencyinjection.service.MessageService;

public class MyDIApplication implements Consumer {
    private MessageService service;

    public MyDIApplication(MessageService service) {
        this.service = service;
    }

    @Override
    public void processMessage(String msg, String rec) {
        service.sendMessage(msg, rec);
    }
}

package com.shaokp.spring.di.services;

public class EmailServiceImpl implements MessageService {
    @Override
    public boolean sendMessage(String msg, String rec) {
        System.out.println("Email sent to " + rec + " with message = " + msg);
        return true;
    }
}

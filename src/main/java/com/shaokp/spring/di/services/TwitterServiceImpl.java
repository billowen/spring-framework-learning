package com.shaokp.spring.di.services;

public class TwitterServiceImpl implements MessageService {
    @Override
    public boolean sendMessage(String msg, String rec) {
        System.out.println("Twitter message setn to " + rec + " with message = " + msg);
        return true;
    }
}

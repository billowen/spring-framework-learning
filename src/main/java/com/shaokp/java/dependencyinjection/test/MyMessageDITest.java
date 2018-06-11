package com.shaokp.java.dependencyinjection.test;

import com.shaokp.java.dependencyinjection.consumer.Consumer;
import com.shaokp.java.dependencyinjection.injector.EmailServiceInjectorImpl;
import com.shaokp.java.dependencyinjection.injector.MessageServiceInjector;
import com.shaokp.java.dependencyinjection.injector.SMSServiceInjectorImpl;

public class MyMessageDITest {
    public static void main(String[] args) {
        String msg = "Hi Pankaj";
        String email = "pankaj@abc.com";
        String phone = "1234567";
        MessageServiceInjector injector = null;
        Consumer app = null;

        // Send email;
        injector = new EmailServiceInjectorImpl();
        app = injector.getConsumer();
        app.processMessage(msg, email);

        // Send SMS;
        injector = new SMSServiceInjectorImpl();
        app = injector.getConsumer();
        app.processMessage(msg, phone);

    }
}

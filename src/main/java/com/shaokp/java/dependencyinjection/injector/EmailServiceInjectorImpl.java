package com.shaokp.java.dependencyinjection.injector;

import com.shaokp.java.dependencyinjection.consumer.Consumer;
import com.shaokp.java.dependencyinjection.consumer.MyDIApplication;
import com.shaokp.java.dependencyinjection.service.EmailServiceImpl;

public class EmailServiceInjectorImpl implements MessageServiceInjector {
    @Override
    public Consumer getConsumer() {
        return new MyDIApplication(new EmailServiceImpl());
    }
}

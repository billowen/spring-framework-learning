package com.shaokp.java.dependencyinjection.injector;

import com.shaokp.java.dependencyinjection.consumer.Consumer;
import com.shaokp.java.dependencyinjection.consumer.MyDIApplication;
import com.shaokp.java.dependencyinjection.service.SMSServiceImpl;

public class SMSServiceInjectorImpl implements MessageServiceInjector {
    @Override
    public Consumer getConsumer() {
        return new MyDIApplication(new SMSServiceImpl());
    }
}

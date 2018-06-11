package com.shaokp.java.dependencyinjection;

import com.shaokp.java.dependencyinjection.consumer.Consumer;
import com.shaokp.java.dependencyinjection.consumer.MyDIApplication;
import com.shaokp.java.dependencyinjection.injector.MessageServiceInjector;
import com.shaokp.java.dependencyinjection.service.MessageService;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MyDIApplicationTest {
    private MessageServiceInjector injector;
    @Before
    public void setup() {
        injector = new MessageServiceInjector() {
            @Override
            public Consumer getConsumer() {
                return new MyDIApplication(new MessageService() {
                    @Override
                    public void sendMessage(String msg, String rec) {
                        System.out.println("Mock message service implementation.");
                    }
                });
            }
        };
    }

    @Test
    public void test() {
        Consumer consumer = injector.getConsumer();
        consumer.processMessage("Hi pankaj", "pankaj@abc.com");
    }

    @After
    public void tear() {
        injector = null;
    }
}

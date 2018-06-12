package com.shaokp.spring.di;

import com.shaokp.spring.di.consumer.MyApplication;
import com.shaokp.spring.di.services.MessageService;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(value = "com.shaokp.spring.di.consumer")
public class MyApplicationTest {
    private AnnotationConfigApplicationContext context = null;

    @Bean
    public MessageService getMessageService() {
        return new MessageService() {
            @Override
            public boolean sendMessage(String msg, String rec) {
                System.out.println("Mock Serivce");
                return true;
            }
        };
    }

    @Before
    public void setup() {
        context = new AnnotationConfigApplicationContext(MyApplicationTest.class);
    }

    @After
    public void tearDown() {
        context.close();
    }

    @Test
    public void test() {
        MyApplication app = context.getBean(MyApplication.class);
        Assert.assertTrue(app.processMessage("Hi Pankaj", "pankaj@abc.com"));
    }
}

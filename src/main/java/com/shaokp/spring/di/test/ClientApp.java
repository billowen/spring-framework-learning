package com.shaokp.spring.di.test;

import com.shaokp.spring.di.config.DIConfiguration;
import com.shaokp.spring.di.consumer.MyApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ClientApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DIConfiguration.class);
        MyApplication app = context.getBean(MyApplication.class);
        app.processMessage("Hi Pankaj", "pankaj@abc.com");

        context.close();
    }
}

package com.shaokp.java.dependencyinjection.injector;

import com.shaokp.java.dependencyinjection.consumer.Consumer;

public interface MessageServiceInjector {
    Consumer getConsumer();
}

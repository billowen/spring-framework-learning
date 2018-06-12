package com.shaokp.spring.aop.config;

import com.shaokp.spring.aop.aspect.EmployeeAspect;
import com.shaokp.spring.aop.model.Employee;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan(value = {"com.shaokp.spring.aop.service"})
@ComponentScan(value = {"com.shaokp.spring.aop.aspect"})
public class AOPConfiguration {
    @Bean
    public Employee getEmployee() {
        Employee e = new Employee();
        e.setName("shaokp");
        return e;
    }

    @Bean
    public EmployeeAspect getEmployeeAspect() {
        return new EmployeeAspect();
    }
}


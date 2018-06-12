package com.shaokp.spring.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.Configuration;

@Aspect
public class EmployeeAspect {
    @Before("execution(public String getName())")
    public void getNameAdvice() {
        System.out.println("Executing Advice on getName()");
    }

    @Before("execution(* com.shaokp.spring.aop.service.*.get*())")
    public void getAllAdvice() {
        System.out.println("Service method getter called");
    }

}

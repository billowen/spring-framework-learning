package com.shaokp.spring.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class EmployeeAnnotationAspect {
    @Before("@annotation(com.shaokp.spring.aop.aspect.Loggable)")
    public void myAdvice() {
        System.out.println("Executing advice");
    }
}

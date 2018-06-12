package com.shaokp.spring.aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

import java.util.Arrays;

@Aspect
public class EmployeeAspectJoinPoint {
    @Before("execution(public void com.shaokp.spring.aop.model..set*(*))")
    public void loggingAdvice(JoinPoint joinPoint) {
        System.out.println("Before running loggingAdvice on method = " + joinPoint.toString());
        System.out.println("Agruments passed = " + Arrays.toString(joinPoint.getArgs()));
    }

    @Before("args(name)")
    public void logStringArguments(String name) {
        System.out.println("String argument passed = " + name);
    }
}

package com.shaokp.spring.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class EmployeeAspectPointcut {

    @Before("getNamePointcut()")
    public void loggingAdvice() {
        System.out.println("Executing loggingAdvice on getName");
    }

    @Before("getNamePointcut()")
    public void secondAdvice() {
        System.out.println("Executing secondAdvice on getName");
    }

    @Pointcut("execution(public String getName())")
    public void getNamePointcut() {}

    @Before("addMethodPointcut()")
    public void allServiceMethodAdvice() {
        System.out.println("Before executing service method");
    }

    @Pointcut("within(com.shaokp.spring.aop.service.*)")
    public void addMethodPointcut() {}
}

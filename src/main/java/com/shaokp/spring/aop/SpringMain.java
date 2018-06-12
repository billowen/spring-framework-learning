package com.shaokp.spring.aop;

import com.shaokp.spring.aop.config.AOPConfiguration;
import com.shaokp.spring.aop.service.EmployeeService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringMain {
    public static void main(String[] args) {
//        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AOPConfiguration.class);
//        EmployeeService app = ctx.getBean(EmployeeService.class);
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
        EmployeeService app = ctx.getBean("employeeService", EmployeeService.class);
        System.out.println(app.getEmployee().getName());
        app.getEmployee().setName("ivy");
        //app.getEmployee().throwException();
        ctx.close();

    }
}

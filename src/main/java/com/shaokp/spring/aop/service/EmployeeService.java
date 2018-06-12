package com.shaokp.spring.aop.service;

import com.shaokp.spring.aop.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmployeeService {
    private Employee employee;

    public Employee getEmployee() {
        return employee;
    }

    @Autowired
    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
}

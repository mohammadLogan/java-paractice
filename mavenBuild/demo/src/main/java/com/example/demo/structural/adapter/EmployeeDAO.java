package com.example.demo.structural.adapter;

public class EmployeeDAO {

    public void save(Employee employee){
        System.out.println("save "+ employee.getFullName()+" "+employee.getId()+" "+employee.getCode());
    };
}

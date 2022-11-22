package com.example.demo.structural.adapter;

public class EmployeeAdapter extends Employee {

    private EmployeeDTO employeeDTO;

    public EmployeeAdapter(EmployeeDTO employeeDTO) {
        this.employeeDTO = employeeDTO;
    }

    @Override
    public String getFullName() {
        return employeeDTO.getFirstName()+" "+employeeDTO.getLastName();
    }

    @Override
    public Long getId() {
        return employeeDTO.getId();
    }

    @Override
    public String getCode() {
        return employeeDTO.getCode();
    }
}

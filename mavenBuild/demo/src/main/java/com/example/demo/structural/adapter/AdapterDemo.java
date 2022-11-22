package com.example.demo.structural.adapter;

public class AdapterDemo {
    public static void main(String[] args) {
        EmployeeDAO employeeDAO=new EmployeeDAO();
        employeeDAO.save(new EmployeeAdapter(new EmployeeDTO()));
    }
}

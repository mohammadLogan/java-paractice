package com.example.demo.structural.adapter;

public record Employee2(Long id,String name,String code) {

    public static void main(String[] args) {
        Employee2 employee=new Employee2(12L,"12l","2kk");
        Employee2 anotherEmployee=new Employee2(12L,"12l","2kk");
        if (employee.equals(anotherEmployee))
            System.out.println("equals: "+employee.hashCode() +" "+anotherEmployee.hashCode());
        else
            System.out.println("not equals: "+employee.hashCode() +" "+anotherEmployee.hashCode());
    }
}

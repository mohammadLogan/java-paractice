package com.example.demo.structural.adapter;

public class Demo {

    public static void main(String[] args) {
        Employee2 employee2=new Employee2(12l,"mohammad","1sjsfsa");
        Employee2 employee3=new Employee2(12l,"mohammad","1sjsfsa");
        System.out.println(employee2.hashCode());
        System.out.println(employee3.hashCode());
    }
}

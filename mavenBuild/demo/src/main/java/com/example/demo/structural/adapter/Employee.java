package com.example.demo.structural.adapter;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Employee {

    private Long id;
    private String fullName;
    private String code;


    public static void main(String[] args) {
       Employee employee=new Employee(12l,"12l","2kk");
       Employee anotherEmployee=new Employee(12l,"12l","2kk");
       if (employee.equals(anotherEmployee))
           System.out.println("equals: "+employee.hashCode() +" "+anotherEmployee.hashCode());
       else
           System.out.println("not equals: "+employee.hashCode() +" "+anotherEmployee.hashCode());
    }


}

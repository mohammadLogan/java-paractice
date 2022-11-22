package com.example.demo;

import com.example.demo.creational.factory.CalculateFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {

        SpringApplication.run(DemoApplication.class, args);
        CalculateFactory calculateFactory = new CalculateFactory();
        System.out.println(calculateFactory.computeCalculation(100, "mobile", 2, true));
        System.out.println(calculateFactory.computeCalculation(100, "iron", 4, false));

    }

}

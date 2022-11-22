package com.example.demo.creational.builder;

public class MainBuilder {

    public static void main(String[] args) {
        BuilderSample builder = new BuilderSample.BuilderSampleBuilder().setFamily("nattaj").setName("mohammad").build();
        System.out.println("builder.Name = " + builder.getName());
        System.out.println("builder.Family = " + builder.getFamily());

        System.out.println(builder.hashCode());
        System.out.println(builder.getAddress().hashCode());
    }
}

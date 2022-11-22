package com.example.demo.creational.prototype;

public class MainPrototype {
    public static void main(String[] args) {
        Sample2 sample2 = new Sample2();
        Sample sample = new Sample.SampleBuilder().setFamily("nattaj")
                .setName("mamad")
                .setAge(39)
                .setSample2(sample2)
                .build();
        Sample clone = sample.clone();
        Sample clone2 = sample.clone();

        System.out.println("SAMPLE = " + sample.hashCode());
        System.out.println("CLONE = " + clone.hashCode());
        System.out.println("CLONE2 = " + clone2.hashCode());

        System.out.println("sample2 = " + sample2.hashCode());
        System.out.println("sample.sample2 = " + sample.getSample2().hashCode());
        System.out.println("clone.sample2 = " + clone.getSample2().hashCode());

        System.out.println("sample.getName = " + sample.getName().hashCode());
        System.out.println("clone.getName = " + clone.getName().hashCode());
        System.out.println("clone2.getName = " + clone2.getName().hashCode());

    }
}

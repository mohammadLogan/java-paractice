package com.example.demo.structural.proxy;

import org.yaml.snakeyaml.constructor.Constructor;

public class ProxyDemo {

    public int plus(int x, int y) {
        return x + y;
    }

    public static void main(String[] args) throws Exception {
        Class<?> aClass = Class.forName("com.example.demo.structural.proxy.ProxyDemo");
        Object testObject = aClass.getConstructor().newInstance();
        Object plus = testObject.getClass().getMethod("plus", int.class, int.class).invoke(testObject, 10, 10);
        System.out.println(plus);
    }
}

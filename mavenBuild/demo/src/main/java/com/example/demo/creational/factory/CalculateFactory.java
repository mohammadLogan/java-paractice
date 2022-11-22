package com.example.demo.creational.factory;

public class CalculateFactory {

    public String computeCalculation(int price, String product, int tax, boolean electronicDevice) {
        if (electronicDevice) {
            ElectronicDevices electronicDevices=new ElectronicDevices(price, product, tax);
            return electronicDevices.calculate(price,product,tax);
        } else {
            IndustrialMaterials industrialMaterials=new IndustrialMaterials(price, product, tax);
            return industrialMaterials.calculate(price,product,tax);}
    }
}

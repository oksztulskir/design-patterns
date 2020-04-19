package com.sda.patterns.factory;

/**
 */
public class SimpleCarFactoryTest {
    public static void main(String[] args) {
        CarManufacture carManufacture = new CarManufacture(new CarSimpleFactory());
        carManufacture.produceCar(CarType.AUDI);
        carManufacture.produceCar(CarType.FIAT);
    }
}

package com.sda.patterns.factory;

/**
 */
public class CarSimpleFactory {
    public Car getCar(CarType type) {
        if (CarType.AUDI.equals(type)) {
            return new Audi();
        } else if (CarType.FIAT.equals(type)) {
            return new Fiat();
        } else {
            throw new RuntimeException("Provided type not supported!");
        }
    }
}

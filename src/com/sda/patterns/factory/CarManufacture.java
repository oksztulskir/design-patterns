package com.sda.patterns.factory;

/**
 */
public class CarManufacture {
    private CarSimpleFactory factory;

    public CarManufacture(CarSimpleFactory factory) {
        this.factory = factory;
    }

    public void produceCar(CarType type) {
        final Car car = factory.getCar(type);
        car.start();
        car.accelerate();
        car.stop();
    }
}

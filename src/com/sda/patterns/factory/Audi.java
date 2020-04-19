package com.sda.patterns.factory;

/**
 */
public class Audi implements Car {
    @Override
    public void start() {
        System.out.println("Starting Audi");
    }

    @Override
    public void accelerate() {
        System.out.println("Accelerating Audi");
    }

    @Override
    public void stop() {
        System.out.println("Stopping Audi");
    }
}

package com.sda.patterns.factory;

/**
 */
public class Fiat implements Car {
    @Override
    public void start() {
        System.out.println("Starting Fiat");
    }

    @Override
    public void accelerate() {
        System.out.println("Accelerating Fiat");
    }

    @Override
    public void stop() {
        System.out.println("Stopping Fiat");
    }
}

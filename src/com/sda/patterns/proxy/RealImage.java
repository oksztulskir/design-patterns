package com.sda.patterns.proxy;

/**
 */
public class RealImage implements Image {
    @Override
    public void display() {
        System.out.println("Image already downloaded. This is image content!");
    }
}

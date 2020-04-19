package com.sda.patterns.proxy;

/**
 */
public class ProxyImage implements Image {
    private RealImage realImage;
    private String fileName;

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if (realImage == null) {
            System.out.println("File " + fileName + " is loading. Please wait ...");
            realImage = new RealImage();
        } else {
            realImage.display();
        }
    }
}

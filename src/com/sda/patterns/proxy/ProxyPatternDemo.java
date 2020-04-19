package com.sda.patterns.proxy;

/**
 */
public class ProxyPatternDemo {
    public static void main(String[] args) {
        Image proxyImage = new ProxyImage("test_file.mp4");
        proxyImage.display(); // 1
        proxyImage.display(); // 2
    }
}

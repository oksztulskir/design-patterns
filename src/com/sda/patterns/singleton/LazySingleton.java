package com.sda.patterns.singleton;

/**
 */
public class LazySingleton {
    private static LazySingleton instance;

    private LazySingleton() {
        // NOP
    }

    public static LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }

    public void printInfo() {
        System.out.println("This is LAZY singleton instance!");
    }
}

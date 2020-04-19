package com.sda.patterns.singleton;

/**
 */
public class PatternsTest {
    public static void main(String[] args) {
        LazySingleton lazySingleton = LazySingleton.getInstance();
        lazySingleton.printInfo();
        System.out.println(lazySingleton);

        LazySingleton secondSingleton = LazySingleton.getInstance();
        System.out.println(secondSingleton);
    }
}

package com.sda.patterns.builder;

/**
 */
public class BuilderExample {

    public static void main(String[] args) {
        MyCar myCar = MyCar.builder()
                .description("My favourite car")
                .name("Audi")
                .build();

        System.out.println(myCar);
    }
}

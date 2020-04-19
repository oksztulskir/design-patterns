package com.sda.patterns.observer;

/**
 */
public class Reader implements Observer {
    private String name;

    Reader(String name) {
        this.name = name;
    }

    @Override
    public void update(String publishedData) {
        System.out.println("Reader " + name + ", new article published: " + publishedData);
    }
}

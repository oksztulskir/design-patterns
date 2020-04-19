package com.sda.patterns.observer;

/**
 */
public interface Observable {
    void attach(Observer observer);
    void detach(Observer observer);
    void publish(String publishedData);
}

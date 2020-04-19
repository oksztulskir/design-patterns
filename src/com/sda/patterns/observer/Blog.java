package com.sda.patterns.observer;

import java.util.ArrayList;
import java.util.List;

public class Blog implements Observable {
    private List<Observer> observers = new ArrayList<>();

    @Override
    public void attach(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void publish(String publishedArticle) {
        observers.forEach(observer -> observer.update(publishedArticle));
    }
}

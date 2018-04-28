package com.kodilla.pattern2.observer.forum;

import java.util.ArrayList;
import java.util.List;

public class ForumTopic implements Observable {

    private final List<ObserverAAA> observers;
    private final List<String> messeges;
    private final String name;

    public ForumTopic(String name) {
        observers = new ArrayList<>();
        messeges = new ArrayList<>();
        this.name = name;
    }

    public void addPost(String post) {
        messeges.add(post);
        notifyObservers();
    }


    @Override
    public void registerObserver(ObserverAAA observerAAA) {
        observers.add(observerAAA);
    }

    @Override
    public void notifyObservers() {
        for (ObserverAAA observerAAA : observers) {
            observerAAA.update(this);
        }
    }

    @Override
    public void removeObserver(ObserverAAA observerAAA) {
        observers.remove(observerAAA);
    }

    public List<String> getMesseges() {
        return messeges;
    }

    public String getName() {
        return name;
    }
}
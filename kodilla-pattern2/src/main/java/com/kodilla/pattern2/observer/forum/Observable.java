package com.kodilla.pattern2.observer.forum;

public interface Observable {

    void registerObserver(ObserverAAA observerAAA);
    void notifyObservers();
    void removeObserver(ObserverAAA observerAAA);
}

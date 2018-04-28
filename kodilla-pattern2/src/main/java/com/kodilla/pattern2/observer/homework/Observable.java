package com.kodilla.pattern2.observer.homework;

import java.util.Observer;

public interface Observable {

    void registerObserver (ObserverHomework observerHomework);
    void notifyObserver();
    void removeObserver (ObserverHomework observerHomework);
}

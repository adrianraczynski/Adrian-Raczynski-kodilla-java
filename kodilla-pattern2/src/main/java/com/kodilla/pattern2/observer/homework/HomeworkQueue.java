package com.kodilla.pattern2.observer.homework;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;


public class HomeworkQueue implements Observable {

    private final List<ObserverHomework> mentors;
    private final Deque<String> homeworks;
    private final String homeworkName;

    public HomeworkQueue(String homeworkName) {
        this.mentors = new ArrayList<>();
        this.homeworks = new ArrayDeque<>();
        this.homeworkName = homeworkName;
    }


    @Override
    public void registerObserver(ObserverHomework observerHomework) {

    }

    @Override
    public void notifyObserver() {

    }

    @Override
    public void removeObserver(ObserverHomework observerHomework) {

    }

    public void addExercise (String exercise) {
        homeworks.add(exercise);
        notifyObserver();
    }
}

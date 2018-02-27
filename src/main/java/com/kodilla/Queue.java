package com.kodilla;

import java.util.ArrayDeque;
import java.util.Random;

public class Queue {

    public ArrayDeque<String> queueMaker() {

        Random theGenerator = new Random();
        ArrayDeque<String> listOfA = new ArrayDeque<>();
        for (int n = 0; n < 50; n++) {
            listOfA.offer(new Inscription().generateRepeatingA('a', theGenerator.nextInt(50)));
        }
        return listOfA;
    }
}
package com.kodilla;

import java.util.ArrayDeque;
import java.util.ArrayList;

public class SeparationQueue {

    public void separationQueueProcessor (ArrayDeque<String> list) {

        ArrayList <String> listOfEvenA = new ArrayList();
        ArrayList <String> listOfOddA = new ArrayList();

        for (int i=0; i <list.size(); i++) {

            if (list.peek().length() % 2 != 0) {

                listOfEvenA.add(list.poll());

            } else {

                listOfOddA.add(list.poll());

            }
        }

        System.out.println("List of even 'a': " + listOfEvenA + "\n" + "Number of elements in even list: " + listOfEvenA.size() + "\n"

                            + "\n" + "List of odd 'a': " + listOfOddA + "\n" + "Number of elements in odd list: " + listOfOddA.size());

        }
}

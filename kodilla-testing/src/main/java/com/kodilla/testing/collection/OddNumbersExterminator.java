package com.kodilla.testing.collection;

import java.util.*;
import java.lang.*;


public class OddNumbersExterminator {

    private ArrayList<Integer> numbers;

    public ArrayList<Integer> exterminate(ArrayList<Integer> numbers) {

        List <Integer> numbersList = new ArrayList<Integer> ();
        int valueZero = 0;
        for (int i = 0; i < numbers.size(); i++) {
            valueZero = numbers.get (i);
            if (valueZero % 2 == 0) {
                numbersList.add(valueZero);
            }
        }
        return (ArrayList<Integer>) numbersList;
    }
}

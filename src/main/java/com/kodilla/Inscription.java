package com.kodilla;


public class Inscription {

    public String generateRepeatingA (char a, int n) {

        StringBuilder listOfA = new StringBuilder();
        for (int i = 0; i < n; i++)
            listOfA.append(a);
        return listOfA.toString();
    }
}
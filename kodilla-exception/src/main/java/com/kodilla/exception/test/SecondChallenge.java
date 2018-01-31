package com.kodilla.exception.test;

public class SecondChallenge {
    public String probablyIWillThrowException(double x, double y) throws Exception {

        try {

            if(x >= 2 || x < 1 || y == 1.5) {
                throw new Exception();
            }
        } catch (IllegalArgumentException e) {

            System.out.println("Yoy can't do that :(" + e);

        } finally {

            System.out.println("Change argument!");
        }

        return "Done!";
    }
}
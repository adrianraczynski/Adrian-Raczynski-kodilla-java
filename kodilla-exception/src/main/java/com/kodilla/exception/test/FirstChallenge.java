package com.kodilla.exception.test;

import java.io.IOException;

public class FirstChallenge {

    public double divide(double a, double b) throws ArithmeticException {

       try {

           if(b == 0){
               throw new ArithmeticException();
           } else {
               return a/b;
           }

       } catch (RuntimeException e) {

            System.out.println("Yoy can't do that :(" + e);

        } finally {

            System.out.println("Mathematic is soo beautiful...");

        }
        return a/b;
    }


    /**
     * This main can throw an ArithmeticException!!!
     * @param args
     */
    public static void main(String[] args) {

        FirstChallenge firstChallenge = new FirstChallenge();

        System.out.println(firstChallenge.divide(3.1, 0.0));
    }
}
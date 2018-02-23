package com.kodilla.spring.calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Calculator {

    @Autowired
    private Display display;


    public double add (double a, double b) {
        double adding = a + b;
        display.displayValue(adding);

        return adding;
    }

    public double sub (double a, double b) {
        double subtraction = a - b;
        display.displayValue(subtraction);

        return subtraction;
    }

    public double mul (double a, double b) {
        double multiplying = a * b;
        display.displayValue(multiplying);

        return multiplying;
    }

    public double div (double a,double b) {
        double dividing = a / b;
        display.displayValue(dividing);

        return dividing;
    }
}
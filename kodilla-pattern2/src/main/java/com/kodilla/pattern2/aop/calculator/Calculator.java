package com.kodilla.pattern2.aop.calculator;

import org.springframework.stereotype.Component;
import java.math.BigDecimal;

@Component
public class Calculator {

    public double add(double a, double b) {
        return a + b;
    }

    public double sub(double a, double b) {
        return a - b;
    }

    public double mul(double a, double b) {
        return a * b;
    }

    public double div(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Divide by zero!");
        }
        return a / b;
    }
}

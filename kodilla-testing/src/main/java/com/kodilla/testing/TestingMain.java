package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[] args){
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")){
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }


        // tu umieść kolejny test ->
        System.out.println("\n" + "Test - pierwszy test jednostkowy:");

        Calculator myCalculator = new Calculator(40,32);

        int adding = myCalculator.add();
        int substraction = myCalculator.subtract();

        if (adding == 72){
            System.out.println("adding test is OK");
        } else {
            System.out.println("Error! Back to school, moron.");
        }

        if (substraction == 8){
            System.out.println("subtraction test is OK");
        } else {
            System.out.println("Error! Back to school, moron.");
        }
    }
}
package com.kodilla.rps;

import java.util.Random;

public class PlayerComputer implements Player {

    private Random generator = new Random();

    public String makeMove () {

        String mark = Integer.toString(generator.nextInt(3)+1);
        System.out.println("Computer choose: " + RpsParser.xyz(mark));
        return mark;
    }

    @Override
    public String getName() {
        return "Computer Player";
    }
}


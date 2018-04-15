package com.kodilla.rps;


import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class PlayerHuman implements Player {

    private String nickPlayer;
    private Scanner scanner = new Scanner(System.in);
    private final List<String> signs = Arrays.asList("1", "2", "3", "r", "x");

    public PlayerHuman( String nickPlayer) {
        this.nickPlayer = nickPlayer;
    }

    public String makeMove () {

        String mark = scanner.next();
        while (!signs.contains(mark)) {
            System.out.println("Please choose different mark. Just like in game rules." );
            mark = scanner.next();
        }
        System.out.println("\n" + "Player choose: " + RpsParser.giveName(mark));
        return mark;
    }

    public String getName() {
        return nickPlayer;
    }
}
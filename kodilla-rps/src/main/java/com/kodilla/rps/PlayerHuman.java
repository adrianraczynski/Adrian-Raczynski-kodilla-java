package com.kodilla.rps;


import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class PlayerHuman implements Player {

    private String namePlayer;
    private String surname;
    private String nickPlayer;
    private int agePlayer;
    private Scanner scanner = new Scanner(System.in);
    private final List<String> signs = Arrays.asList("1", "2", "3", "r", "x");

    public PlayerHuman(String namePlayer, String surname, String nickPlayer, int agePlayer) {
        this.namePlayer = namePlayer;
        this.surname = surname;
        this.nickPlayer = nickPlayer;
        this.agePlayer = agePlayer;
    }

    public String makeMove () {

        String mark = scanner.next();
        while (!signs.contains(mark)) {
            System.out.println("Please choose different mark. Just like in game rules." );
            mark = scanner.next();
        }
        System.out.println("Player choose: " + RpsParser.giveName(mark));
        return mark;
    }

    public String getNamePlayer() {
        return namePlayer;
    }

    public String getName() {
        return surname;
    }

    public int getAgePlayer() {
        return agePlayer;
    }

    public String getNickPlayer() {
        return nickPlayer;
    }


}

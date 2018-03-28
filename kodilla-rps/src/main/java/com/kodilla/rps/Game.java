package com.kodilla.rps;

import java.util.Scanner;

public class Game {

    private PlayerHuman playerHuman;
    private PlayerComputer playerComputer;
    private int numberOfRounds;
    private Scanner scanner = new Scanner(System.in);
    int humanCounter = 0;
    int computerCounter = 0;


    public Game(PlayerHuman playerHuman, PlayerComputer playerComputer, int numberOfRounds) {
        this.playerHuman = playerHuman;
        this.playerComputer = playerComputer;
        this.numberOfRounds = numberOfRounds;
    }

    public void xxx () { //tutaj testujemy przypadki  porownujemy

        String humanSign = playerHuman.makeMove();
        String computerSign = playerComputer.makeMove();

        int humanSignINT = Integer.parseInt(humanSign);
        int computerSignINT = Integer.parseInt(computerSign);

        if (computerSignINT == 1 && humanSignINT == 2) {
            humanCounter++;

        } else if (computerSignINT == 1 && humanSignINT == 3) {  //podać warunek, tutaj będzie pętla while
            computerCounter++;

        } else if (computerSignINT == 2 && humanSignINT == 1) {
            computerCounter++;

        } else if (computerSignINT == 2 && humanSignINT == 3) {
            humanCounter++;

        } else if (computerSignINT == 3 && humanSignINT == 1) {
            humanCounter++;

        } else if (computerSignINT == 3 && humanSignINT == 2) {
            computerCounter++;

        } else if (computerSignINT == 1 && humanSignINT == 1) {
            System.out.println("Draw the game. Try again...");

        } else if (computerSignINT == 2 && humanSignINT == 2) {
            System.out.println("Draw the game. Try again...");

        } else {        //tutaj przpadek kiedy będzie po 3 z każdej strony
            System.out.println("Draw the game. Try again...");
        }




    }





}

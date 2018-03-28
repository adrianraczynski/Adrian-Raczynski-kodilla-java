package com.kodilla.rps;


import java.util.Scanner;

public class RpsRunner {

    public static void main(String[] args){

        PlayerComputer playerComputer = new PlayerComputer();

        String nickName = selectName();
        PlayerHuman playerHuman = new PlayerHuman("Adrian", "Raczynski", nickName, 26);

        int numberOfRounds = selectRound();
        Game game = new Game (playerHuman, playerComputer, numberOfRounds);

    }

    private static String selectName() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your nick name: ");
        String nickPlayer = scanner.next();
        System.out.println("Your nick is: " + nickPlayer + "\n");
        scanner.close();

        return nickPlayer;
    }

    private static int selectRound() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose the number of rounds until the end of the game (1-5): ");
        int roundNumber = scanner.nextInt();
        System.out.println("Number of rounds: " + roundNumber + "\n");
        scanner.close();

        return roundNumber;

    }

    private static void showGameRules() {

        System.out.println("Game rules:" + "\n"
                + "Button 1 on the keyboard - select ROCK." + "\n"
                + "Button 2                 - select PAPER." + "\n"
                + "Button 3                 - select SCISSORS." + "\n"
                + "Button x                 - END of the game." + "\n" //poprzedzone pytaniem "Czy na pewno zakończyć grę?"
                + "Button n                 - RESTART game." + "\n"    //poprzedzone pytaniem "Czy na pewno zakończyć aktualną grę?"
        );

        System.out.println ("Let's start GAME..." + "Please make a move!");
    }
}

package com.kodilla.rps;

import java.util.Scanner;

import static com.kodilla.rps.RpsRunner.selectRound;
import static com.kodilla.rps.RpsRunner.showGameRules;

public class Game {

    private PlayerHuman playerHuman;
    private PlayerComputer playerComputer;
    private int numberOfRounds;
    private Scanner scanner = new Scanner(System.in);
    private int roundCounter = 0;                        //czy tutaj ma być private???????????
    private int humanCounter = 0;
    private int computerCounter = 0;

    public Game(PlayerHuman playerHuman, PlayerComputer playerComputer, int numberOfRounds) {
        this.playerHuman = playerHuman;
        this.playerComputer = playerComputer;
        this.numberOfRounds = numberOfRounds;
    }

    public void play() {

        while (roundCounter < numberOfRounds) {

            String humanSign = playerHuman.makeMove();
            String computerSign = playerComputer.makeMove();

            if (humanSign.equals("x")) {
                System.out.println("Game over :)");
                break;

            } else if (humanSign.equals("r")) {
                System.out.println("Restart game...");
                restartGame();
                continue;
            }

            int humanSignINT = Integer.parseInt(humanSign);
            int computerSignINT = Integer.parseInt(computerSign);

            if ((computerSignINT == 1 && humanSignINT == 2) || (computerSignINT == 2 && humanSignINT == 3) || (computerSignINT == 3 && humanSignINT == 1)) {
                humanCounter++;

            } else if ((computerSignINT == 1 && humanSignINT == 3) || (computerSignINT == 2 && humanSignINT == 1) || (computerSignINT == 3 && humanSignINT == 2)) {
                computerCounter++;

            } else {                    //tutaj przpadek kiedy będzie po 3 z każdej strony
                System.out.println("The round ended in a draw. Try again...");

            }
            roundCounter++;
        }
    }

    private void restartGame() {

        roundCounter = 0;
        humanCounter = 0;
        computerCounter = 0;

        System.out.println("Restart game...");
    }

    public void showScore () {

        System.out.println("Player points: " + humanCounter);
        System.out.println("Computer points: " + computerCounter);
    }
}

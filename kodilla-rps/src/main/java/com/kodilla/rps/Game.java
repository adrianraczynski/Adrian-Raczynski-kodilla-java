package com.kodilla.rps;

public class Game {

    private PlayerHuman playerHuman;
    private PlayerComputer playerComputer;
    private int numberOfRounds;
    private int roundCounter = 0;
    private RpsPointsCounter rpsPointsCounter = new RpsPointsCounter();
    private ShowScore showScore = new ShowScore();

    public Game(PlayerHuman playerHuman, PlayerComputer playerComputer, int numberOfRounds) {
        this.playerHuman = playerHuman;
        this.playerComputer = playerComputer;
        this.numberOfRounds = numberOfRounds;
    }

    public void play() {

        while (roundCounter < numberOfRounds) {

            System.out.println("ROUND NUMBER: " + (roundCounter + 1));

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


            if (humanSign.equals("1") || humanSign.equals("2") || humanSign.equals("3")){
                rpsPointsCounter.pointsCounterMechanism(humanSign, computerSign);
                rpsPointsCounter.showPoints();
            } else {
                System.out.println("Please choose mark from the keyboard");
            }

            //if (roundCounter == numberOfRounds) {
            //    System.out.println("Game is over. The winner is: " );
            //}

            roundCounter++;
        }
    }

    private void restartGame() {

        roundCounter = 0;
        rpsPointsCounter.resetPoints();

        System.out.println("Restart game...");
    }
}

package com.kodilla.rps;

public class ShowScore {

   RpsPointsCounter rpsPointsCounter;
    int humanCounter;
    int computerCounter;

    public void showPoints (int humanCounter, int computerCounter) {

        System.out.println("Player points: " + humanCounter);
        System.out.println("Computer points: " + computerCounter);
    }
}

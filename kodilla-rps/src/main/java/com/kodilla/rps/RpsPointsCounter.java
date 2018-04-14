package com.kodilla.rps;

public class RpsPointsCounter {

    private int humanCounter = 0;
    private int computerCounter = 0;

    public void pointsCounterMechanism(String humanSign, String computerSign) {

        int humanSignINT = Integer.parseInt(humanSign);
        int computerSignINT = Integer.parseInt(computerSign);

        if ((computerSignINT == 1 && humanSignINT == 2) || (computerSignINT == 2 && humanSignINT == 3) || (computerSignINT == 3 && humanSignINT == 1)) {
            humanCounter++;

        } else if ((computerSignINT == 1 && humanSignINT == 3) || (computerSignINT == 2 && humanSignINT == 1) || (computerSignINT == 3 && humanSignINT == 2)) {
            computerCounter++;

        } else {                    //tutaj przpadek kiedy będzie po 3 z każdej strony
            System.out.println("The round ended in a draw. Try again...");
        }
    }

    public void resetPoints () {
        humanCounter = 0;
        computerCounter = 0;
    }
}
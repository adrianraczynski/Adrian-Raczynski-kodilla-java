package com.kodilla.rps;

public class RpsParser {

    private static final String PAPER = "paper";
    private static final String ROCK = "rock";
    private static final String SCISSORS = "scissors";
    private static final String NONE = "none";

    private RpsParser() {
    }

    public static String giveName (String mark) {
        if (mark.equals("1")) {
            return ROCK;

        } else if (mark.equals("2")) {
            return PAPER;

        } else if (mark.equals("3")) {
            return SCISSORS;

        } else {
            return NONE;
        }

    }
}

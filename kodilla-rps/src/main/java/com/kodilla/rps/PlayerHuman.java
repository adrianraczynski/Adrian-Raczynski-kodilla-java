package com.kodilla.rps;

import java.util.Objects;

public class PlayerHuman implements Player {

    private String namePlayer;
    private String surnamePlayer;
    private int AgePlayer;

    public PlayerHuman(String namePlayer, String surnamePlayer, int agePlayer) {
        this.namePlayer = namePlayer;
        this.surnamePlayer = surnamePlayer;
        AgePlayer = agePlayer;
    }

    public String getNamePlayer() {
        return namePlayer;
    }

    public String getSurnamePlayer() {
        return surnamePlayer;
    }

    public int getAgePlayer() {
        return AgePlayer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PlayerHuman)) return false;
        PlayerHuman playerHuman = (PlayerHuman) o;
        return AgePlayer == playerHuman.AgePlayer &&
                Objects.equals(namePlayer, playerHuman.namePlayer) &&
                Objects.equals(surnamePlayer, playerHuman.surnamePlayer);
    }

    @Override
    public int hashCode() {

        return 7*Objects.hash(namePlayer, surnamePlayer, AgePlayer);
    }
}

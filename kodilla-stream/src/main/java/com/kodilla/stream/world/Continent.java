package com.kodilla.stream.world;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Continent {

    private String continentName;
    private Set<Country> continentCountries;

    public Continent(String continentName, Set<Country> continentCountries) {
        this.continentName = continentName;
        this.continentCountries = continentCountries;
    }

    public Set<Country> getContinentCountry (){
        return continentCountries;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Continent)) return false;
        Continent continent = (Continent) o;
        return Objects.equals(continentName, continent.continentName) &&
                Objects.equals(continentCountries, continent.continentCountries);
    }

    @Override
    public int hashCode() {

        return Objects.hash(continentName, continentCountries);
    }
}

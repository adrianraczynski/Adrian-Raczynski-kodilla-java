package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class World {

    private Set<Continent> continentList = new HashSet<>();

    public World(Set<Continent> continentList) {
        this.continentList = continentList;
    }

    public BigDecimal getPeopleQuantity() {
        return continentList.stream()
                .flatMap(continent -> continent.getContinentCountry().stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO,(sum,current) ->sum = sum.add(current));
    }
}


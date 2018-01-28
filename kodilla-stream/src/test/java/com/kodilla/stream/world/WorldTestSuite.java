package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

public class WorldTestSuite {


    @Test
    public void getPeopleQuantity(){    //Jeszcze nie jest zrobione
        //Given
        Country country1 = new Country("Poland",new BigDecimal(38000000));
        Country country2 = new Country("Germany",new BigDecimal(80000000));
        Country country3 = new Country("Czech Republic",new BigDecimal(10500000));
        Country country4 = new Country("France",new BigDecimal(67000000));
        Country country5 = new Country("Sweden",new BigDecimal(9900000));
        Country country6 = new Country("USA",new BigDecimal(326000000));
        Country country7 = new Country("Canada", new BigDecimal(36700000));
        Country country8 = new Country("Mexico", new BigDecimal(127500000));
        Country country9 = new Country("Peru", new BigDecimal(31000000));
        Country country10 = new Country("Argentina", new BigDecimal(43850000));
        Country country11 = new Country("Brazil", new BigDecimal(207700000));
        Country country12 = new Country("Ecuador", new BigDecimal(16290000));
        Country country13 = new Country("Chile", new BigDecimal(17910000));
        Country country14 = new Country("Paraguay", new BigDecimal(6725000));

        Set<Country> europe = new HashSet<>();
            europe.add(country1);
            europe.add(country2);
            europe.add(country3);
            europe.add(country4);
            europe.add(country5);

        Set<Country> northAmerica = new HashSet<>();
            northAmerica.add(country6);
            northAmerica.add(country7);
            northAmerica.add(country8);

        Set<Country> southAmerica = new HashSet<>();
            southAmerica.add(country9);
            southAmerica.add(country10);
            southAmerica.add(country11);
            southAmerica.add(country12);
            southAmerica.add(country13);
            southAmerica.add(country14);

        Continent continentEU = new Continent ("Europe", europe);
        Continent continentNA = new Continent ("NorthAmerica", northAmerica);
        Continent continentSA = new Continent ("SouthAmerica", southAmerica);

        Set<Continent> continentsList = new HashSet<>();
            continentsList.add(continentEU);
            continentsList.add(continentNA);
            continentsList.add(continentSA);

        //When
        World objectWorld = new World(continentsList);
        BigDecimal totalPeopleNumber = objectWorld.getPeopleQuantity();

        //Then
        BigDecimal expectedPeopleNumber = new BigDecimal("1019075000");
        Assert.assertEquals(expectedPeopleNumber, totalPeopleNumber);
    }
}
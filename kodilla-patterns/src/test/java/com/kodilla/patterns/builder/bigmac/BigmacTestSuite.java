package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {

    @Test
    public void testPizzaNew() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .roll ("Without sesame seeds")
                .burgers (2)
                .sauce ("Garlic sauce")
                .ingredients ("Bacon")
                .ingredients ("Onion")
                .ingredients ("Salad")
                .ingredients ("Blue cheese")
                .build();
        System.out.println(bigmac);

        //When
        int numberOfBurgers = bigmac.getBurgers();
        String typeSauce = bigmac.getSauce();
        int oneOfTheIngredients = bigmac.getIngredients().size();

        //Then
        Assert.assertEquals(2, numberOfBurgers,0);
        Assert.assertEquals("Garlic sauce", typeSauce);
        Assert.assertEquals(4, oneOfTheIngredients);
    }
}


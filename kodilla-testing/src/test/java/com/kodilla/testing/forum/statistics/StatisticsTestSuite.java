package com.kodilla.testing.forum.statistics;

import com.kodilla.testing.forum.statistics.Statistics;
import com.kodilla.testing.forum.statistics.CalculateForumStatistics;
import org.junit.Assert;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class Statistics {
    @Test
    public void testCalculateAdvStatistics () {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersNamesList = new ArrayList<String> ();
        usersNamesList.add ("Paweł");
        usersNamesList.add ("Adam");
        usersNamesList.add ("Kasia");
        usersNamesList.add ("Wojtek");
        usersNamesList.add ("Monika");
        usersNamesList.add ("Mateusz");
        usersNamesList.add ("Alicja");
        when(statisticsMock.usersNames().size()).thenReturn(usersNamesList);

        CalculateForumStatistics calculateForumStatistics = new CalculateForumStatistics (statisticsMock);

        //When
        int quantityOfUsers= calculateForumStatistics.calculateAdvStatistics().size();

        //Then
        Assert.assertEquals (7, quantityOfUsers );
    }
}

/**
W zadaniu do podrozdziału 6.5 jak przetestować poprawność obliczeń wartości średnich dla różnych przypadków? chodzi mi konretnie o zapis... zapisuje w assertEquals?
assertEquals(double expected, double actual, double delta); - delta jest to tolerowana roznica pomiedzy wartosciami np. 0.002
*/

/**
 Przetestuj poprawność obliczeń wartości średnich dla różnych przypadków:

 gdy liczba postów = 0
 gdy liczba postów = 1000
 gdy liczba komentarzy = 0
 gdy liczba komentarzy < liczba postów
 gdy liczba komentarzy > liczba postów
 gdy liczba użytkowników = 0
 gdy liczba użytkowników = 100

 */
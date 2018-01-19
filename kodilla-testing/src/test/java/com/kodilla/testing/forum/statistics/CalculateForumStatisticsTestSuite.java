package com.kodilla.testing.forum.statistics;

import org.junit.Assert;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CalculateForumStatisticsTestSuite {


    @Test
    public void testCalculateAdvStatisticsNumberOfPosts0 () {    // gdy liczba postów = 0
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.postsCount()).thenReturn(0);
        CalculateForumStatistics calculateForumStatistics = new CalculateForumStatistics (statisticsMock);

        //When
        int posts0 = calculateForumStatistics.postsCount();

        //Then
        Assert.assertEquals (0, posts0 );
    }

    @Test
    public void testCalculateAdvStatisticsNumberOfPosts1000 () {    //gdy liczba postów = 1000
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.postsCount()).thenReturn(1000);
        CalculateForumStatistics calculateForumStatistics = new CalculateForumStatistics (statisticsMock);

        //When
        int posts1000 = calculateForumStatistics.postsCount();

        //Then
        Assert.assertEquals (1000, posts1000 );
    }


     @Test
    public void testCalculateAdvStatisticsNumberOfComments0 () {    //gdy liczba komentarzy = 0
        //Given
        Statistics statisticsMock = mock(Statistics.class);

        when(statisticsMock.commentsCount()).thenReturn(0);
        CalculateForumStatistics calculateForumStatistics = new CalculateForumStatistics (statisticsMock);

        //When
        int comments0 = calculateForumStatistics.commentsCount();

        //Then
        Assert.assertEquals (0, comments0 );
    }

    /**
     @Test
    public void testCalculateAdvStatistics4 () {    // gdy liczba komentarzy < liczba postów
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersNamesList = new ArrayList<String>();
       ;
        when(statisticsMock.usersNames()).thenReturn(usersNamesList);
        CalculateForumStatistics calculateForumStatistics = new CalculateForumStatistics (statisticsMock);

        //When
        int quantityOfUsers= calculateForumStatistics.calculateAdvStatistics().size();

        //Then
        Assert.assertEquals (7, quantityOfUsers );
    }

     @Test
    public void testCalculateAdvStatistics5 () {    //gdy liczba komentarzy > liczba postów
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersNamesList = new ArrayList<String>();

        when(statisticsMock.usersNames()).thenReturn(usersNamesList);
        CalculateForumStatistics calculateForumStatistics = new CalculateForumStatistics (statisticsMock);

        //When
        int quantityOfUsers= calculateForumStatistics.calculateAdvStatistics().size();

        //Then
        Assert.assertEquals (7, quantityOfUsers );
    }

     **/

    @Test
    public void testCalculateAdvStatisticsNumberOfUser0 () {    //gdy liczba użytkowników = 0
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> emptyUsersList = new ArrayList<String>();

        when(statisticsMock.usersNames()).thenReturn(emptyUsersList);
        CalculateForumStatistics calculateForumStatistics = new CalculateForumStatistics (statisticsMock);

        //When
        int users0 = calculateForumStatistics.usersNames().size();

        //Then
        Assert.assertEquals (0, users0 );
    }


    @Test
    public void testCalculateAdvStatisticsNumberOfUser100 () {    //gdy liczba użytkowników = 100
        //Given
        Statistics statisticsMock = mock(Statistics.class);

        List<String> usersNamesList = new ArrayList<String>();
        for (int i = 0; i < 100; i++) {
            usersNamesList.add ("User No. " + i);
        }

        when(statisticsMock.usersNames()).thenReturn(usersNamesList);
        CalculateForumStatistics calculateForumStatistics = new CalculateForumStatistics (statisticsMock);

        //When
        int users100 = calculateForumStatistics.usersNames().size();

        //Then
        Assert.assertEquals (100, users100 );
    }
}

/**
 W zadaniu do podrozdziału 6.5 jak przetestować poprawność obliczeń wartości średnich dla różnych przypadków? chodzi mi konretnie o zapis... zapisuje w assertEquals?
 assertEquals(double expected, double actual, double delta); - delta jest to tolerowana roznica pomiedzy wartosciami np. 0.002
 */
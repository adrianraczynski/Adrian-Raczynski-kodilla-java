package com.kodilla.testing.forum.statistics;

import com.kodilla.testing.shape.ShapeCollector;
import org.junit.*;

import java.util.ArrayList;
import java.util.List;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CalculateForumStatisticsTestSuite {
    private static int testCounter = 0;
    private Statistics statisticsMock;
    private CalculateForumStatistics calculate;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test No." + testCounter);
        statisticsMock = mock(Statistics.class);
        calculate = new CalculateForumStatistics(statisticsMock);
    }

    @After
    public void after() {
        System.out.println("Test No. " + testCounter + " end.");

    }

    @Test
    public void testCalculateAdvStatisticsNumberOfPosts0 () {    // gdy liczba postów = 0
        //Given

        when(statisticsMock.postsCount()).thenReturn(0);

        //When
        calculate.calculateAdvStatistics(statisticsMock);
        int posts0 = calculate.getNumberOfPosts (0);


        //Then
        Assert.assertEquals (0, posts0 );
        Assert.assertEquals (0, calculate.getNumberOfComments(0));
        Assert.assertEquals (0, calculate.getNumberOfUsers(0));


    }

    @Test
    public void testCalculateAdvStatisticsNumberOfPosts1000 () {    //gdy liczba postów = 1000
        //Given
        when(statisticsMock.postsCount()).thenReturn(1000);

        //When
        calculate.calculateAdvStatistics(statisticsMock);
        int posts1000 = calculate.getNumberOfPosts (1000);

        //Then
        Assert.assertEquals (1000, posts1000  );
        Assert.assertEquals (0, calculate.getNumberOfComments(0));
        Assert.assertEquals (0, calculate.getNumberOfUsers(0));
    }

     @Test
    public void testCalculateAdvStatisticsNumberOfComments0 () {    //gdy liczba komentarzy = 0
        //Given
        when(statisticsMock.commentsCount()).thenReturn(0);

        //When
         calculate.calculateAdvStatistics(statisticsMock);
         int comments0 = calculate.getNumberOfComments(0);

        //Then
         Assert.assertEquals (0, comments0 );
         Assert.assertEquals (0, calculate.getNumberOfPosts(0));
         Assert.assertEquals (0, calculate.getNumberOfUsers(0));
    }

    @Test
    public void testCalculateAdvStatisticsNumberOfUser0 () {    //gdy liczba użytkowników = 0
        //Given
        List<String> emptyUsersList = new ArrayList<String>();

        when(statisticsMock.usersNames()).thenReturn(emptyUsersList);

        //When
        calculate.calculateAdvStatistics(statisticsMock);
        int users0 = calculate.getNumberOfUsers (0);

        //Then
        Assert.assertEquals (0, users0 );
        Assert.assertEquals (0, calculate.getNumberOfComments(0));
        Assert.assertEquals (0, calculate.getNumberOfPosts(0));
    }

    @Test
    public void testCalculateAdvStatisticsNumberOfUser100 () {    //gdy liczba użytkowników = 100
        //Given
        List<String> usersNamesList = new ArrayList<String>();
        for (int i = 0; i < 100; i++) {
            usersNamesList.add ("User No. " + i);
        }
        when(statisticsMock.usersNames()).thenReturn(usersNamesList);

        //When
        calculate.calculateAdvStatistics(statisticsMock);
        int users100 = calculate.getNumberOfUsers (100);

        //Then
        Assert.assertEquals (100, users100 );
        Assert.assertEquals (0, calculate.getNumberOfComments(0));
        Assert.assertEquals (0, calculate.getNumberOfPosts(0));
    }

    /**
     @Test
     public void testCalculateAdvStatistics4 () {    // gdy liczba komentarzy < liczba postów
     //Given
     List<String> usersNamesList = new ArrayList<String>();

     when(statisticsMock.usersNames()).thenReturn(usersNamesList);

     //When
        calculate.calculateAdvStatistics(statisticsMock);
        int quantityOfUsers= calculateForumStatistics.calculateAdvStatistics().size();

     //Then
         Assert.assertEquals (7, quantityOfUsers );
     }


     @Test
     public void testCalculateAdvStatistics5 () {    //gdy liczba komentarzy > liczba postów
     //Given
     List<String> usersNamesList = new ArrayList<String>();

     when(statisticsMock.usersNames()).thenReturn(usersNamesList);

     //When
     int quantityOfUsers= calculateForumStatistics.calculateAdvStatistics().size();

     //Then
     Assert.assertEquals (7, quantityOfUsers );
     }

     **/
}


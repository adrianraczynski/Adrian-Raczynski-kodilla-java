package com.kodilla.patterns.singleton;

import com.kodilla.patterns.Logger;
import org.junit.*;

public class LoggerTestSuite {
    private static Logger logger;

    @BeforeClass
    public static void beforeTest () {
       System.out.println("This is the beginning of tests.");
       logger = new Logger();
       logger.getInstance().log("01234");
    }

    @AfterClass
    public static void afterTests () {
        System.out.println("All tests are finished.");
    }

    @Test
    public void getLastLog() {
        //Given
        //When
        String testLog = logger.getInstance().getLastLog();
        //Then
        Assert.assertEquals("01234", testLog);
    }
}
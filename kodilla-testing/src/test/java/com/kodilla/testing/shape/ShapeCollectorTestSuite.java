package com.kodilla.testing.shape;

import org.junit.*;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ShapeCollectorTestSuite {
    private static int testCounter = 0;
    private ShapeCollector shapeCollector;

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
        shapeCollector = new ShapeCollector ();
    }

    @Test
    public void testAddFigure () {
        //Given
        Circle theCircle = new Circle();

        //When
        shapeCollector.addFigure(theCircle);

        //Then
        assertEquals(theCircle, shapeCollector.getFigure(0));
    }

    @Test
    public void testRemoveFigure () {
        //Given
        Circle theCircle = new Circle();

        //When
        shapeCollector.addFigure(theCircle);
        boolean result = shapeCollector.removeFigure (theCircle);

        //Then
        assertTrue(result);
    }

    @Test
    public void testGetFigure () {
        //Given
        Circle theCircle = new Circle();
        shapeCollector.addFigure(theCircle);

        //When
        shapeCollector.getFigure(0);

        //Then
        Assert.assertEquals(theCircle, shapeCollector.getFigure(0));
    }
}

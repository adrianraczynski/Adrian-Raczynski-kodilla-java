package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

public class ArrayOperationsTestSuite {

    @Test
    public void testGetAverage(){

        //Given
        int numbers [] = new int [20];
            for(int n=0; n<numbers.length; n++) {
                numbers [n] = n+1;
            }

        //When
        double averageOfNumbers = ArrayOperations.getAverage(numbers);

        //Then
        Assert.assertEquals (10.5, averageOfNumbers,0.1);
    }
}

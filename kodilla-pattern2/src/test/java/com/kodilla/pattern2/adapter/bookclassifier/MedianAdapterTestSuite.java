package com.kodilla.pattern2.adapter.bookclassifier;

import com.kodilla.pattern2.adapter.bookclasifier.MedianAdaptee;
import com.kodilla.pattern2.adapter.bookclasifier.MedianAdapter;
import com.kodilla.pattern2.adapter.bookclasifier.librarya.BookA;
import org.junit.Test;
import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class MedianAdapterTestSuite {

    @Test
    public void publicationYearMedianTest() {
        //Given
        BookA bookA1 = new BookA("xyz", "aaaaa", 2018, "11111");
        BookA bookA2 = new BookA("abc" , "bbbbbbbbb", 2015, "22222222");
        BookA bookA3 = new BookA("deg", "ccccccccccc", 2009, "33333333");
        Set<BookA> bookSet = new HashSet<>();
        bookSet.add(bookA1);
        bookSet.add(bookA2);
        bookSet.add(bookA3);

        //When
        MedianAdapter adapter = new MedianAdapter();
        int median = adapter.publicationYearMedian(bookSet);

        //Then
        assertEquals(2015, median);
    }
}

package com.kodilla.stream.book;

import org.junit.Assert;
import org.junit.Test;
import java.util.List;
import java.util.stream.IntStream;

public class BookTestSuite {
    @Test
    public void testGetListUsingFor() {
        //Given
        BookDirectory bookDirectory = new BookDirectory();

        //When
        List<Book> books = bookDirectory.getList();

        //Then
        int numberOfBooksPublicatedAfter2007 = 0;
        for(Book book : books) {
            if (book.getYearOfPublication() > 2007) {
                numberOfBooksPublicatedAfter2007++;
            }
        }
        Assert.assertEquals(3, numberOfBooksPublicatedAfter2007);
    }

    @Test
    public void testGetListUsingIntStream() {
        //Given
        BookDirectory bookDirectory = new BookDirectory();

        //When
        List<Book> books = bookDirectory.getList();

        //Then
        int numberOfBooksPublicatedAfter2007 = IntStream.range(0, books.size())
                .filter(n -> books.get(n).getYearOfPublication() > 2007)                //Do strumienia wyjściowego filtra kierowane są jedynie te numery indeksów (nie książki!), które odpowiadają książkom wydanym po roku 2007
                .map(n -> 1)                                                            //mapujemy indeksy na jedynki. Dokonujemy transformacji strumienia tak, że do strumienia wyjściowego trafia liczba 1 w miejsce każdego elementu strumienia do zliczenia
                .sum();
        Assert.assertEquals(3, numberOfBooksPublicatedAfter2007);
    }

    @Test
    public void testGetListUsingIntStreamWithCount() {
        //Given
        BookDirectory bookDirectory = new BookDirectory();

        //When
        List<Book> books = bookDirectory.getList();

        //Then
        long numberOfBooksPublicatedAfter2007 = IntStream.range(0, books.size())        //kolektor count() zwraca wynik typu long, dlatego trzeab zmienić typ zmiennej
                .filter(n -> books.get(n).getYearOfPublication() > 2007)
                .count();                                                                  //W przypadku zastosowania metody count(), nie musimy mapować indeksów na "jedynki" - chcemy po prostu sprawdzić ilość indeksów w strumieniu po filtrze.
        Assert.assertEquals(3, numberOfBooksPublicatedAfter2007);
    }
}
package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class LibraryTestSuite {

    @Test
    public void testGetBooks()  {
        //given
        Library library = new Library("Crimes stories.");

        Book book1 = new Book ("The Godfather", "Mario Puzo", LocalDate.of(1969, 07, 19));
        Book book2 = new Book ("The Last Done", "Mario Puzo", LocalDate.of(1996, 11, 28));
        Book book3 = new Book ("The Sicilian", "Mario Puzo", LocalDate.of(1984, 03, 05));
        Book book4 = new Book ("Omerta", "Mario Puzo", LocalDate.of(2000, 01, 10));

        library.getBooks().add(book1);
        library.getBooks().add(book2);
        library.getBooks().add(book3);
        library.getBooks().add(book4);

        //making a shallow clone of object library
        Library clonedLibrary = null;
        try {
            clonedLibrary = library.shallowCopy();
            clonedLibrary.setName("Romances.");

        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //making a deep copy of object library
        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("Dramas.");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //When
        library.getBooks().remove(book4);

        //Then
        System.out.println(library);
        System.out.println(clonedLibrary);
        System.out.println(deepClonedLibrary);

        Assert.assertEquals(3, library.getBooks().size());
        Assert.assertEquals(3, clonedLibrary.getBooks().size());
        Assert.assertEquals(4, deepClonedLibrary.getBooks().size());
        Assert.assertEquals(library.getBooks().size(), clonedLibrary.getBooks().size());
        Assert.assertNotEquals (deepClonedLibrary.getBooks().size(), library.getBooks().size());

    }
}
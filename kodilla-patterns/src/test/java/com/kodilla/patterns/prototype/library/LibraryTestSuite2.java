package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class LibraryTestSuite2 {

    /**  @Test
    public void testShallowClone() throws CloneNotSupportedException {
        //given
        Library library = makeLibrary();


        //making a shallow clone of object library
        Library clonedLibrary = null;
            clonedLibrary = library.shallowCopy();
            clonedLibrary.setName("Romances.");

        //When
        library.getBooks().remove(makeBookObject(book1));

        //Then
        System.out.println(library);
        System.out.println(clonedLibrary);

        Assert.assertEquals(3, library.getBooks().size());
        Assert.assertEquals(3, clonedLibrary.getBooks().size());
        Assert.assertEquals(library.getBooks().size(), clonedLibrary.getBooks().size());
    }

    @Test
    public void testDeepClone() throws CloneNotSupportedException {
        //given
        Library library = makeLibrary ();

        //making a deep copy of object library
        Library deepClonedLibrary = null;
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("Dramas.");

        //When
        library.getBooks().remove(book4);

        //Then
        System.out.println(library);
        System.out.println(deepClonedLibrary);

        Assert.assertEquals(3, library.getBooks().size());
        Assert.assertEquals(4, deepClonedLibrary.getBooks().size());
        Assert.assertNotEquals(deepClonedLibrary.getBooks().size(), library.getBooks().size());
    } **/

    private Library makeLibrary () {
        Library exampleLibrary = new Library("Crimes stories.");

        Book book1 = new Book ("The Godfather", "Mario Puzo", LocalDate.of(1969, 07, 19));
        Book book2 = new Book ("The Last Done", "Mario Puzo", LocalDate.of(1996, 11, 28));
        Book book3 = new Book ("The Sicilian", "Mario Puzo", LocalDate.of(1984, 03, 05));
        Book book4 = new Book ("Omerta", "Mario Puzo", LocalDate.of(2000, 01, 10));

        exampleLibrary.getBooks().add(book1);
        exampleLibrary.getBooks().add(book2);
        exampleLibrary.getBooks().add(book3);
        exampleLibrary.getBooks().add(book4);

        return exampleLibrary;
    }

    private Book makeBookObject (Book book) {

        Book book1 = new Book ("The Godfather", "Mario Puzo", LocalDate.of(1969, 07, 19));
        Book book2 = new Book ("The Last Done", "Mario Puzo", LocalDate.of(1996, 11, 28));
        Book book3 = new Book ("The Sicilian", "Mario Puzo", LocalDate.of(1984, 03, 05));
        Book book4 = new Book ("Omerta", "Mario Puzo", LocalDate.of(2000, 01, 10));

        return book;
    }
}
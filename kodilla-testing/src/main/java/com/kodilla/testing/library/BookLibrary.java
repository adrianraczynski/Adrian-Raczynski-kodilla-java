package com.kodilla.testing.library;

import java.util.ArrayList;
import java.util.List;

public class BookLibrary {

    LibraryDatabase libraryDatabase;

    public BookLibrary(LibraryDatabase libraryDatabase) {
        this.libraryDatabase = libraryDatabase;
    }

    public List<Book> listBooksWithCondition(String titleFragment) {
        List<Book> bookList = new ArrayList<Book>();
        if (titleFragment.length() < 3) return bookList;

        List<Book> resultList = libraryDatabase.listBooksWithCondition(titleFragment);

        if (resultList.size() > 20) return bookList;
        bookList = resultList;

        return bookList;
    }

    public List<Book> listBooksInHandsOf(LibraryUser libraryUser) {
        List<Book> bookList2 = new ArrayList<Book>();

        if (bookList2.size() > 0) return bookList2;

        List<Book> listOfBooks = libraryDatabase.listBooksInHandsOf(libraryUser);

        if (bookList2.size() == 0) return bookList2;
        bookList2 = listOfBooks;

        return listOfBooks;
     }
}
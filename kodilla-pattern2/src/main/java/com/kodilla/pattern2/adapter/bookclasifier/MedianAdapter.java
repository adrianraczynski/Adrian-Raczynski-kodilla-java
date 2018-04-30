package com.kodilla.pattern2.adapter.bookclasifier;

import com.kodilla.pattern2.adapter.bookclasifier.librarya.BookA;
import com.kodilla.pattern2.adapter.bookclasifier.librarya.Classifier;
import com.kodilla.pattern2.adapter.bookclasifier.libraryb.BookB;
import com.kodilla.pattern2.adapter.bookclasifier.libraryb.BookSignature;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MedianAdapter extends MedianAdaptee implements Classifier {

    private final MedianAdaptee medianAdaptee;

    public MedianAdapter(MedianAdaptee medianAdaptee) {
        this.medianAdaptee = medianAdaptee;
    }

    @Override
    public int publicationYearMedian(Set<BookA> bookASet) {

        Map<BookSignature, BookB> bookMap = new HashMap<>();

        for (BookA bookA : bookASet) {

            BookSignature signature = new BookSignature(bookA.getSignature());
            BookB bookB = new BookB(bookA.getAuthor(), bookA.getTitle(), bookA.getPublicationYear());
            bookMap.put(signature, bookB);
        }
        return medianAdaptee.medianPublicationYear(bookMap);
    }
}

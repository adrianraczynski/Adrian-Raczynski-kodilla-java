package com.kodilla.pattern2.adapter.bookclasifier;

import com.kodilla.pattern2.adapter.bookclasifier.libraryb.BookB;
import com.kodilla.pattern2.adapter.bookclasifier.libraryb.BookSignature;
import com.kodilla.pattern2.adapter.bookclasifier.libraryb.BookStatistics;
import com.kodilla.pattern2.adapter.bookclasifier.libraryb.Statistics;

import java.util.Map;

public class MedianAdaptee implements BookStatistics {

    @Override
    public int averagePublicationYear(Map<BookSignature, BookB> books) {
        Statistics statistics = new Statistics();
        return statistics.averagePublicationYear(books);
    }

    @Override
    public int medianPublicationYear(Map<BookSignature, BookB> books) {
        Statistics statistics = new Statistics();
        return statistics.medianPublicationYear(books);
    }
}

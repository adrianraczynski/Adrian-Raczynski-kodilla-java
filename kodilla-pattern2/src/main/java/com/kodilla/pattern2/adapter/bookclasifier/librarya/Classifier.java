package com.kodilla.pattern2.adapter.bookclasifier.librarya;

import java.util.Set;

public interface Classifier {
    int publicationYearMedian(Set<BookA> bookASet);
}
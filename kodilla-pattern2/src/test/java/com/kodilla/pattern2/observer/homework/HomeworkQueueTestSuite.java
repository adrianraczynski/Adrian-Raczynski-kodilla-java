package com.kodilla.pattern2.observer.homework;

import org.junit.Assert;
import org.junit.Test;

public class HomeworkQueueTestSuite {

    @Test
    public void homeworkUpdate() {
        //given
        HomeworkQueue studentAdrian = new Student("Adrian");
        HomeworkQueue studentAgata = new Student("Agata");
        HomeworkQueue studentPawel = new Student("Pawel");
        HomeworkQueue studentMaciej = new Student("Maciej");

        Mentor andrzejTrznadel = new Mentor("Andrzej Trznadel");
        Mentor adamNowak = new Mentor ("Adam Nowak");

        studentAdrian.registerObserver(andrzejTrznadel);
        studentAgata.registerObserver(andrzejTrznadel);
        studentPawel.registerObserver(adamNowak);
        studentMaciej.registerObserver(andrzejTrznadel);

        //when
        studentAdrian.addExercise("zad 1.1");
        studentAdrian.addExercise("zad 1.2");
        studentAdrian.addExercise("zad 1.3");

        studentAgata.addExercise("zad 1.1");
        studentAgata.addExercise("zad 1.1 - poprawka");

        studentPawel.addExercise("zad 1.1");
        studentPawel.addExercise("zad 1.2");
        studentPawel.addExercise("zad 1.3");
        studentPawel.addExercise("zad 1.4 - xyz");

        studentMaciej.addExercise("pierwsze zadanie");

        //then
        Assert.assertEquals(6, andrzejTrznadel.getUpdateCount());
        Assert.assertEquals(4, adamNowak.getUpdateCount());


    }
}

package com.kodilla.pattern2.observer.homework;

import org.junit.Assert;
import org.junit.Test;

public class HomeworkQueueTestSuite {

    @Test
    public void homeworkUpdate() {
        //given
        Modul1 modul1 = new Modul1();
        Modul2 modul2 = new Modul2();

        StudentAdrian studentAdrian = new StudentAdrian("Adrian");
        StudentAdrian studentAdrianAgata = new StudentAdrian("Agata");
        StudentAdrian studentAdrianPawel = new StudentAdrian("Pawel");
        StudentAdrian studentAdrianMaciej = new StudentAdrian("Maciej");

        Mentor andrzejTrznadel = new Mentor("Andrzej Trznadel");
        Mentor adamNowak = new Mentor ("Adam Nowak");

        studentAdrian.registerObserver(andrzejTrznadel);
        studentAdrianAgata.registerObserver(andrzejTrznadel);
        studentAdrianPawel.registerObserver(adamNowak);
        studentAdrianMaciej.registerObserver(andrzejTrznadel);


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
        Assert.assertEquals(3, andrzejTrznadel.getUpdateCount());
        Assert.assertEquals(2,adamNowak.getUpdateCount());


    }
}

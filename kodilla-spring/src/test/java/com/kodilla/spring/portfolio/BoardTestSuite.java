package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class BoardTestSuite {

    @Test
    public void testTaskAdd() {
        //Given
        ApplicationContext context = new
                AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);

        List<String> toDoList = new ArrayList<>();
        toDoList.add ("Task number 1");

        List<String> inProgressList = new ArrayList<>();
        inProgressList.add ("Task number 2");

        List<String> doneList = new ArrayList<>();
        doneList.add ("Task number 3");

        //When
        String checkToDoList = board.showToDoList();
        String checkInProgressList = board.showInProgressList ();
        String checkDoneList = board.showDoneList ();

        //Then

        Assert.assertEquals ("Task number 1", checkToDoList);
        Assert.assertEquals ("Task number 2", checkInProgressList);
        Assert.assertEquals ("Task number 3", checkDoneList);
    }
}
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

        //When
        String checkToDoList = board.showToDoList();
        String checkInProgressList = board.showInProgressList ();
        String checkDoneList = board.showDoneList ();

        //Then

        Assert.assertEquals ("To do list: [Task number 1]", checkToDoList);
        Assert.assertEquals ("List of progress tasks: [Task number 2]", checkInProgressList);
        Assert.assertEquals ("List of completed tasks: [Task number 3]", checkDoneList);
    }
}


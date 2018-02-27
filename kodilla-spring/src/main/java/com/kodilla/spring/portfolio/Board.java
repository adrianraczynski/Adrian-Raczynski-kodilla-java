package com.kodilla.spring.portfolio;

public class Board {

    final private TaskList toDoList;
    final private TaskList inProgressList;
    final private TaskList doneList;

    public Board(final TaskList toDoList, final TaskList inProgressList,
                 final TaskList doneList) {
        this.toDoList = toDoList;
        this.inProgressList = inProgressList;
        this.doneList = doneList;
    }

    public String showToDoList () {
        return ("To do list: " + toDoList.getTasks());
    }

    public String showInProgressList () {
        return ("List of progress tasks: " + inProgressList.getTasks());
    }

    public String showDoneList () {
        return ("List of completed tasks: " + doneList.getTasks());
    }

}

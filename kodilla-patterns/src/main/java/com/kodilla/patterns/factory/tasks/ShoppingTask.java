package com.kodilla.patterns.factory.tasks;

public class ShoppingTask implements Task {

    private String taskName;
    private String whatToBuy;
    private double quantity;
    private boolean taskDone;

    public ShoppingTask(final String taskName, final String whatToBuy, final double quantity) {
        this.taskName = taskName;
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
    }

    public String getTaskName() {
        return taskName;
    }

    public String executeTask() {
        taskDone = true;
        return "We have to do shopping.";
    }

    public boolean isTaskExecuted() {
        return taskDone;
    }
}



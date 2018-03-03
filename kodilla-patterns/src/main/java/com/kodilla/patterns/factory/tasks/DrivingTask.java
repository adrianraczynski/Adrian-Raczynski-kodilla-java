package com.kodilla.patterns.factory.tasks;

public class DrivingTask implements Task {

    private String taskName;
    private String where;
    private String using;
    private boolean taskDone;

    public DrivingTask(final String taskName, final String where, final String using) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
    }

    public String getTaskName() {
        return taskName;
    }

    public String executeTask() {
        taskDone = true;
        return "We must drive to next city.";
    }

    public boolean isTaskExecuted() {
        return taskDone;
    }
}
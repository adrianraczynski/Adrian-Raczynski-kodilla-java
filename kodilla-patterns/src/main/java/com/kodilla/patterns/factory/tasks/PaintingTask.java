package com.kodilla.patterns.factory.tasks;

public class PaintingTask implements Task {

    private String taskName;
    private String color;
    private String whatToPaint;
    private boolean taskDone;

    public PaintingTask(final String taskName, final String color, final String whatToPaint) {
        this.taskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;
    }

    public String getTaskName() {
        return taskName;
    }

    public String executeTask() {
        taskDone = false;
        return "We must paint bridge.";
    }

    public boolean isTaskExecuted() {
        return taskDone;
    }
}

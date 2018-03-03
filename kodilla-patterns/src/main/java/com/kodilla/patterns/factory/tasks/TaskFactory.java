package com.kodilla.patterns.factory.tasks;

public class TaskFactory {
    public static final String SHOPPINGTASK = "SHOPPINGTASK";
    public static final String DRIVINGTASK = "DRIVINGTASK";
    public static final String PAINTINGTASK = "PAINTINGTASK";

    public final Task makeTask(final String taskClass) {
        switch (taskClass) {
            case SHOPPINGTASK:
                return new ShoppingTask("Shopping Task","Car",10.000);
            case DRIVINGTASK:
                return new DrivingTask("Driving Task", "Warsaw","Car");
            case PAINTINGTASK:
                return new PaintingTask("Painting Task", "Yellow","Bridge");
            default:
                return null;
        }
    }
}
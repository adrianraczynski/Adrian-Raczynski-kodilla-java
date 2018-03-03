package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {
    @Test
    public void testShoppingTask() {
        //Given
        TaskFactory shoppingTask = new TaskFactory();
        //When
        Task shop = shoppingTask.makeTask(TaskFactory.SHOPPINGTASK);
        //Then
        Assert.assertEquals("Shopping Task", shop.getTaskName());
        Assert.assertEquals("We have to do shopping.", shop.executeTask());
        Assert.assertEquals (true, shop.isTaskExecuted());
    }


    @Test
    public void testDrivingTask() {
        //Given
        TaskFactory drivingTask = new TaskFactory();
        //When
        Task drive = drivingTask.makeTask(TaskFactory.DRIVINGTASK);
        //Then
        Assert.assertEquals("Driving Task", drive.getTaskName());
        Assert.assertEquals("We must drive to next city.", drive.executeTask());
        Assert.assertEquals (true, drive.isTaskExecuted());
    }

    @Test
    public void testPaintingTask() {
        //Given
        TaskFactory paintingTask = new TaskFactory();
        //When
        Task paint = paintingTask.makeTask(TaskFactory.PAINTINGTASK);
        //Then
        Assert.assertEquals("Painting Task", paint.getTaskName());
        Assert.assertEquals("We must paint bridge.", paint.executeTask());
        Assert.assertEquals (false, paint.isTaskExecuted());
    }
}
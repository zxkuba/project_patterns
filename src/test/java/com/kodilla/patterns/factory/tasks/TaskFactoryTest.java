package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TaskFactoryTest {

    @Test
    public void testFactoryShopping(){
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task shopping = taskFactory.makeTask(TaskFactory.SHOPPING);
        //Then
        Assert.assertEquals("Food", shopping.getTaskName());
        Assert.assertTrue(shopping.executeTask());
        Assert.assertTrue(shopping.isTaskExecuted());


    }

    @Test
    public void testFactoryPainting(){
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task painting = taskFactory.makeTask(TaskFactory.PAINTING);
        //Then
        Assert.assertEquals("Refresh", painting.getTaskName());
        Assert.assertTrue(painting.executeTask());
        Assert.assertTrue(painting.isTaskExecuted());


    }

    @Test
    public void testFactoryDriving(){
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task driving = taskFactory.makeTask(TaskFactory.DRIVING);
        //Then
        Assert.assertEquals("Delivery", driving.getTaskName());
        Assert.assertTrue(driving.executeTask());
        Assert.assertTrue(driving.isTaskExecuted());


    }

}
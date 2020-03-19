package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;


import static org.junit.Assert.*;

public class LoggerTestSuite {

    @BeforeClass
    public static void addLog(){
        Logger.getInstance().log("root");
    }

    @Test
    public void testGetLastLog(){
        //Given
        //When
        String logName = Logger.getInstance().getLastLog();
        //Then
        Assert.assertEquals("root", logName);
    }


}
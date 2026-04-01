package ru.netology.service;

import org.testng.annotations.Test;
import org.testng.Assert;

public class SimpleTest {

    @Test
    public void testOnePlusOne() {
        Assert.assertEquals(1 + 1, 2, "1+1 should equal 2");
        System.out.println("Simple test passed!");
    }
}
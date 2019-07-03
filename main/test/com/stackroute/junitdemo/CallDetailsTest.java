package com.stackroute.junitdemo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.*;

public class CallDetailsTest {
    NthPower nthPower;
    @Before
    public void setUp() {
        System.out.println("Before");
        nthPower = new NthPower();
    }

    @After
    public void tearDown() {
        nthPower = null;
        System.out.println("After");
    }
    @Test
    public void isGivenInputPowerOf4() {
        String result= NthPower.check(64);
        assertEquals("given input is a power of 4", result);
    }
    @Test
    public void isGivenInputNotAPowerOf4() {
        String result= NthPower.check(45);
        assertEquals("not a power of 4", result);
    }

}
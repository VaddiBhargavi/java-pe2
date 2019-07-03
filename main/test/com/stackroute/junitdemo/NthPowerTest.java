package com.stackroute.junitdemo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class NthPowerTest {
   NthPower nthPower;
    @Before
    public void setUp() {
        nthPower = new NthPower();
    }

    @After
    public void tearDown() {
        nthPower = null;
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
    @Test
    public void ifGivenInputIsZeroShouldReturnError() {
        String result= NthPower.check(0);
        assertEquals("Given input should not be zero", result);
    }
}
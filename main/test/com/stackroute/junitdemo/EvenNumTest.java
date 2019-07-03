package com.stackroute.junitdemo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EvenNumTest {
    EvenNum evenNum;

    @Before
    public void setUp() {
        System.out.println("Before");
        evenNum = new EvenNum();
    }

    @After
    public void tearDown() {
        evenNum = null;
        System.out.println("After");
    }

    @Test
    public void isGivenInputEvenPrintTrue() {
        Boolean result = EvenNum.isEven(64);
        assertEquals(true, result);
    }

    @Test
    public void isGivenInputNotEvenPrintError() {
        Boolean result = EvenNum.isEven(65);
        assertEquals(false, result);
    }

    @Test
    public void isGivenInputIsNegativePrintError() {
        Boolean result = EvenNum.isEven(-65);
        assertEquals(false, result);
    }
}
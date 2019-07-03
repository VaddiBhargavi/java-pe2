package com.stackroute.junitdemo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runners.Parameterized;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.*;

public class StudentDetailsTest {
    StudentDetails studentDetails;

    @Before
    public void setUp() {
        System.out.println("Before");
        studentDetails = new StudentDetails();
    }

    @After
    public void tearDown() {
        studentDetails = null;
        System.out.println("After");
    }

    @Test
    public void calculateAverageAndPrintAverage() {
        double average = StudentDetails.average(new int[]{45, 78, 90, 25});
        assertEquals(59.5, average, 2);
    }

    @Test
    public void calculateMinimumAndPrintMinimum() {
        int min = StudentDetails.minimum(new int[]{45, 78, 90, 25});
        assertEquals(25, min, 2);
    }

    @Test
    public void calculateMaximumAndPrintMaximum() {
        int max = StudentDetails.maximum(new int[]{45, 78, 90, 25});
        assertEquals(90, max, 2);
    }
    @Test
    public void givenInputNullAndPrintError() {
        double average = StudentDetails.average(new int[]{1});
        assertEquals(0, average, 2);
    }
    @Test
    public void givenInputIsOnePrintZero() {
        int min = StudentDetails.minimum(new int[]{1});
        assertEquals(0, min, 2);
    }
    @Test
    public void givenInputNullPrintZero() {
        int max = StudentDetails.maximum(new int[]{2});
        assertEquals(0, max, 2);
    }
}
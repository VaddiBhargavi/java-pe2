package com.stackroute.junitdemo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FactorialTest {
    Factorial factorial;
    @Before
    public void setUp(){
        System.out.println("Before");
        factorial=new Factorial();
    }

    @After
    public void tearDown(){
        factorial=null;
        System.out.println("after");
    }
    @Test
    public void givenStringContainsLongNumberShouldReturnFactorial() {
//Arrange
//Act
        String result = factorial.FindFactorialLong(20);
//Assert
        assertEquals("factorial is 2432902008176640000", result);
    }
    @Test
    public void givenStringContainsLongNumberShouldReturnOutOfRangeMessage() {
//Arrange
//Act
        String result = factorial.FindFactorialLong(21);
//Assert
        assertEquals("factorial is out of range", result);
    }
    @Test
    public void givenStringContainsIntegerNumberShouldReturnFactorial() {
//Arrange
//Act
        String result = factorial.FindFactorialInt(8);
//Assert
        assertEquals("factorial is 40320", result);
    }
    @Test
    public void givenStringContainsIntegerNumberShouldReturnOutOfRangeMessage() {
//Arrange
//Act
        String result = factorial.FindFactorialInt(17);
//Assert
        assertEquals("factorial is out of range", result);
    }


}
    /*
    @Before
    public  void setUp(){
        System.out.println("Before");
        factorial=new Factorial();
    }
    @After
    public void tearDown(){
        System.out.println("After");
        factorial=null;
    }
    @Test
    public void factorialCheck(){
        int result=Factorial.factorialCheck(10);
        assertEquals(479001600,result);
    }
    @Test
    public void longFactorialCheck(){
        long result=Factorial.printLongFactorial(1l);
        assertEquals(2432902008176640000l,result);
    }
    @Test
    public void givenInputIsNegativeShouldReturnZero(){
        int result=Factorial.factorialCheck(-1);
        assertEquals(0,result);
    }
}*/
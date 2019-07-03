package com.stackroute.junitdemo;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;


public class ReverseandPalindromeTest {
    ReverseandPalindrome reverseandPalindrome;
    @Before
    public void setUp() {
        System.out.println("Before");
        reverseandPalindrome = new ReverseandPalindrome();
    }

    @After
    public void tearDown() {
        reverseandPalindrome = null;
        System.out.println("After");
    }
    @Test
    public void givenInputShouldPrintInReverse() {
        String result= ReverseandPalindrome.check(12321);
        assertEquals("12321The reverse of the given input is a palindrome", result);
    }
    @Test
    public void givenInputShouldBePalindrome() {
        String result= ReverseandPalindrome.check(12321);
        assertEquals("12321The reverse of the given input is a palindrome", result);
    }
    @Test
    public void givenInputShouldReturnError() {
        String result= ReverseandPalindrome.check(1231);
        assertEquals("1321The reverse of the given input is not a palindrome", result);
    }
}
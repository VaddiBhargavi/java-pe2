package com.stackroute.junitdemo;

public class Factorial {
    //Method for factorial check considering Long
    public String FindFactorialLong( long number) {
        String result;
        long fact = 1;
        for (int i = 1; i <= number; i++) {
            fact = fact * i;
        }
        if(fact < 0)
        {
            return "factorial is out of range";
        }
        result = "factorial is " + fact;
        return result;
    }
    //Method for factorial check considering Int
    public String FindFactorialInt( int number1) {
        String result;
        int fact = 1;
        for (int i = 1; i <= number1; i++) {
            fact = fact * i;
        }
        if(fact < 0)
        {
            return "factorial is out of range";
        }
        result = "factorial is " + fact;
        return result;
    }
}



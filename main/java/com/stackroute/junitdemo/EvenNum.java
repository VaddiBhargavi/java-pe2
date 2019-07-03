package com.stackroute.junitdemo;

public class EvenNum {
    static Boolean result=false;
    //Method to calculate whether number is even or not
    public static boolean isEven(int number) {
            if (number % 2 == 0) {
                result = true; //returns true if number is even
                return result;
            } else {
                return result; //returns false if number is odd
            }
        }
}



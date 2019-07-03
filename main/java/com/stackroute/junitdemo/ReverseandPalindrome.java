package com.stackroute.junitdemo;

public class ReverseandPalindrome {
    //Method to calculate whether given number is palindrome or not
    public static String check(int givenInput)
    {
        //Initializing of variables
       int temp, reverse=0;
        String result=" ";
        temp= givenInput;
            while (givenInput != 0) {
                int digit = givenInput % 10;
                reverse = reverse * 10 + digit;
                givenInput /= 10;
            }
            //print result if given number is same as reversed
            result += reverse;
        if(temp==reverse) {
            result += "The reverse of the given input is a palindrome";
           // return result.trim();
        }
        else {
            //Print if given input is not a palindrome
            result += "The reverse of the given input is not a palindrome";

        } return result.trim();
    }
}

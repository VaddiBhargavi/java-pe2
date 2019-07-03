package com.stackroute.junitdemo;

public class StudentDetails {
    static double average;
    static int sum = 0;
//calculates average marks of student
    public static double average(int number[]) {
        int average;
        if (number.length - 1 < 1)
            return 0;
        else {
            for (int i = 0; i <= number.length - 1; i++) {
                sum = sum + number[i];
            }
            average = sum / number.length - 1;
            return average;
        }
    }
//Calculates maximum marks of student
    public static int maximum(int number[]) {
        int max = number[0];
        if (number.length - 1 < 1)
            return 0;
        else {
            for (int i = 0; i <= number.length - 1; i++) {
                if (number[i] > max)
                    max = number[i];
            }
            return max;
        }
    }
//Calculates minimum marks of student
    public static int minimum(int number[]) {
        int min = number[0];
        if (number.length - 1 < 1)
            return 0;
        else {
            for (int i = 0; i <= number.length - 1; i++) {
                if (number[i] < min)
                    min = number[i];
            }
            return min;
        }
    }
}




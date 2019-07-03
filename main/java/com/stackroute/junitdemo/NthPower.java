package com.stackroute.junitdemo;

public class NthPower {
    //Method to check given input is power of 4 or not
   public static String check(int givenInput)
    {
         String result= " ";
        if(givenInput==0) {
            result += "Given input should not be zero"; //Print error if given input is zero
          //return result.trim();
        }
        while(givenInput!=1) {
            if (givenInput % 4 != 0) {
                result += "not a power of 4"; //If given input is not power of 4
             //  return result.trim();
            }
            givenInput = givenInput / 4;
        }
        //given input is a power of 4
        result +=" given input is a power of 4";
        //Return result if given input is a power of 4
        return result.trim();
    }
}

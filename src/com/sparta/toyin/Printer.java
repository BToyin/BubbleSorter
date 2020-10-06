package com.sparta.toyin;

import java.util.Arrays;

public class Printer {

    public static void printBubbleSorter(int[] input, int[] output) {
        //validation was entered in this class as this is where the printing operation is carried out.
        if (input.length < 2) {
            System.err.println("Please enter an array with 2 or more values");
        }
            else{
                String inputs = Arrays.toString(input);
                String outputs = Arrays.toString(output);
                System.out.println("The Original number sequence was: " + inputs);
                System.out.println("The bubble sorted sequence is: " + outputs);
            }
    }


}

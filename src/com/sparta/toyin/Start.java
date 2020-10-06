package com.sparta.toyin;

import java.util.Arrays;

public class Start {

    public static void startBubbleSorter() {

        int[] input = {1};
        int[] output = BubbleSorter.bubbleSorter(input);
        Printer.printBubbleSorter(input, output);
    }


}

package com.sparta.toyin;

public class BubbleSorter {

    public static int[] bubbleSorter(int[] array) {

        int[] array2 = new int[0];

            array2 = new int[array.length];
            System.arraycopy(array, 0, array2, 0, array.length);  //have to create copy of the value and the reference (pointer) so original value doesn't get altered
            for (int i = 0; i < array2.length - 1; i++) {
                for (int j = 0; j < array2.length - 1 - i; j++) {
                    if (array2[j] > array2[j + 1]) {
                        int tempNum1 = array2[j];
                        array2[j] = array2[j + 1];
                        array2[j + 1] = tempNum1;
                    }
                }
            }
        return array2;
    }
}

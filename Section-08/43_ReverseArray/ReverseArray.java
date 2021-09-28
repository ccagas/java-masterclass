package com.ccagas;

import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5};
        reverse(array);
    }

    private static void reverse(int[] array){
        System.out.println("Array = " + Arrays.toString(array));

        int length = array.length;
        int count = length -1;
        int[] reverseArray = new int[length];

        for(int i=0; i <= length -1; i++) {
            reverseArray[count] = array[i];
            count--;
        }

        System.out.println("Reversed Array = " + Arrays.toString(reverseArray));
    }
}

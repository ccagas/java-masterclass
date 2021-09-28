package com.ccagas;

import java.util.Arrays;
import java.util.Scanner;

public class MinimumElement {

    public static void main(String[] args) {

       int returnedInt = readInteger();
       int[] returnedElements = readElements(returnedInt);
       int returnedMin = findMin(returnedElements);

       System.out.println("\rMinimum value is: " + returnedMin);

    }

    private static int readInteger() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter count: ");
        int count = scanner.nextInt();

        return count;
    }

    private static int[] readElements(int count) {
        int[] myElements = new int[count];
        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i < myElements.length; i++) {
            System.out.println("Enter a number:\r");
            int number = scanner.nextInt();
            scanner.nextLine();
            myElements[i] = number;
        }
        return myElements;
    }

    private static int findMin(int[] minArray) {

        int minValue = Integer.MAX_VALUE;

        for(int i=0; i< minArray.length; i++) {
            int value = minArray[i];

            if(value < minValue) {
                minValue = value;
            }
        }
        return minValue;

        // or code below:

//        int minValue = minArray[0];
//
//        for(int i=0; i< minArray.length; i++) {
//            if(minArray[i] < minValue) {
//                minValue = minArray[i];
//            }
//        }
//        return minValue;

    }
     
}

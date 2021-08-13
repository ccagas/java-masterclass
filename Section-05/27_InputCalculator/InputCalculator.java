package com.ccagas;

import java.util.Scanner;

public class InputCalculator {

    public static void main(String[] args) {

        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage(){

        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        int sum = 0;

        while(true){

            boolean isAnInt = scanner.hasNextInt();

            if(isAnInt){
                int userInput = scanner.nextInt();
                counter++;
                sum += userInput;
            }else{
                System.out.println("SUM = " + sum + " AVG = " + Math.round((double) sum / counter));
                scanner.close();
                break;
            }
            scanner.nextLine();
        }
    }
}

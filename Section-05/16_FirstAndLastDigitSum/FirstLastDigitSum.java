package com.ccagas;

public class FirstLastDigitSum {

    public static void main(String[] args) {

        System.out.println(sumFirstAndLastDigit(252));
        System.out.println(sumFirstAndLastDigit(257));
        System.out.println(sumFirstAndLastDigit(0));
        System.out.println(sumFirstAndLastDigit(5));
        System.out.println(sumFirstAndLastDigit(-10));

    }

    public static int sumFirstAndLastDigit(int number) {

        int firstNumber = number;

        if(number < 0) {
            return -1;
        } else {

            while(firstNumber >= 10) {
                firstNumber = firstNumber / 10;
            }

            return (number % 10) + firstNumber;
        }
    }
}

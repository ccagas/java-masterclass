package com.ccagas;

public class EvenDigitSum {

    public static void main(String[] args) {

        System.out.println(getEvenDigitSum(123456789));
        System.out.println(getEvenDigitSum(252));
        System.out.println(getEvenDigitSum(-22));
    }

    public static int getEvenDigitSum(int number) {

        int sumOfEven = 0;

        if(number < 0) {
            return -1;
        } else {

            while(number != 0) {

                if((number % 10) % 2 == 0) {
                    sumOfEven += number % 10;
                }

                number /= 10;
            }
            return sumOfEven;
        }
    }
}

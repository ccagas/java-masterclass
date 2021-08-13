package com.ccagas;

public class NumberPalindrome {

    public static void main(String[] args) {

        System.out.println(isPalindrome(-1221));
        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(11212));
    }

    public static boolean isPalindrome(int number) {

        int tempNumber = number;
        int reverse = 0;
        int lastDigit;

        while (tempNumber != 0) {
            lastDigit = tempNumber % 10;
            reverse *= 10;
            reverse += lastDigit;
            tempNumber /= 10;
        }

        return reverse == number;
    }
}

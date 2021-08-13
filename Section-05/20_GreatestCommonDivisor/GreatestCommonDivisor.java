package com.ccagas;

public class GreatestCommonDivisor {

    public static void main(String[] args) {

        getGreatestCommonDivisor(25, 15);
        getGreatestCommonDivisor(12, 30);
        getGreatestCommonDivisor(9, 18);
        getGreatestCommonDivisor(81, 153);
    }

    public static int getGreatestCommonDivisor(int first, int second){

        int divisor = 0;

        if(first < 10 || second < 10) {
            return -1;
        } else {

            while(second != 0) {

                if(first > second) {
                    first = first - second;
                } else {
                    second = second - first;
                }

            }
            return first;
        }
    }
}

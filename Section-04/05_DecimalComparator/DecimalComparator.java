package com.ccagas;

public class DecimalComparator {

    public static void main(String[] args) {
        areEqualByThreeDecimalPlaces(-3.1756, -3.175);
        areEqualByThreeDecimalPlaces(3.1756, -3.176);
        areEqualByThreeDecimalPlaces(3.0, 3.0);
        areEqualByThreeDecimalPlaces(-3.123, 3.123);
    }

    public static boolean areEqualByThreeDecimalPlaces(double number1, double number2){

        if ( (int) (number1 * 1000) == (int) (number2 * 1000) )
        {
            System.out.println("TRUE " + number1 + " is equal to " + number2);
            return true;
        }
        else System.out.println("FALSE " + number1 + " is not equal to " + number2);
        return false;
    }

}

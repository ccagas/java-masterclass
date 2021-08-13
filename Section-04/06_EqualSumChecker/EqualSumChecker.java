package com.ccagas;

public class EqualSumChecker {

    public static void main(String[] args) {
        hasEqualSum(1, 1, 1);
        hasEqualSum(1, 1, 1);
        hasEqualSum(1, -1, 0);
    }

    public static boolean hasEqualSum(int n1, int n2, int n3)
    {
        if(n1 + n2 == n3)
        {
            System.out.println("TRUE The sum of " + n1 + " and " + n2 + " is equal to " + n3);
            return true;
        }
        else
            System.out.println("FALSE The sum of " + n1 + " and " + n2 + " is not equal to " + n3);
        return false;
    }

}

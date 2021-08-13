package com.ccagas;

public class FlourPacker {

    public static void main(String[] args) {

        System.out.println("canPack(1, 0, 4) called. Expected: false  Result: " + canPack(1, 0, 4));
        System.out.println("canPack(1, 0, 5) called. Expected: true  Result: " + canPack(1, 0, 5));
        System.out.println("canPack(0, 5, 4) called. Expected: true  Result: " + canPack(0, 5, 4));
        System.out.println("canPack(2, 2, 11) called. Expected: true  Result: " + canPack(2, 2, 11));
        System.out.println("canPack(-3, 2, 12) called. Expected: false Result: " + canPack(-3, 2, 12));
    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {

        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }

        int bigFlour = bigCount * 5;
        int sumFlour = bigFlour + smallCount;
        int remainingFlour = goal % 5;

        if (sumFlour < goal) {
            return false;
        }
        return smallCount >= remainingFlour;
    }
}

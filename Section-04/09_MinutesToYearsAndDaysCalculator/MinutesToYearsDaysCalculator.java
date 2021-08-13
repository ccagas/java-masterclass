package com.ccagas;

public class MinutesToYearsDaysCalculator {

    public static void main(String[] args) {
        printYearsAndDays(525600);
        printYearsAndDays(1051200);
        printYearsAndDays(561600);
    }

    public static void printYearsAndDays(long minutes) {

        if(minutes <0) {
            System.out.println("Invalid Value");
        } else {

            long year = minutes / 525600;
            long days = minutes / 1440;
            long remainingDays = days % 365;

            String daysString = remainingDays + " d";
            String yearString = year + " y";

            System.out.println(minutes + " min = " + yearString + " and " + daysString);
        }
    }

}

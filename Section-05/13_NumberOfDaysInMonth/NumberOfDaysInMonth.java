package com.ccagas;

public class NumberOfDaysInMonth {

    public static void main(String[] args) {

        System.out.println(isLeapYear(-1600));
        System.out.println(isLeapYear(1600));
        System.out.println(isLeapYear(2017));
        System.out.println(isLeapYear(2000));
        
    }

    public static boolean isLeapYear(int year) {
        return (year >= 1 && year <= 9999 && (year % 4 == 0 && year % 100 != 0 || year % 400 == 0));
    }

    public static int getDaysInMonth(int month, int year) {

        if (year < 0 || year > 9999) {
            return -1;
        }

        boolean isLeap = isLeapYear(year);
        int days;

        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                days = 31;
                break;
            case 2:
                days = 28;
                if (isLeap)
                    days += 1;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                days = 30;
                break;
            default:
                days = -1;
                break;
        }
        return days;
    }

}

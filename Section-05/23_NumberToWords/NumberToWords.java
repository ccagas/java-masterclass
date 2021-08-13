package com.ccagas;

public class NumberToWords {

    public static void main(String[] args) {

        System.out.println(getDigitCount(0));
        System.out.println(getDigitCount(123));
        System.out.println(getDigitCount(-12));
        System.out.println(getDigitCount(5200));
        System.out.println();
        System.out.println(reverse(-121));
        System.out.println(reverse(1212));
        System.out.println(reverse(1234));
        System.out.println(reverse(100));
    }

    public static void numberToWords(int number) {

        if (number < 0) {
            System.out.println("Invalid Value");
        } else {

            int digitCount = getDigitCount(number);
            int reversed = reverse(number);

            for (int i = 0; i < digitCount; i++) {

                int digit = reversed % 10;
                reversed /= 10;

                switch (digit) {
                    case 0:
                        System.out.println("Zero");
                        break;
                    case 1:
                        System.out.println("One");
                        break;
                    case 2:
                        System.out.println("Two");
                        break;
                    case 3:
                        System.out.println("Three");
                        break;
                    case 4:
                        System.out.println("Four");
                        break;
                    case 5:
                        System.out.println("Five");
                        break;
                    case 6:
                        System.out.println("Six");
                        break;
                    case 7:
                        System.out.println("Seven");
                        break;
                    case 8:
                        System.out.println("Eight");
                        break;
                    case 9:
                        System.out.println("Nine");
                        break;
                }
            }
        }
    }

    public static int reverse(int number) {

        int reverse = 0; // 0, 0, 0, 1
        int tempNumber = number;

        while(tempNumber != 0 || tempNumber <0) {

            int lastDigit = tempNumber % 10; // = 0, 0, 0, 1

            reverse *= 10; // 0, 0, 0, 0
            reverse += lastDigit; // 0, 0, 0, 1
            tempNumber /= 10; // 100, 10, 1, 0
        }
        return reverse;
    }

    public static int getDigitCount(int number) {

        if(number < 0) {
            return -1;
        }

        return Integer.toString(number).length();
    }
}

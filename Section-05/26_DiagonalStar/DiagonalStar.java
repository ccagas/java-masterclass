package com.ccagas;

public class DiagonalStar {

    public static void main(String[] args) {

        printSquareStar(5);
        System.out.println();
        printSquareStar(8);
        System.out.println();
        printSquareStar(0);
    }

    public static void printSquareStar(int number){

        if(number < 5){
            System.out.println("Invalid Value");
        }else{

            // i is row, j is column
            for(int i = 1; i <= number; i++){

                for(int j = 1; j <= number; j++){

                    // Print * on first or last row
                    // Print * on first or last column
                    // Print * on row number equals column number
                    // Print * on column number that equals number - i + 1
                    if(i == 1 || i == number || j == 1 || j == number || i == j || j == number - i + 1){
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }
}

package com.ccagas;

public class TeenNumberChecker {

    public static void main(String[] args) {

        hasTeen(9, 99, 19);
        hasTeen(23, 15, 42);
        hasTeen(22, 23, 34);

    }

    public static boolean hasTeen(int n1, int n2, int n3)
    {
        if((n1 >=13 && n1 <=19) || (n2 >=13 && n2 <=19) || (n3 >=13 && n3 <=19))
        {
            System.out.println("has Teen");
            return true;
        }
        else
            System.out.println("no Teen");
        return false;
    }

    public static boolean isTeen(int teen)
    {
        if(teen >=13 && teen <=19)
        {
            System.out.println(teen + " is teen");
            return true;
        }
        else System.out.println(teen + " not teen");
        return false;
    }

}

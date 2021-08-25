package com.ccagas;

public class Main {

    public static void main(String[] args) {

        Car car = new Car(4, "Base car");
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());

        System.out.println();

        Mitsubishi mitsubishi = new Mitsubishi(4, "Outlander 4WD");
        System.out.println(mitsubishi.startEngine());
        System.out.println(mitsubishi.accelerate());
        System.out.println(mitsubishi.brake());

        System.out.println();

        Holden holden = new Holden(6, "Commander");
        System.out.println(holden.startEngine());
        System.out.println(holden.accelerate());
        System.out.println(holden.brake());

        System.out.println();

        Ford ford = new Ford(8, "F-150");
        System.out.println(ford.startEngine());
        System.out.println(ford.accelerate());
        System.out.println(ford.brake());

    }

}

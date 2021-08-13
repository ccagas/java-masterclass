package com.ccagas;

public class TestPoolArea {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 10);
        System.out.println("rectangle.width() = " + rectangle.getWidth());
        System.out.println("rectangle.length() = " + rectangle.getLength());
        System.out.println("rectangle.area() = " + rectangle.getArea());
        System.out.println();
        Cuboid cuboid = new Cuboid(5, 5, 10);
        System.out.println("cuboid.width() = " + cuboid.getWidth());
        System.out.println("cuboid.length() = " + cuboid.getLength());
        System.out.println("cuboid.area() = " + cuboid.getArea());
        System.out.println("cuboid.height() = " + cuboid.getHeight());
    }
}
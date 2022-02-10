package com;

public class Circle {
    private static double radius;
    final static double PI = Math.PI;

    Circle() {

    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public static void area(double radius) {
        double areaOfCircle = radius * radius * PI;
        System.out.println(areaOfCircle);
    }

    public static void circumference(double radius) {
        double circumferenceOfCircle = PI * 2 * radius;
        System.out.println(circumferenceOfCircle);
    }
}

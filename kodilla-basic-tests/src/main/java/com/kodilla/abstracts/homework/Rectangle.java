package com.kodilla.abstracts.homework;

public class Rectangle extends Shape {
    private double a;
    private double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double surfaceArea() {
        double surfaceArea = a * b;
        return surfaceArea;
    }

    @Override
    public double perimeter() {
        double perimeter = (a + b) * 2.0;
        return perimeter;
    }
}

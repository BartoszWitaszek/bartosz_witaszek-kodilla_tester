package com.kodilla.abstracts.homework;

public class Circle extends Shape {
    private double r;

    public Circle(double r) {
        this.r = r;
    }

    @Override
    public double surfaceArea() {
        double surfaceArea = 3.14 * (r * r);
        return surfaceArea;
    }

    @Override
    public double perimeter() {
        double perimeter = 2 * 3.14 * r;
        return perimeter;
    }
}

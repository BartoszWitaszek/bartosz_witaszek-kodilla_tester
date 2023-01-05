package com.kodilla.abstracts.homework;

public class Square extends Shape {

    private double a;

    public Square(double a) {
        this.a = a;
    }

    @Override
    public double surfaceArea() {
        double surfaceArea = a * a;
        return surfaceArea;
    }

    @Override
    public double perimeter() {
        double perimeter = a * 4.0;
        return perimeter;
    }
}

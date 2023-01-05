package com.kodilla.abstracts.homework;

public class Application {
    public static void main(String[] args) {
        Shape square = new Square(2);
        Shape rectangle = new Rectangle(3, 4);
        Shape circle = new Circle(3);

        shapeParameters("Pole kwadratu wynosi: ", square);
        shapeParameters("Pole prostokąta wynosi: ", rectangle);
        shapeParameters("Pole koła wynosi: ", circle);

    }

    private static void shapeParameters(String x, Shape shape) {
        System.out.println(x + shape.surfaceArea() + " , a obwód: " + shape.perimeter());
    }
}

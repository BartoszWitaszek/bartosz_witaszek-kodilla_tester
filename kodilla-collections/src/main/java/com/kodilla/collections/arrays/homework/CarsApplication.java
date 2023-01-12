package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Fiat;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Opel;

import java.util.Random;

public class CarsApplication {

    private static final Random RANDOM = new Random();

    public static void main(String[] args) {
        Car[] cars = new Car[15];
        for (int n = 0; n < cars.length; n++)
            cars[n] = drawCar();
        for (Car car : cars)
            CarUtils.describeCar(car);
    }

    private static Car drawCar() {
        int drawnCarBrand = RANDOM.nextInt(3);
        int speed = RANDOM.nextInt(60);
        if (drawnCarBrand == 0)
            return new Fiat(speed);
        else if (drawnCarBrand == 1)
            return new Ford(speed);
        else
            return new Opel(speed);
    }
}

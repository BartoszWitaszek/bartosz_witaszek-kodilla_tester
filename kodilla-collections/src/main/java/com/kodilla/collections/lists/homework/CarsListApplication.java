package com.kodilla.collections.lists.homework;

import com.kodilla.collections.interfaces.homework.Fiat;
import com.kodilla.collections.arrays.homework.CarUtils;

import java.util.ArrayList;
import java.util.List;

public class CarsListApplication {
    public static void main(String[] args) {
        List<Fiat> cars = new ArrayList<>();
        cars.add(new Fiat(30));
        cars.add(new Fiat(45));
        Fiat fiat1 = new Fiat(25);
        cars.add(fiat1);
        cars.add(new Fiat(17));
        cars.add(new Fiat(36));

        System.out.println("Size: " + cars.size());
        for (Fiat fiat : cars) {
            CarUtils.describeCar(fiat);
        }

        cars.remove(1);
        cars.remove(fiat1);

        System.out.println();
        System.out.println("Size after removing: " + cars.size());

        for (Fiat fiat : cars) {
            CarUtils.describeCar(fiat);
        }
    }
}

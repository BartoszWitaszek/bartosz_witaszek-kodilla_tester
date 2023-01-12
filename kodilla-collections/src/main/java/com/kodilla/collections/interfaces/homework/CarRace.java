package com.kodilla.collections.interfaces.homework;

public class CarRace {
    public static void main(String[] args) {

        System.out.println("Fiat:");
        Car fiat = new Fiat(80);
        doRace(fiat);

        System.out.println("Ford:");
        Car ford = new Ford(40);
        doRace(ford);

        System.out.println("Opel:");
        Car opel = new Opel(100);
        doRace(opel);
    }

    private static void doRace(Car car) {
        System.out.println("Initial speed: " + car.getSpeed());
        car.increaseSpeed();
        car.increaseSpeed();
        car.increaseSpeed();
        car.decreaseSpeed();
        car.decreaseSpeed();
        System.out.println("Final speed: " + car.getSpeed());
    }
}

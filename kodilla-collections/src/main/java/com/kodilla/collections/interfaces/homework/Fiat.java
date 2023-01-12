package com.kodilla.collections.interfaces.homework;

public class Fiat implements Car {

    private int speed;

    public Fiat(int speed) {
        this.speed = speed;
    }

    @Override
    public int getSpeed() {

        return speed;
    }

    @Override
    public void increaseSpeed() {
        int increaseSpeed = 20;
        speed += increaseSpeed;
        System.out.println("Speed increased by " + increaseSpeed);
    }

    @Override
    public void decreaseSpeed() {
        int decreaseSpeed = 10;
        speed -= decreaseSpeed;
        System.out.println("Speed decreased by " + decreaseSpeed);
    }
}

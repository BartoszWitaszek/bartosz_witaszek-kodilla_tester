package com.kodilla.collections.interfaces.homework;

public class Opel implements Car {

    private int speed;

    public Opel(int speed) {
        this.speed = speed;
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void increaseSpeed() {
        int increaseSpeed = 27;
        speed += increaseSpeed;
        System.out.println("Speed increased by " + increaseSpeed);
    }

    @Override
    public void decreaseSpeed() {
        int decreaseSpeed = 14;
        speed -= decreaseSpeed;
        System.out.println("Speed decreased by " + decreaseSpeed);
    }
}

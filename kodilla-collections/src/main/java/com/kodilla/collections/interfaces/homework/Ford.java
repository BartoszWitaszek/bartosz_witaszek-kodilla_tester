package com.kodilla.collections.interfaces.homework;

public class Ford implements Car {

    private int speed;

    public Ford(int speed) {
        this.speed = speed;
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void increaseSpeed() {
        int increaseSpeed = 30;
        speed += increaseSpeed;
        System.out.println("Speed increased by " + increaseSpeed);
    }

    @Override
    public void decreaseSpeed() {
        int decreaseSpeed = 17;
        speed -= decreaseSpeed;
        System.out.println("Speed decreased by " + decreaseSpeed);
    }
}

package com.kodilla.spring.basic.spring_configuration.homework;

import java.time.LocalTime;

public interface Car {

    boolean hasHeadLightsTurnedOn(LocalTime time);

    String getCarType();
}
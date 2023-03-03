package com.kodilla.spring.basic.spring_configuration.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.List;

@SpringBootTest
class CarFactoryTestSuite {
    private ApplicationContext context;

    @BeforeEach
    public void setUp() {
        context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
    }

    @Test
    public void shouldReturnCarTypeDependingOnSeason() {
        Car car = (Car) context.getBean("pickCarDependingOnSeason");
        String type = car.getCarType();
        System.out.println("Car type: " + type + " , Local date: " + LocalDate.now());
        List<String> possibleCars = Arrays.asList("Sedan", "SUV", "Cabrio");
        Assertions.assertTrue(possibleCars.contains(type));
    }

    @ParameterizedTest
    @ValueSource(strings = {"20:00:00", "06:00:00"})
    public void ShouldLightsBeTurnedOnDuringNight(String time) {
        Car car = (Car) context.getBean("pickCarDependingOnSeason");

        Assertions.assertTrue(car.hasHeadLightsTurnedOn(LocalTime.parse(time)));
    }

    @ParameterizedTest
    @ValueSource(strings = {"19:59:00", "06:01:00"})
    public void ShouldLightsBeTurnedOffDuringDay(String time) {
        Car car = (Car) context.getBean("pickCarDependingOnSeason");

        Assertions.assertFalse(car.hasHeadLightsTurnedOn(LocalTime.parse(time)));
    }
}
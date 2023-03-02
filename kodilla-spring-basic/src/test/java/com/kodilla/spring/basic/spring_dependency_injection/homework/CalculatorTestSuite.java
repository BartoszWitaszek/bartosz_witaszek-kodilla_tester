package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

class CalculatorTest {
    private ApplicationContext context;
    private Display display;
    private Calculator calculator;

    @BeforeEach
    public void setUp() {
        context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        display = context.getBean(Display.class);
        calculator = context.getBean(Calculator.class);
    }

    @Test
    void add() {
        Assertions.assertEquals(10, calculator.add(5, 5));
    }

    @Test
    void subtract() {
        Assertions.assertEquals(0, calculator.subtract(5, 5));
    }

    @Test
    void multiply() {
        Assertions.assertEquals(25, calculator.multiply(5, 5));
    }

    @Test
    void divide() {
        Assertions.assertEquals(1, calculator.divide(5, 5));
    }
}
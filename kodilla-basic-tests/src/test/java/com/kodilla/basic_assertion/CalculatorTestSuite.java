package com.kodilla.basic_assertion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTestSuite {

    @Test
    public void testSum() {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int sumResult = calculator.sum(a, b);
        assertEquals(13, sumResult);
    }

    @Test
    public void testSubtract() {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int subtractResult = calculator.subtract(a, b);
        assertEquals(-3, subtractResult);
    }

    @Test
    public void testSquaring() {
        Calculator calculator = new Calculator();
        double a = -3.0;
        double b = 0.0;
        double c = 1.5;
        double delta = 0.2;
        double squaringResult = calculator.squaring(a);
        assertEquals(9, squaringResult, delta);
        double squaringResult2 = calculator.squaring(b);
        assertEquals(0, squaringResult2, delta);
        double squaringResult3 = calculator.squaring(c);
        assertEquals(2.25, squaringResult3, delta);
    }
}

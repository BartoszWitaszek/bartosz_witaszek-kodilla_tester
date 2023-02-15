package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class BMISource {
    public static Stream<Arguments> shouldCalculateBMI() {
        return Stream.of(
                Arguments.of(new Person(1.55, 70), "Overweight"),
                Arguments.of(new Person(2, 59), "Very severely underweight"),
                Arguments.of(new Person(1.6, 41), "Underweight"),
                Arguments.of(new Person(1.68, 115), "Obese Class III (Very severely obese)"),
                Arguments.of(new Person(1.8, 150), "Obese Class IV (Morbidly Obese)")
        );
    }
}
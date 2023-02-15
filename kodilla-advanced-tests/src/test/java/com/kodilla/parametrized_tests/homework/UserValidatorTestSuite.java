package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EmptySource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class UserValidatorTestSuite {
    private UserValidator userValidator = new UserValidator();

    @ParameterizedTest
    @ValueSource(strings = {"tam.taram", "something_something", "ccc", "ccc66", "456"})
    public void shouldReturnTrueForCorrectUsername(String input) {
        assertTrue(userValidator.validateUsername(input));
    }

    @ParameterizedTest
    @ValueSource(strings = {"sa", "d", "&&&", "***", "test!!"})
    public void shouldReturnFalseForIncorrectUsername(String input) {
        assertFalse(userValidator.validateUsername(input));
    }

    @ParameterizedTest
    @EmptySource
    public void shouldReturnFalseForEmptyUsername(String input) {
        assertFalse(userValidator.validateUsername(input));
    }

    @ParameterizedTest
    @ValueSource(strings = {"tam.taram@gmail.com", "666.777@888.com", "test@gmail.com", "___-_.---_-@---.com"})
    public void shouldReturnTrueForCorrectEmail(String input) {
        assertTrue(userValidator.validateEmail(input));
    }

    @ParameterizedTest
    @ValueSource(strings = {"&&.&&@gmail.com", "test@.com", "@666.com", "test@", "test", "@"})
    public void shouldReturnFalseForIncorrectEmail(String input) {
        assertFalse(userValidator.validateEmail(input));
    }
}
package com.kodilla.collections.adv.exercises.homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FlightFinderTestSuite {
    FlightFinder flightFinder;

    @BeforeEach
    public void sutUp(){
        flightFinder = new FlightFinder();
    }

    @Test
    public void testFindFlightsFrom() {
        List<Flight> result = flightFinder.findFlightsFrom("Warsaw");

        List<Flight> expectedList = new ArrayList<>();
        expectedList.add(new Flight("Warsaw", "London"));
        expectedList.add(new Flight("Warsaw", "Rome"));
        expectedList.add(new Flight("Warsaw", "Madrid"));
        assertEquals(expectedList, result);
    }

    @Test
    public void testFindFlightsTo() {
        List<Flight> result = flightFinder.findFlightsTo("Madrid");

        List<Flight> expectedList = new ArrayList<>();
        expectedList.add(new Flight("Warsaw", "Madrid"));
        expectedList.add(new Flight("Rome", "Madrid"));
        assertEquals(expectedList, result);
    }
}
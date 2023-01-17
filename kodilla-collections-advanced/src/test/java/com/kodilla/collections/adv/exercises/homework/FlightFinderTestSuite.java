package com.kodilla.collections.adv.exercises.homework;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FlightFinderTestSuite {

    @Test
    public void testFindFlightsFrom() {
        FlightFinder flightFinder = new FlightFinder();

        List<Flight> result = flightFinder.findFlightsFrom("Warsaw");

        List<Flight> expectedList = new ArrayList<>();
        expectedList.add(new Flight("Warsaw", "London"));
        expectedList.add(new Flight("Warsaw", "Rome"));
        expectedList.add(new Flight("Warsaw", "Madrid"));
        assertEquals(expectedList, result);
    }

    @Test
    public void testFindFlightsTo() {
        FlightFinder flightFinder = new FlightFinder();

        List<Flight> result = flightFinder.findFlightsTo("Madrid");

        List<Flight> expectedList = new ArrayList<>();
        expectedList.add(new Flight("Warsaw", "Madrid"));
        expectedList.add(new Flight("Rome", "Madrid"));
        assertEquals(expectedList, result);
    }
}
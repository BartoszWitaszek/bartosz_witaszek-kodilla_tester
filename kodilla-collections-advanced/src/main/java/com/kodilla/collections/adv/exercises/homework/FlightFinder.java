package com.kodilla.collections.adv.exercises.homework;

import java.util.ArrayList;
import java.util.List;

public class FlightFinder {
    public List<Flight> findFlightsFrom(String departure) {
        List<Flight> results = new ArrayList<>();

        for (Flight searchedFlight : FlightRepository.getFlightsTable()) {
            if (searchedFlight.getDeparture().equals(departure)) {
                results.add(searchedFlight);
            }
        }
        return results;
    }

    public List<Flight> findFlightsTo(String arrival) {
        List<Flight> results = new ArrayList<>();

        for (Flight searchedFlight : FlightRepository.getFlightsTable()) {
            if (searchedFlight.getArrival().equals(arrival)) {
                results.add(searchedFlight);
            }
        }
        return results;
    }
}
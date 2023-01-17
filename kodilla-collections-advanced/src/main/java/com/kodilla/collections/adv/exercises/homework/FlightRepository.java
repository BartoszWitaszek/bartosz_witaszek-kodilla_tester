package com.kodilla.collections.adv.exercises.homework;

import java.util.ArrayList;
import java.util.List;

public class FlightRepository {
    public static List<Flight> getFlightsTable() {
        List<Flight> flights = new ArrayList<>();

        flights.add(new Flight("Warsaw", "London"));
        flights.add(new Flight("Warsaw", "Rome"));
        flights.add(new Flight("London", "Paris"));
        flights.add(new Flight("Warsaw", "Madrid"));
        flights.add(new Flight("Rome", "Madrid"));
        flights.add(new Flight("Madrid", "Paris"));

        System.out.println(flights);
        return flights;
    }
}

package com.kodilla.exception.test;

import com.kodilla.exception.nullpointer.MessageNotSentException;

import java.util.HashMap;
import java.util.Map;

public class FlightFinder {
    public void findFlight(Flight flight) throws RouteNotFoundException {
        Map<String, Boolean> destinations = new HashMap<>();
        destinations.put("Warszawa", true);
        destinations.put("Kraków", true);
        destinations.put("Tokyo", false);
        if(destinations.get(flight.getArrivalAirport()) != null) {
            System.out.println("Flight has been found.");
        } else {
            throw new RouteNotFoundException("There is no such arrival airport.");
        }
    }
}

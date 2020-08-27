package com.kodilla.exception.test;

import com.kodilla.exception.nullpointer.MessageNotSentException;

import java.util.HashMap;
import java.util.Map;

public class FlightFinder {
    private Map<String, Boolean> destinations = new HashMap<>();
    public FlightFinder() {
        destinations.put("Warszawa", true);
        destinations.put("Kraków", true);
        destinations.put("Tokyo", false);
    }

    public void findFlight(Flight flight) throws RouteNotFoundException {
        if(destinations.get(flight.getArrivalAirport()) != null) {
            if (destinations.get(flight.getArrivalAirport())) {
                System.out.println("Flight has been found.");
            } else {
                System.out.println("ERROR. Airport is not available.");
            }
        } else {
            throw new RouteNotFoundException("ERROR. There is no such arrival airport.");
        }
    }
}

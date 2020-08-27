package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class ThirdChallenge {
    public static void main(String[] args) throws RouteNotFoundException {
        FlightFinder thirdChallenge = new FlightFinder();
        Flight myFlight1 = new Flight("Kraków", "Tokyo");
        Flight myFlight2 = new Flight("Kraków", "Kłajpeda");
        Flight myFlight3 = new Flight("Kraków", "Warszawa");
        try {
            thirdChallenge.findFlight(myFlight1);
        } catch (RouteNotFoundException e) {
            System.out.println(e);
        }
        try {
            thirdChallenge.findFlight(myFlight2);
        } catch (RouteNotFoundException e) {
            System.out.println(e);
        }
        try {
            thirdChallenge.findFlight(myFlight3);
        } catch (RouteNotFoundException e) {
            System.out.println(e);
        }
    }
}

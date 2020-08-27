package com.kodilla.exception.test;

public class ThirdChallenge {
    public static void main(String[] args) throws RouteNotFoundException {
        FlightFinder thirdChallenge = new FlightFinder();
        Flight myFlight = new Flight("Kraków", "Kłajpeda");
        try {
            thirdChallenge.findFlight(myFlight);
        } catch (RouteNotFoundException e) {
            System.out.println("There is no such airport");
        }
    }
}

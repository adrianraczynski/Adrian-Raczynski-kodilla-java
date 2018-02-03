package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightSearchApplication {

    public static void main(String[] args) {

        FlightSearch flightSearch = new FlightSearch ();

        Flight myFlights = new Flight ("Paris", null);


        try {

            flightSearch.findFlight (myFlights);

        } catch (RouteNotFoundException e) {

            System.out.println("We haven't this airport on the list.  Fault: " + e);

        }
    }
}
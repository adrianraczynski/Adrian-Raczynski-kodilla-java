package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightSearchApplication {

    public static void main(String[] args) {

        Flight myFlights = new Flight ("Honkong", "Honkong");

        FlightSearch flightSearch = new FlightSearch ();


        System.out.println(flightSearch.findFlight (myFlights));


    }
}


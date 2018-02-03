package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightSearch {

    private Map <String,Boolean> flightsMap;

    public FlightSearch() {

        prepareFlightSchedul();

    }

    public void findFlight(Flight flight) throws RouteNotFoundException {

        String destination = flight.getArrivalAirport();
        if (flightsMap.containsKey(destination) && flightsMap.get(destination) == true) {

            System.out.println("Selected city is on the Schedul. You can flight to" + destination);

        } else {

            throw new RouteNotFoundException();
        }
    }

    private void prepareFlightSchedul() {
        flightsMap = new HashMap<>();
        flightsMap.put ("Tokio",true);
        flightsMap.put ("Cracow",true);
        flightsMap.put ("Warsaw",true);
        flightsMap.put ("Babimost",false);
        flightsMap.put ("Szczecin",false);
    }
}
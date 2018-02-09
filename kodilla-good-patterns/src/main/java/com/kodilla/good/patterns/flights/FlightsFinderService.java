package com.kodilla.good.patterns.flights;

import java.util.List;

public interface FlightsFinderService {

    boolean findFlight (String departureAirport, String arrivalAirport);

    List<String> findDepartureCity (String arrivalAirport);

    List <String> findArrivalCity(String departureAirport);

}
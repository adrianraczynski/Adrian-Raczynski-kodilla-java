package com.kodilla.good.patterns.flights;

import java.util.ArrayList;
import java.util.List;

public class MomondoServis implements FlightsFinderService {

    private List<Flight> flights;

    public MomondoServis(List<Flight> flights) {          // Ta klasa ma być jak np. MailService w pakiecie allegro, processor będzie robił DTO i w klasie Application będę robił wrzucał danę, w postaci listy lotów
        this.flights = flights;
    }

    public boolean findFlight(String departureAirport, String arrivalAirport) {

        for (Flight flight : flights) {
            if (flight.getDepartureAirport().equals(departureAirport) && flight.getArrivalAirport().equals(arrivalAirport)) {
                return true;
            }
        }
        return false;
    }

    public List <String> findDepartureCity(String arrivalAirport) {

        List <String> departureCities = new ArrayList<>();
        for (Flight flight : flights) {
            if (flight.getArrivalAirport().equals(arrivalAirport)) {
                departureCities.add (flight.getDepartureAirport());
            }
        }
        return departureCities;
    }

    public List <String> findArrivalCity(String departureAirport) {

        List <String> arrivalCities = new ArrayList<>();
        for (Flight flight : flights) {
            if (flight.getDepartureAirport().equals(departureAirport)) {
                arrivalCities.add (flight.getArrivalAirport());
            }
        }
        return arrivalCities;
    }
}



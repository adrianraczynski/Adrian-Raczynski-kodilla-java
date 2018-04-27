package com.kodilla.good.patterns.flights2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FlightsSearchEngine {

    private DomesticFlightsList domesticFlightsList;
    private List<Flight> searchingDepartureAirport;
    private List<Flight> searchingArrivalAirport;

    public FlightsSearchEngine(DomesticFlightsList domesticFlightsList) {
        this.domesticFlightsList = domesticFlightsList;
    }

    public List<Flight> findFlightFromCity (String departureAirport) {

        searchingDepartureAirport = domesticFlightsList.getFlightsList().stream()
                                            .filter(s -> s.getDepartureAirport().equals(departureAirport))
                                            //.map(s -> s.getArrivalAirport())
                                            .collect(Collectors.toList());

        return searchingDepartureAirport;
    }

    public List<Flight> findFlightToCity (String arrivalAirport) {
        searchingArrivalAirport = domesticFlightsList.getFlightsList().stream()
                                            .filter(s -> s.getArrivalAirport().equals(arrivalAirport))
                                            //.map(s -> s.getDepartureAirport())
                                            .collect(Collectors.toList());

        return searchingArrivalAirport;
    }

    public Map<String, List<String>> findFlightThroughAnotherCity (String stopoverCity) {
        findFlightFromCity(stopoverCity);
        findFlightToCity(stopoverCity);
        Map<String, List<String>> searchingStopoverCity = new HashMap<>();

        for (Flight af : searchingArrivalAirport) {                 //af = arrival flight
            List<String> possibleFlight = new ArrayList<>();

            for (Flight df : searchingDepartureAirport) {           ////df = departure flight

                if (af.getArrivalDay().equals(df.getDepartureDay())) {
                    possibleFlight.add(df.getArrivalAirport());
                }
            }
            searchingStopoverCity.put (af.getDepartureAirport(), possibleFlight);
        }
        return searchingStopoverCity;
    }
}
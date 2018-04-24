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
    Map<Flight, List<Flight>> searchingStopoverCity;

    public FlightsSearchEngine(DomesticFlightsList domesticFlightsList) {
        this.domesticFlightsList = domesticFlightsList;
    }

    public void findFlightFromCity (String departureAirport) {

        searchingDepartureAirport = domesticFlightsList.getFlightsList().stream()
                                            .filter(s -> s.getDepartureAirport().equals(departureAirport))
                                            //.map(s -> s.getArrivalAirport())
                                            .collect(Collectors.toList());

        //System.out.println(searchingDepartureAirport + "\n");   //czemu po uruchomieniu programu nie wyświetla pod spodem
    }

    public void findFlightToCity (String arrivalAirport) {
        searchingArrivalAirport = domesticFlightsList.getFlightsList().stream()
                                            .filter(s -> s.getArrivalAirport().equals(arrivalAirport))
                                            //.map(s -> s.getDepartureAirport())
                                            .collect(Collectors.toList());

        //System.out.println(searchingArrivalAirport);
    }


    public void findFlightThroughAnotherCity (String stopoverCity) {
        findFlightFromCity(stopoverCity);
        findFlightToCity(stopoverCity);
        Map<String, List<String>> searchingStopoverCity = new HashMap<>();


        for (Flight df : searchingDepartureAirport) {
             List<String> possibleFlight = new ArrayList<>();

             for (Flight af : searchingArrivalAirport) {

                if (df.getArrivalDay().equals(af.getDepartureDay())) {
                    possibleFlight.add(af.getArrivalAirport());

                }

             }
            searchingStopoverCity.put (df.getDepartureAirport(), possibleFlight);

        }


        System.out.println(searchingStopoverCity + "\n");
    }
}
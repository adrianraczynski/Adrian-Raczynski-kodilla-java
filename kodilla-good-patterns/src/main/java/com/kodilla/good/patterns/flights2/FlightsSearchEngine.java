package com.kodilla.good.patterns.flights2;

import java.util.List;
import java.util.stream.Collectors;

public class FlightsSearchEngine {

    private DomesticFlightsList domesticFlightsList;

    public FlightsSearchEngine(DomesticFlightsList domesticFlightsList) {
        this.domesticFlightsList = domesticFlightsList;
    }

    public void findFlightFromCity (String departureAirport) {

        List<String> searchingDepartureAirport = domesticFlightsList.getFlightsList().stream()
                                            .filter(s -> s.getDepartureAirport().equals(departureAirport))
                                            .map(s -> toString() + "\n")
                                            .collect(Collectors.toList());

        System.out.println(searchingDepartureAirport + "\n");   //czemu po uruchomieniu programu nie wyświetla pod spodem
    }

    public void findFlightToCity (String arrivalAirport) {
        List<String> searchingArrivalAirport = domesticFlightsList.getFlightsList().stream()
                                            .filter(s -> s.getArrivalAirport().equals(arrivalAirport))
                                            .map(s -> toString() + "\n")
                                            .collect(Collectors.toList());

        System.out.println(searchingArrivalAirport);
    }


    //public void findFlightThroughAnotherCity (String stopoverCity) {
    //    List<String> searchingArrivalAirport = domesticFlightsList.getFlightsList().stream()
    //                                        .filter()
    //                                        .map(s -> toString())
    //                                        .collect(Collectors.toList());

    //    System.out.println(searchingArrivalAirport + "\n");
    //}
}
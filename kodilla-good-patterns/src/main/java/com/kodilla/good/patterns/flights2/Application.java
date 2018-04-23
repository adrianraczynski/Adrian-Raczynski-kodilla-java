package com.kodilla.good.patterns.flights2;

public class Application {

    public static void main(String[] args) {

        DomesticFlightsList domesticFlightsList = new DomesticFlightsList();
        FlightsSearchEngine flightsSearchEngine = new FlightsSearchEngine(domesticFlightsList);

        flightsSearchEngine.findFlightFromCity("Gdansk");
        flightsSearchEngine.findFlightToCity("Wroclaw");
        //flightsSearchEngine.findFlightThroughAnotherCity("Warszawa");
    }

}
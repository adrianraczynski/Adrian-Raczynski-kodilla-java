package com.kodilla.good.patterns.flights2;


public class Application {

    public static void main(String[] args) {

        DomesticFlightsList domesticFlightsList = new DomesticFlightsList();
        FlightsSearchEngine flightsSearchEngine = new FlightsSearchEngine(domesticFlightsList);


        System.out.println("All flights from Gdansk:" + "\n" + flightsSearchEngine.findFlightFromCity("Gdansk") + "\n");
        System.out.println("All flights to Wroclaw:" + "\n" + flightsSearchEngine.findFlightToCity("Wroclaw") + "\n");

        System.out.println("Departure airport -> " + flightsSearchEngine.findFlightThroughAnotherCity("Szczecin") + "<- arrival airport.");
    }
}
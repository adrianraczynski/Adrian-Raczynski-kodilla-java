/**

package com.kodilla.good.patterns.flights;

import com.kodilla.good.patterns.food2door.Processor;

import java.util.ArrayList;
import java.util.List;

public class Application {

    public static void main(String[] args) {

        List<Flight> flightsList = new ArrayList<>();
        flightsList.add(new Flight("Warsaw", "Tokyo"));
        flightsList.add(new Flight("Tokyo", "Warsaw"));
        flightsList.add(new Flight("Warsaw", "Paris"));
        flightsList.add(new Flight("Paris", "Warsaw"));


        FlightRequest flightRequest = new FlightRequest ();

        SearchFlightProcessor searchFlightProcessor = new SearchFlightProcessor(new MomondoServis(flightsList));
        searchFlightProcessor.runProcessor (flightRequest /**albo zrobić metodę flightRequest);

    }
}

**/
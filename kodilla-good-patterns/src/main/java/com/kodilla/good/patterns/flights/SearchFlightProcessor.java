/**

 package com.kodilla.good.patterns.flights;

public class SearchFlightProcessor {



    private MomondoServis flightSchedule;

    public SearchFlightProcessor(MomondoServis flightSchedule) {
        this.flightSchedule = flightSchedule;
    }

    public MomondoServis searchArrivalCity(String arrivalAirport) {


       if (flightSchedule.equals(arrivalAirport)) {

           return flightSchedule;

       } else {
           System.out.println("We don't flight to this city. Choose some else city and try again. Have a good time with OnionAirlines.");
       }

        return flightSchedule;
    }


    public MomondoServis searchDepartureCity(String departureAirport) {

        if (flightSchedule.equals(departureAirport)) {

            return flightSchedule;

        } else {
            System.out.println("We don't flight from this city. Start from another city and try again. Have a good time with OnionAirlines.");
        }

        return flightSchedule;
    }
}

        **/
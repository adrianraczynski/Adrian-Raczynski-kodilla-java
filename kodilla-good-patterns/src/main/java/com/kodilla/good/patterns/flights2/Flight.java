package com.kodilla.good.patterns.flights2;

import java.time.DayOfWeek;
import java.util.Objects;

public class Flight {

    private String departureAirport;
    private String arrivalAirport;
    private DayOfWeek departureDay;
    private DayOfWeek arrivalDay;

    public Flight(String departureAirport, DayOfWeek departureDay ,String arrivalAirport, DayOfWeek arrivalDay) {
         this.departureAirport = departureAirport;
         this.departureDay = departureDay;
         this.arrivalAirport = arrivalAirport;
         this.arrivalDay = arrivalDay;
    }

    public String getDepartureAirport() {
        return departureAirport;
     }

    public String getArrivalAirport() {
        return arrivalAirport;
    }

    public DayOfWeek getDepartureDay() {
        return departureDay;
    }

    public DayOfWeek getArrivalDay() {
        return arrivalDay;
    }

    @Override
    public String toString() {
        return "Flight from: " + departureAirport + ", to: " + arrivalAirport + ". Departure day: " + departureDay + ", Arrival day: " + arrivalDay;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Flight)) return false;
        Flight flight = (Flight) o;
        return Objects.equals(departureAirport, flight.departureAirport) &&
                Objects.equals(arrivalAirport, flight.arrivalAirport) &&
                departureDay == flight.departureDay &&
                arrivalDay == flight.arrivalDay;
    }

    @Override
    public int hashCode() {

        return 7*Objects.hash(departureAirport, arrivalAirport, departureDay, arrivalDay);
    }
}

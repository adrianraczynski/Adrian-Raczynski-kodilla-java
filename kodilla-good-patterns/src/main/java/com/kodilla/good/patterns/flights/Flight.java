package com.kodilla.good.patterns.flights;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Objects;

public class Flight {

        private String departureAirport;
        private String arrivalAirport;
        private LocalTime departureTime;
        private LocalTime arrivalTime;
        private LocalDate departureDate;
        private LocalDate arrivalDate;


    public Flight(String departureAirport, String arrivalAirport, int hour, int minute, int year,
                  int month, int day) {
        this.departureAirport = departureAirport;
        this.arrivalAirport = arrivalAirport;
        this.departureTime = LocalTime.of(hour, minute);
        this.arrivalTime = LocalTime.of(hour, minute);
        this.departureDate = LocalDate.of(year, month, day);
        this.arrivalDate = LocalDate.of(year, month, day);

    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public String getArrivalAirport() {
        return arrivalAirport;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Flight)) return false;
        Flight flight = (Flight) o;
        return Objects.equals(departureAirport, flight.departureAirport) &&
                Objects.equals(arrivalAirport, flight.arrivalAirport) &&
                Objects.equals(departureTime, flight.departureTime) &&
                Objects.equals(arrivalTime, flight.arrivalTime) &&
                Objects.equals(departureDate, flight.departureDate) &&
                Objects.equals(arrivalDate, flight.arrivalDate);
    }

    @Override
    public int hashCode() {

        return Objects.hash(departureAirport, arrivalAirport, departureTime, arrivalTime, departureDate, arrivalDate)*7;
    }
}

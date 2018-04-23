package com.kodilla.good.patterns.flights2;

import java.time.DayOfWeek;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class DomesticFlightsList {

   public List<Flight> getFlightsList () {

       List<Flight> flightsList = new ArrayList<>();

       flightsList.add(new Flight("Wroclaw", DayOfWeek.MONDAY,"Gdansk", DayOfWeek.MONDAY ));
       flightsList.add(new Flight("Wroclaw", DayOfWeek.TUESDAY,"Gdansk", DayOfWeek.TUESDAY));
       flightsList.add(new Flight("Wroclaw", DayOfWeek.WEDNESDAY,"Gdansk", DayOfWeek.THURSDAY));

       flightsList.add(new Flight("Gdansk", DayOfWeek.FRIDAY,"Wroclaw", DayOfWeek.FRIDAY));
       flightsList.add(new Flight("Gdansk", DayOfWeek.SUNDAY,"Wroclaw", DayOfWeek.SUNDAY));
       flightsList.add(new Flight("Gdansk", DayOfWeek.WEDNESDAY,"Wroclaw", DayOfWeek.THURSDAY));

       flightsList.add(new Flight("Gdansk", DayOfWeek.MONDAY,"Warszawa", DayOfWeek.MONDAY));
       flightsList.add(new Flight("Warszawa", DayOfWeek.MONDAY,"Wroclaw", DayOfWeek.MONDAY));

       flightsList.add(new Flight("Gdansk", DayOfWeek.SATURDAY,"Szczecin", DayOfWeek.SATURDAY));
       flightsList.add(new Flight("Szczecin", DayOfWeek.SATURDAY,"Poznan", DayOfWeek.SATURDAY));
       flightsList.add(new Flight("Poznan", DayOfWeek.SATURDAY,"Wroclaw", DayOfWeek.SATURDAY));

       return flightsList;
   }
}
package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightSearch {

    public Map<String, Boolean> findFlight(Flight flight) throws RouteNotFoundException {

        Map <String, Boolean> flightsMap = new HashMap();

        for (Map.Entry<String,Boolean> entry : flightsMap.entrySet()) {

            if (entry.getKey() == null) {

                if (entry.getValue() == false) {
                    throw new RouteNotFoundException();
                }
            }
        }
        return flightsMap;
    }
}


/**
 Stwórz klasę zawierającą logikę imitującą wyszukiwanie lotów:
 a) metoda findFilght (Flight flight)

 b) wewnątrz metody zaimplementuj mapę typu HashMap, której kluczem będzie String przechowujący
 nazwę lotniska, a wartością Boolean informujący o tym czy można na dane lotnisko polecieć.
 Przykład: Map<String, Boolean>.

 c) logika powinna wyszukiwać loty w mapie. Jeżeli dane lotnisko nie będzie istnieć w mapie, należy
 rzucić wyjątkiem RouteNotFoundException.

 Program należy uruchomić wewnątrz metody main, a następnie obsłużyć możliwe pojawienie się
 wyjątku.


 **/
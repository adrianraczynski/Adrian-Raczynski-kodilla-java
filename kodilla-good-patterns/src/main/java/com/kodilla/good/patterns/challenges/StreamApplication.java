package com.kodilla.good.patterns.challenges;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApplication {

    public static void main(String[] args){

        MovieStore movieStore = new MovieStore();

        String xyz = movieStore.getMovies().values().stream()
                   .flatMap(s -> s.stream())                            //lub flatMap(Collection::stream)
                   .collect(Collectors.joining("!"));

        System.out.println(xyz);
    }
}

/**
Inne rozwiązanie:

        MovieStore movieStore = new MovieStore();

        String newMovieList = movieStore.getMovies().entrySet().stream()
        .flatMap(n -> n.getValue().stream())
        .collect(Collectors.joining("!"));

        System.out.println(newMovieList);

 **/
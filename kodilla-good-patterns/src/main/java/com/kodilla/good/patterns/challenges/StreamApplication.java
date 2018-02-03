package com.kodilla.good.patterns.challenges;

import java.util.List;

public class StreamApplication {

    public static void main(String[] args){

        MovieStore movieStore = new MovieStore();

        List<String> xyz = movieStore.getMovies().values().stream()
                .flatMap ()
                .filter()
                .forEach (System.out::println);
    }
}



//wykonaj iterację po poniższej mapie tytułów i wyświetl wszystkie tytuły w jednym ciągu separując je wykrzyknikiem:
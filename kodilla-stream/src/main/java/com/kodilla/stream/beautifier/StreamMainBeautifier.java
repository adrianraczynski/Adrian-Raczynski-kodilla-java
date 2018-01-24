package com.kodilla.stream.beautifier;

import com.kodilla.stream.beautifier.PoemBeautifier;

public class StreamMainBeautifier {
    public static void main(String[] args) {
        PoemBeautifier poemBeautifier = new PoemBeautifier();

        String qwerty0 = poemBeautifier.beautify(" Tekst do ozdobienia ", s -> "\n" + s + "ABC");
        System.out.println(qwerty0);

        String qwerty1 = poemBeautifier.beautify(" Ala ma kota ", s -> "++!!!++" + s + "++!!!++");
        System.out.println(qwerty1);

        String qwerty2 = poemBeautifier.beautify(" Kot ma Ale ", a -> "!!!!!!!!!!!" + a);
        System.out.println(qwerty0 + qwerty2.toUpperCase());

        String qwerty3 = poemBeautifier.beautify(" RAZ, DWA, TRZY - próba mikrofonu. ", c -> c + "UWAGA " + "UWAGA " + "UWAGA " + "!!!");
        System.out.println(qwerty3.toLowerCase() + " Próba wykonana prawidłowo.");
    }
}

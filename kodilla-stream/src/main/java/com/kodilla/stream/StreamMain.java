package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.beautifier.PoemDecorator;
import com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.lambda.Processor;
import com.kodilla.stream.reference.FunctionalCalculator;

public class StreamMain {
    public static void main(String[] args) {
        Processor processor = new Processor();
        processor.execute(() -> System.out.println("This is an example text."));

        ExpressionExecutor expressionExecutor = new ExpressionExecutor();

        System.out.println("Calculating expressions with lambdas");
        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);

        System.out.println("\n" +"Calculating expressions with method references");
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subBFromA);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);


        PoemBeautifier poemBeautifier = new PoemBeautifier ();

        String qwerty0 = poemBeautifier.beautify (" Tekst do ozdobienia ",s ->"\n" + s + "ABC");
        System.out.println (qwerty0);

        String qwerty1 = poemBeautifier.beautify (" Ala ma kota ",s ->"++!!!++" + s + "++!!!++");
        System.out.println (qwerty1);

        String qwerty2 = poemBeautifier.beautify (" Kot ma Ale ", a -> "!!!!!!!!!!!" + a);
        System.out.println (qwerty0 + qwerty2.toUpperCase());

        String qwerty3 = poemBeautifier.beautify (" RAZ, DWA, TRZY - próba mikrofonu. ", c-> c + "UWAGA " + "UWAGA " + "UWAGA " + "!!!");
        System.out.println (qwerty3.toLowerCase() + " Próba wykonana prawidłowo.");
    }
}

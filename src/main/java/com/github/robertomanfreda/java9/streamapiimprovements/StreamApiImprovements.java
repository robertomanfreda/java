package com.github.robertomanfreda.java9.streamapiimprovements;

import com.github.robertomanfreda.ITopic;

import java.util.stream.Stream;

public class StreamApiImprovements implements ITopic {

    public StreamApiImprovements() {
        postConstruct();
    }

    @Override
    public void postConstruct() {
        String intro = "Migliorie degli Stream con aggiunta dei metodi .takeWhile() e .dropWhile()";
        System.out.println(intro);
    }

    @Override
    public void exec() {

        System.out.println("\nStampa finchè non c'è un valore vuoto [\"a\",\"b\",\"\",\"d\"](takeWhile)");
        Stream.of("a", "b", "", "d").takeWhile(
                s -> !s.isEmpty()).forEach(System.out::println);

        System.out.println("\nNON stampare finchè non c'è un valore pari a 0 [1,2,3,0,4] (dropWhile)");
        Stream.of(1, 2, 3, 0, 4).dropWhile(
                s -> s != 0).forEach(System.out::println);
    }
}

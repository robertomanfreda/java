package com.github.robertomanfreda.java8.topics.optionals;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Predicate;

import com.github.robertomanfreda.java8.topics.ITopic;

import java.util.Optional;

public class Optionals implements ITopic {

    public Optionals() {
        postConstruct();
    }

    @Override
    public void postConstruct() {
        System.out.println("\n---------- Optionals ----------");

        String intro = "Gli optional rappresentano un valore opzionale e sono quindi un'alternativa ad un " +
                "eventuale passaggio di un valore null.\n" +
                "Molto utile, ad esempio, per gestire la response di un servizio REST.";

//        String intro = "Optional è una classe che può contenere o meno il reference di un oggetto di un"
//                + " altro tipo (ed è quindi un tipo parametrico). Al posto di avere un metodo che ritorna "
//                + "un reference potenzialmente nullo, possiamo restituire un Optional che a sua volta "
//                + "contiene o meno il reference all’oggetto voluto."
//                + "\nhttps://codingjam.it/java8-gli-optional/#:~:text=Dalla%20versione%208%20per%C3%B2%20%C3%A8,%C3%A8%20quindi%20un%20tipo%20parametrico).";

        System.out.println(intro);
    }

    @Override
    public void exec() {
        // Initialize an empty optional
        Optional<String> emptyOptional = Optional.empty();
        System.out.println(emptyOptional.orElse("L'optional emptyOptional non contiene un valore"));

        // non empty otional
        Optional<String> optionalOf = Optional.of("Valore di optionalOf");
        optionalOf.ifPresent(System.out::println);

        // null optional
        Optional<String> optionalOfNullable1 = Optional.ofNullable(null);
        System.out.println(optionalOfNullable1.orElse("L'optional optionalOfNullable1 non contiene un valore"));

        // non null optional
        Optional<String> optionalOfNullable2 = Optional.ofNullable("Valore di optionalOfNullable2");
        System.out.println(optionalOfNullable2.orElse("L'optional optionalOfNullable2 non contiene un valore"));

        System.out.println();

        Optional<String> nonEmptyOpt = Optional.of("I'm an optional");
        Optional<String> emptyOpt = Optional.empty();

        System.out.println("Non-Empty Optional:: " + nonEmptyOpt.map(String::toUpperCase));
        System.out.println("Empty Optional    :: " + emptyOpt.map(String::toUpperCase));

        System.out.println("The optional is present? " + nonEmptyOpt.isPresent() + " " + nonEmptyOpt.get());
        System.out.println("The optional is empty? " + emptyOpt.isEmpty());

        System.out.println("If this optional is empty, return number 0 -> " + emptyOpt.orElseGet(
                () -> String.valueOf(0)));
        System.out.println("If this optional is empty, return number 0 -> " + nonEmptyOpt.orElseGet(
                () -> String.valueOf(0)));

    }
}

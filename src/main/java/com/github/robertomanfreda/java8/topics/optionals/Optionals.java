package com.github.robertomanfreda.java8.topics.optionals;

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
    }
}

package com.github.robertomanfreda.java11.varimprovements;

import com.github.robertomanfreda.ITopic;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class VarImprovements implements ITopic {

    public VarImprovements() {
        postConstruct();
    }

    @Override
    public void postConstruct() {
        System.out.println("Anche se la keyword \"var\" è stata introdotta in Java 10, solo a partire dalla 11 è" +
                "possibile\n utilizzarla nei parametri delle lambda");
    }

    @Override
    public void exec() {
        var numbers = Arrays.asList(0, 1, 2, 3, null, 5, 6, 7, 8, 9);

        // Da Java 8
        try {
            List<Integer> validationInLambdaJava8 = numbers.stream()
                    .map((@NotNull Integer n) -> n * 2)
                    .collect(Collectors.toList());
            System.out.println(validationInLambdaJava8);
        } catch (IllegalArgumentException iae) {
            System.out.println("\nGot null argument in @NonNull lambda");
            //iae.printStackTrace();
        }

        // Da Java 11
        // Qui l'annotazione @Nullable è abbastanza inutile,
        // è utile solo nel caso di librerire come FindBugs
        //  https://stackoverflow.com/a/14076320/10847273
        List<Integer> validationInLambdaJava11 = numbers.stream()
                .map((@Nullable var n) -> null != n ? n * 2 : 8)
                .collect(Collectors.toList());
        System.out.println("\n" + validationInLambdaJava11);

        // --------------------------------
        // La miglioria che vedo nell'utilizzo di "var" è la possibilita si usare le annotazioni
        // senza dichiare il tipo
        var numbers2 = Arrays.asList(0, 1, 2, 3, null, 4, 5, 6, 7, 8, 9);

         //Da Java 8
        try {
            List validationInLambdaJava8 = numbers2.stream()
                    .map((@NotNull Integer n) -> n.toString()) // Devo per forza specificare il tipo per usare un annotazone
                    // quindi non posso usare con le lambda come "(@NotNull n) -> ..."
                    .collect(Collectors.toList());
            System.out.println(validationInLambdaJava8);
        } catch (IllegalArgumentException iae) {
            System.out.println("\nGot null argument in @NonNull lambda");
            //iae.printStackTrace();
        }

        //Da java 11
        try {
            List<String> validationInLambdaJava8 = numbers2.stream()
                    .map((@NotNull var n) -> n.toString())
                    .collect(Collectors.toList());
            System.out.println(validationInLambdaJava8);
        } catch (IllegalArgumentException iae) {
            System.out.println("\nGot null argument in @NonNull lambda");
            //iae.printStackTrace();
        }
    }
}

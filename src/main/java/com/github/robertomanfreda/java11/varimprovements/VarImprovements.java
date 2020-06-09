package com.github.robertomanfreda.java11.varimprovements;

import com.github.robertomanfreda.ITopic;

import javax.validation.constraints.NotNull;
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
        List<Integer> validationInLambdaJava8 = numbers.stream().map((@NotNull Integer n) -> n * 2).collect(Collectors.toList());
        System.out.println(validationInLambdaJava8);

        System.out.println();

        // Da Java 11
        List<Integer> validationInLambdaJava11 = numbers.stream().map((@NotNull var n) -> n*2).collect(Collectors.toList());;
        System.out.println(validationInLambdaJava8);

        //TODO: LA VALIDAZIONE NON STA FUNZIONANDO?
    }
}

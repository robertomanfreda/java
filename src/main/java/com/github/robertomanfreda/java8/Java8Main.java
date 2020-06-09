package com.github.robertomanfreda.java8;

import com.github.robertomanfreda.java8.principles.DRY;
import com.github.robertomanfreda.java8.principles.KISS;
import com.github.robertomanfreda.java8.principles.YAGNI;
import com.github.robertomanfreda.java8.topics.completablefutures.CompletableFutures;
import com.github.robertomanfreda.java8.topics.foreach.ForEach;
import com.github.robertomanfreda.java8.topics.functionalinterfaces.FunctionalInterfaces;
import com.github.robertomanfreda.java8.topics.functions.Functions;
import com.github.robertomanfreda.java8.topics.methodreferences.MethodReference;
import com.github.robertomanfreda.java8.topics.optionals.Optionals;
import com.github.robertomanfreda.java8.topics.streams.Streams;

public class Java8Main {

    public static void main(String[] args) {
        System.out.println("+------------+");
        System.out.println("| PRINCIPLES |");
        System.out.println("+------------+");
        KISS.print();
        System.out.println("\n");

        DRY.print();
        System.out.println("\n");

        YAGNI.print();
        System.out.println("\n");

        System.out.println("Visita questo repo per altri principles davvero interessanti:\n" +
                "https://github.com/dwmkerr/hacker-laws#principles");

        System.out.println("\n\n+------------------------+");
        System.out.println("| Java 8 - main features |");
        System.out.println("+------------------------+");
        System.out.println("Di seguito una serie di esempi delle novità portate dalla versione 8 di Java.");

        new FunctionalInterfaces().exec();

        new MethodReference().exec();

        new Functions().exec();

        new ForEach().exec();

        new Streams().exec();

        new Optionals().exec();

        new CompletableFutures().exec();
    }

}

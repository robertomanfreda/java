package com.github.robertomanfreda.java8.topics.functionalinterfaces;

import com.github.robertomanfreda.java8.topics.ITopic;

public class FunctionalInterfaces implements ITopic {

    public FunctionalInterfaces() {
        postConstruct();
    }

    @Override
    public void postConstruct() {
        System.out.println("\n---------- Functional Interfaces ----------");
        String intro = "E' raccomandabile che tutte le interfacce funzionali riportino l'annotation " +
                "'@FunctionalInterface' a livello di classe. Non è obbligatorio ma una buona abitutdine, rende il " +
                "codice più esplicativo e permette al compilatore di lanciare una eccezione nel caso in cui " +
                "l'interfaccia abbia una sintassi scorretta.\n" +
                "Tutte le interfacce con un SAM (single abstract method) sono considerate interfacce funzionali e da " +
                "questo ne deriva il fatto che la loro implementazione può essere definita utilizzando una lambda " +
                "expressions. Dunque functional interfaces e lambda expressions sono strettamente legate tra loro.\n" +
                "All'interno di un'interfaccia funzionale possono essere presenti infiniti metodi di default, di cui " +
                "parleremo più avanti (dai anche un'occhiata alla classe java.util.function).\n";
        System.out.println(intro);
    }

    @Override
    public void exec() {
        // Anonymous class
        MyFunctionalInterfaceSimple myFunctionalInterfaceSimple = new MyFunctionalInterfaceSimple() {
            @Override
            public void aVoid() {
                System.out.println("\nI'm a functional interface - Anonymous");
            }
        };
        myFunctionalInterfaceSimple.aVoid();

        // Lambda One Line
        myFunctionalInterfaceSimple = () -> System.out.println("\nI'm a functional interface - Lambda One Line");
        myFunctionalInterfaceSimple.aVoid();

        // Lambda Multi line
        myFunctionalInterfaceSimple = () -> {
            System.out.println("\nI'm a functional interface - Lambda Multi Line");
            System.out.println("I'm always the same functional interface");
        };
        myFunctionalInterfaceSimple.aVoid();

        // Inline call method
        ((MyFunctionalInterfaceSimple) () -> {
            System.out.println("\nI'm a functional interface - executed inline");
            System.out.println("I'm always the same functional interface - executed inline");
        }).aVoid();

        // With param
        MyFunctionalInterfaceOneParam myFunctionalInterfaceOneParam = parameter -> System.out.println(parameter);
        myFunctionalInterfaceOneParam.aVoid("\nI'm a parameter");

        // With params
        MyFunctionalInterfaceMoreParams myFunctionalInterfaceMoreParams = (parameter0, parameter1, parameter2) -> {
            System.out.println(parameter0 + parameter1 + parameter2);
        };
        myFunctionalInterfaceMoreParams.aVoid("0", "1", "2");
    }
}

package com.github.robertomanfreda.java8.topics.optionals;

import com.github.robertomanfreda.java8.topics.ITopic;

public class Optionals implements ITopic {

    public Optionals() {
        postConstruct();
    }

    @Override
    public void postConstruct() {
        System.out.println("\n---------- Optionals ----------");
        String intro = "TODO";
        System.out.println(intro);
    }
}

package com.github.robertomanfreda.java8.topics;

public interface ITopic {

    default void exec() {
        System.out.println("This topic is not implemented...");
    }

    void postConstruct();
}

package com.github.robertomanfreda;

@FunctionalInterface
public interface ITopic {

    void postConstruct();

    default void exec() {
        System.out.println("This topic is not implemented...");
    }
}

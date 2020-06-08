package com.github.robertomanfreda.java8.examples.interfaces;

public interface IInterface {

    void method();

    static void staticMethodNeedsImplementation() {
        System.out.println("impl");
    }

    default void defaultMethodsNeedsImplementationButCanOverride() {
        System.out.println("impl");
    }
}

package com.github.robertomanfreda.java8.examples.interfaces;

public class Interface implements IInterface {
    @Override
    public void method() {
        System.out.println("impl");
    }

    @Override
    public void defaultMethodsNeedsImplementationButCanOverride() {
        System.out.println("Override");
    }
}

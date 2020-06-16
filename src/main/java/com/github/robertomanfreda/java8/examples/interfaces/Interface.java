package com.github.robertomanfreda.java8.examples.interfaces;

public class Interface implements IInterface {
    @Override
    public void method() {
        System.out.println("impl");
    }

    @Override
    public void defaultMethodsNotNeedsImplementationButCanOverride() {
        System.out.println("Override");
    }
}

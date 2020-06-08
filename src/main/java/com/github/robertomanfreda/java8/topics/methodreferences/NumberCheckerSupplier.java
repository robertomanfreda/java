package com.github.robertomanfreda.java8.topics.methodreferences;

@FunctionalInterface
public interface NumberCheckerSupplier {
    NumberChecker apply(int n);
}

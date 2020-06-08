package com.github.robertomanfreda.java8.topics.functions;

@FunctionalInterface
public interface ITriFunction<T, U, R, V> {
    V apply(T t, U u, R r);
}

package com.github.robertomanfreda.java8.topics.functions;

@FunctionalInterface
public interface IQuadriFunction<T, U, R, C, V> {
	V apply(T t, U u, R r, C c);
}

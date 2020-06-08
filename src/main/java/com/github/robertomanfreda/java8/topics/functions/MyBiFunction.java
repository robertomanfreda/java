package com.github.robertomanfreda.java8.topics.functions;

import java.util.function.BiFunction;

public class MyBiFunction implements BiFunction<Integer, Integer, String> {
    @Override
    public String apply(Integer integer, Integer integer2) {
        return "#" + integer + "-" + integer2 + "#";
    }
}

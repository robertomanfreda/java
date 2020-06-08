package com.github.robertomanfreda.java8.topics.functions;

import java.util.function.Function;

public class MyFunction implements Function<Integer, String> {
    @Override
    public String apply(Integer integer) {
        return String.valueOf(integer);
    }
}

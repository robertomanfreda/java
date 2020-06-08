package com.github.robertomanfreda.java8.topics.functions;

public class MyTriFunction implements ITriFunction<Integer, Integer, Double, String> {
    @Override
    public String apply(Integer integer, Integer integer2, Double aDouble) {
        return "#" + integer + "-" + integer2 + "-" + aDouble + "#";
    }
}

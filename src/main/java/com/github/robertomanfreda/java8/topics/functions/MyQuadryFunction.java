package com.github.robertomanfreda.java8.topics.functions;

public class MyQuadryFunction implements IQuadriFunction<String, String, String, String, String> {

    @Override
    public String apply(String t, String u, String r, String c) {
        String a = "*" + t + c + u + r + "*";
        return a;
    }
}
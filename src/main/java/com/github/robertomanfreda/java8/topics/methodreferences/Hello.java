package com.github.robertomanfreda.java8.topics.methodreferences;

public class Hello {

    private String hello;

    public Hello(String hello) {
        this.hello = hello;
    }

    public String addHello(String param) {
        return param + " guys!";
    }

    @Override
    public String toString() {
        return "Hello{" +
                "hello='" + hello + '\'' +
                '}';
    }
}

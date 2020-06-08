package com.github.robertomanfreda.java8.topics.methodreferences;

public class NumberChecker {
    private final int number;

    public NumberChecker(int number) {
        this.number = number;
    }

    public boolean isBigger(int num) {
        return number > num;
    }

    @Override
    public String toString() {
        return "NumberChecker{" +
                "number=" + number +
                '}';
    }
}

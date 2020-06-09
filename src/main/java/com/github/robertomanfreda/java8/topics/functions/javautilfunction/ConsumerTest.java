package com.github.robertomanfreda.java8.topics.functions.javautilfunction;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerTest implements IJavaUtilFunction {

    @Override
    public void test() {
        List<Integer> numbers = Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9);
        Consumer<Integer> consumer = (number -> {
            if (number % 2 == 0) System.out.println("Il numero " + number + " è pari");
            else System.out.println("Il numero " + number + " è dispari");
        });
        numbers.forEach(consumer);
    }
}

package com.github.robertomanfreda.java8.topics.functions.javautilfunction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateTest implements IJavaUtilFunction {

    @Override
    public void test() {
        List<Integer> numbers = Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9);
        List<Integer> numbersFound = findNumbers(numbers, n -> n < 5);
        numbersFound.forEach(System.out::println);
    }

    private List<Integer> findNumbers(List<Integer> integers, Predicate<Integer> predicate) {
        List<Integer> numbersFound = new ArrayList<>();
        integers.forEach( number -> {
            if(predicate.test(number)) numbersFound.add(number);
        });
        return numbersFound;
    }
}

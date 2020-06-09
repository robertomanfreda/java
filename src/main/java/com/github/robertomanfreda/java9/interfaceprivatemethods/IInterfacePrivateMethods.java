package com.github.robertomanfreda.java9.interfaceprivatemethods;

import java.util.List;
import java.util.function.Predicate;

public interface IInterfacePrivateMethods {

    private long count(List<Integer> numbers, Predicate<Integer> filteringPredicate) {
        return numbers.stream()
                .filter(filteringPredicate)
                .count();
    }

    default long countEvenNumbers(List<Integer> numbers) {
        return count(numbers, num -> num % 2 == 0);
    }

    default long countOddNumbers(List<Integer> numbers) {
        return count(numbers, num -> num % 2 != 0);
    }

}
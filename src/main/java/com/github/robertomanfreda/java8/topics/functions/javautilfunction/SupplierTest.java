package com.github.robertomanfreda.java8.topics.functions.javautilfunction;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierTest implements IJavaUtilFunction {

    @Override
    public void test() {
        List<Integer> numbers = Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9);
        for (Integer number : numbers) {
            printNumber(() -> number);
        }

        // OPPURE
        numbers.forEach(number -> printNumber(() -> number));
    }

    private void printNumber(Supplier<Integer> supplier) {
        System.out.println(supplier.get());
    }
}

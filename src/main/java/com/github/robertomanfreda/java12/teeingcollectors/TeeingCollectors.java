package com.github.robertomanfreda.java12.teeingcollectors;

import com.github.robertomanfreda.ITopic;

import java.util.List;
import java.util.stream.Collectors;

public class TeeingCollectors implements ITopic {


    @Override
    public void postConstruct() {
        // TODO intro
        String intro = "";
        System.out.println(intro);
    }

    @Override
    public void exec() {
        List<Integer> integers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        Integer result = integers.stream().collect(Collectors.teeing(
                Collectors.minBy(Integer::compareTo),
                Collectors.maxBy(Integer::compareTo),
                (integer, integer2) -> integer.isPresent() && integer2.isPresent()
                        ? integer.get() + integer2.get()
                        : -1
                )
        );

        System.out.println("Teeing Collectors: " + result);
    }


}


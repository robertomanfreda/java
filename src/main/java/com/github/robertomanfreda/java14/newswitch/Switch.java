package com.github.robertomanfreda.java14.newswitch;

import com.github.robertomanfreda.ITopic;

import java.util.Arrays;

public class Switch implements ITopic {

    public Switch() {
        postConstruct();
    }

    @Override
    public void postConstruct() {

    }

    @Override
    public void exec() {
        var numbers = Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9);
        numbers.forEach(num -> {
            var pariDispari = switch (num) {
                case 1, 3, 5, 7, 9 -> "dispari";
                case 0, 2, 4, 6, 8 -> "pari";
                default -> throw new IllegalStateException("Unexpected value: " + num);
            };
            System.out.println(num + " è un numero " + pariDispari);
        });


        // yield can be used as a keyword to return a value

        // With arrow labels when a full block is needed
        int num = 3;
        int returnVal = switch (num) {
            case 1 -> 1;
            case 2 -> 2;
            case 3 -> {
                System.out.println(3);
                yield 3;
            }
            default -> 0;
        };

        // Traditional
        returnVal = switch (num) {
            case 1:
                System.out.println(1);
                yield 1;
            case 2:
                System.out.println(2);
                yield 2;
            case 3:
                System.out.println(2);
                yield 3;
            default:
                System.out.println(0);
                yield 0;
        };
    }
}

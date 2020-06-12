package com.github.robertomanfreda.java13.switchexpression;

import com.github.robertomanfreda.ITopic;

public class SwitchExpression implements ITopic {

    public SwitchExpression() {
        postConstruct();
    }

    @Override
    public void postConstruct() {
        String intro = "\nIn java 13 nello switch è stata sostituita la keyword break con yield";
        System.out.println(intro);
    }

    @Override
    public void exec() {
        System.out.println("\nValori tornati dallo switch con keyword yield");
        String a = getNumberViaYield(2);
        System.out.println(a);
        String b = getNumberViaYield(7);
        System.out.println(b);
    }

    private static String getNumberViaYield(int number) {
        return switch (number) {
            case 1:
                yield "one";
            case 2:
                yield "two";
            case 3:
                yield "three";
            default:
                yield "unknown";
        };
    }
}

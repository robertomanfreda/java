package com.github.robertomanfreda.java12;

import com.github.robertomanfreda.java12.mismatch.Mismatch;
import com.github.robertomanfreda.java12.numberformats.NumbersFormat;
import com.github.robertomanfreda.java12.switchexpression.SwitchExpression;

public class Main {

    public static void main(String[] args) {
        System.out.println("\n\n+-------------------------+");
        System.out.println("| Java 12 - main features |");
        System.out.println("+-------------------------+");
        System.out.println("Di seguito una serie di esempi delle novità portate dalla versione 12 di Java.");

        new SwitchExpression().exec();

        new Mismatch().exec();

        new NumbersFormat().exec();
    }
}

package com.github.robertomanfreda.java9.interfaceprivatemethods;

import com.github.robertomanfreda.ITopic;

import java.util.Arrays;
import java.util.List;

public class InterfacePrivateMethods implements IInterfacePrivateMethods, ITopic {

    public InterfacePrivateMethods() {
        postConstruct();
    }

    @Override
    public void postConstruct() {
        System.out.println("A partire da Java 9 è possibile definire metodi privati nelle interfacce.\n" +
                "La logica di business può essere qui estratta.\n" +
                "Permette di evitare la duplicazione del codice nei metodi di default.");
    }

    @Override
    public void exec() {
        System.out.println("Esempio metodi privati nelle interfacce");
        List<Integer> numbers = Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9);
        System.out.println("Count numeri pari: " + countEvenNumbers(numbers));
        System.out.println("Count numeri dispari: " + countOddNumbers(numbers));
    }
}

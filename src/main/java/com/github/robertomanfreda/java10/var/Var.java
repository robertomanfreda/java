package com.github.robertomanfreda.java10.var;

import com.github.robertomanfreda.ITopic;

import java.util.Arrays;

public class Var implements ITopic {

    public Var() {
        postConstruct();
    }

    @Override
    public void postConstruct() {
        System.out.println("- - - VAR - - -\n" +
                "Non può essere usato nella firma dei metodi e come class field.\n" +
                "Torna utile ovunque vi sia una ridondanza nella verbosità dei tipi.");
    }

    @Override
    public void exec() {

        //List<Integer> numbers = Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9);
        var numbers = Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9);

        //for(Integer num : numbers) {}
        for (var num : numbers) {
            System.out.print(num + " ");
        }

        System.out.println();

        //Non una best practice perché poco chiaro
        var str = getString();
        System.out.print(str);
    }

    public String getString() {
        return "0 1 2 3 4 5 6 7 8 9";
    }

}

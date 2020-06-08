package com.github.robertomanfreda.java8.topics.foreach;

import com.github.robertomanfreda.java8.topics.ITopic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

public class ForEach implements ITopic {

    public ForEach() {
        postConstruct();
    }

    @Override
    public void postConstruct() {
        System.out.println("\n---------- forEach ----------");
        String intro = "Il forEach è un internal operator, ciò significa che non è possibile controllare il \"flusso" +
                " di loop\". Gli internal operators vengono anche definiti passive operators. Il programmatore non" +
                " può fare altro che dichiarare il codice che dovrà essere eseguito ad ogni iterazione.\n" +
                "Il forEach è particolarmente adatto per loop su stream e molto comodo per accedere velocemente a " +
                "mappe key-value.\n" +
                "Link interessante sulla questione: " +
                "https://stackoverflow.com/questions/224648/external-iterator-vs-internal-iterator";
        System.out.println(intro);
    }

    @Override
    public void exec() {
        List<String> myList = new ArrayList<>();
        myList.add("0");
        myList.add("1");
        myList.add("2");

        // with anonymous class
        System.out.println("\n");
        myList.forEach(new Consumer<String>() {
            public void accept(String s) {
                System.out.println("forEach anonymous class: " + s);
            }
        });

        // lambda exp
        System.out.println("\n");
        myList.forEach((String s) -> {
            System.out.println("forEach lambda exp: " + s);
        });

        // consumer interface implementation, reusing the same impl... avoid repetitive code
        class MyConsumer implements Consumer<String> {
            public void accept(String s) {
                System.out.println("Consumer implementation: " + s);
            }
        }
        System.out.println("\n");
        MyConsumer action = new MyConsumer();
        myList.forEach(action);

        Map<String, String> aMap = new HashMap<>();
        aMap.put("0", "00");
        aMap.put("1", "11");
        aMap.put("2", "22");
        aMap.put("3", "33");
        aMap.put("4", "44");

        System.out.println("\n");
        aMap.forEach((k, v) -> System.out.println("key: " + k + " - value: " + v));
    }
}

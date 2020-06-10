package com.github.robertomanfreda.java9.collectionfactorymethods;

import com.github.robertomanfreda.ITopic;

import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;

public class CollectionFactoryMethods implements ITopic {

    public CollectionFactoryMethods(){
        postConstruct();
    }

    @Override
    public void postConstruct() {
        String intro = "Non di rado sono state mosse critiche al linguaggio Java accusandolo di eccessiva" +
                " verbosità. In effetti in alcune situazioni, come ad esempio quelle che richiedono la " +
                "costruzione di collezioni non modificabili, il codice richiede l’implementazione di blocchi " +
                "con diverse istruzioni che possono degenerare in qualcosa di complesso. Da Java9 è possibile" +
                " evitare del codice ripetuto:";
        System.out.println(intro);
    }

    @Override
    public void exec() {
        System.out.println("\n");
        List<String> list = List.of("Java","C", "Python", "Ruby");
        System.out.println("Lista dichiarata evitando il metodo .add();\n" +
                "List<String> list = List.of(\"Java\",\"C\", \"Python\", \"Ruby\");");
        list.forEach(System.out::println);
//        list.stream().forEach((element) -> System.out.println(element));

        System.out.println("\nSet dichiarato evitando il metodo .add();\n" +
                " Set<Integer> set = Set.of(1,2,3,4);");
        Set<Integer> set = Set.of(1,2,3,4);
        set.forEach(System.out::println);

        System.out.println("\nMap dichiarata evitando il metodo .put();\n" +
                "  Map<Integer, String> map = Map.of(1, \"one\", 2, \"two\", 3, \"three\");");

        Map<Integer, String> map = Map.of(1, "one", 2, "two", 3, "three");
        map.forEach((integer, s) -> System.out.println("Key: " + integer + " | Value: " + s));
    }
}

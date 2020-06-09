package com.github.robertomanfreda.java8.topics.streams;

import com.github.robertomanfreda.java8.topics.ITopic;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Streams implements ITopic {

    public Streams() {
        postConstruct();
    }

    @Override
    public void postConstruct() {
        System.out.println("\n---------- Streams ----------");
        String intro = "Uno stream è un’interfaccia che restituisce un flusso di dati finito o infinito su cui è " +
                "possibile fare operazioni di filtro, mappa e riduzione.  Può operare in modo sequenziale " +
                "(default) oppure a richiesta in modo parallelo.\n" +
                "Articolo introduttivo molto interessante: " +
                "https://codingjam.it/java-8-uno-sguardo-agli-stream/";
        System.out.println(intro);
    }

    @Override
    public void exec() {
        List<Integer> myList = new ArrayList<>();
        myList.add(0);
        myList.add(1);
        myList.add(2);
        myList.add(2);
        myList.add(10);
        myList.add(11);
        myList.add(12);

        // Filtering
        // Anonymous class
        List<Integer> collected = myList.stream()
                .filter(new Predicate<Integer>() {
                    @Override
                    public boolean test(Integer integer) {
                        return integer < 10;
                    }
                })
                .collect(Collectors.toList());
        System.out.println("\nCollected list simple filter < 10 - Anonymous: \n" + collected.toString());

        // Lambda exp
        collected = myList.stream()
                .filter(integer -> integer < 10)
                 .collect(Collectors.toList());
        System.out.println("\nCollected list simple filter < 10 - Lambda: \n" + collected.toString());

        // Reusing predicate, collecting into set for duplicated removal
        Predicate<Integer> predicate = integer -> integer < 10;
        Set<Integer> set = myList.stream()
                .filter(predicate)
                .collect(Collectors.toSet());
        System.out.println("\nCollected set simple filter < 10 - Lambda external predicate: \n" + set.toString());

        // filtering names with length < 5 and and printing relative surnames
        System.out.println("\n");
        List<Person> people = new ArrayList<>();
        people.add(new Person("foo", "bar"));
        people.add(new Person("bat", "baz"));
        people.add(new Person("batbat", "bazbaz"));

        people.stream()
                .filter(person -> person.getName().length() < 5)
                .map(Person::getSurname)
                .forEach(System.out::println);

        // Map (a sort of type migration)
        // Starting from a List<Integer> get a List<String> using map and method reference
        List<String> collectedS = myList.stream()
                .map(String::valueOf)
                .collect(Collectors.toList());
        System.out.println("\nCollected simple map - Lambda and method reference: \n" + collectedS.toString());

        @SuppressWarnings("DuplicatedCode")
        Map<String, String> aMap = new HashMap<>();
        aMap.put("0", "00");
        aMap.put("1", "11");
        aMap.put("2", "22");
        aMap.put("3", "33");
        aMap.put("4", "44");
        aMap.put("5", "55");
        aMap.put("6", "66");

        // get keys
        Set<String> keys = aMap.keySet();
        System.out.println("\nGot keys from map: " + keys.toString());

        // get values
        Collection<String> values = aMap.values();
        System.out.println("\nGot values from map: " + values.toString());

        // Iterating map
        System.out.println("\n");
        aMap.forEach((key, value) -> System.out.println("Key: " + key + " - Value: " + value));
    }

    private static class Person {
        private final String name;
        private final String surname;

        public Person(String name, String surname) {
            this.name = name;
            this.surname = surname;
        }

        public String getName() {
            return name;
        }

        public String getSurname() {
            return surname;
        }
    }
}

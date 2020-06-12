package com.github.robertomanfreda.java12.teeingcollector;

import com.github.robertomanfreda.ITopic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TeeingCollector implements ITopic {

    public TeeingCollector() {
        postConstruct();
    }

    @Override
    public void postConstruct() {
        System.out.println("""
                
                Collectors#teeing ritorna un collector a partire da 2 collector e una funzione di merge.
                """);
    }

    @Override
    public void exec() {
        example1();
        example2();
        example3();
        example4();
    }

    private void example1() {

        record Guest(String name, boolean participating, Integer participantsNumber) {}
        record EventParticipation(List<String> guestNameList, Integer totalNumberOfParticipants) {}

        var guests = new ArrayList<Guest>();
        guests.add(new Guest("Marco", true, 3));
        guests.add(new Guest("David", false, 2));
        guests.add(new Guest("Roger", true, 6));
        guests.add(new Guest("Lorenzo", true, 15));

        var result = guests.stream().collect(Collectors.teeing(
                Collectors.filtering(Guest::participating,
                        Collectors.mapping(guest -> guest.name, Collectors.toList())),
                Collectors.summingInt(Guest::participantsNumber),
                EventParticipation::new

        ));

        System.out.println(result);

    }

    private void example2() {
        var result =
                Stream.of("Devoxx", "Voxxed Days", "Code One", "Basel One", "prova", "aaaa", "xoxxo",
                        "Angular Connect")
                        .collect(Collectors.teeing(
                                // first collector
                                Collectors.filtering(n -> n.contains("xx"), Collectors.toList()),
                                // second collector
                                Collectors.filtering(n -> n.endsWith("One"), Collectors.toList()),
                                // merger - automatic type inference doesn't work here
                                (List<String> list1, List<String> list2) -> List.of(list1, list2)
                        ));
        System.out.println(result);
    }

    private void example3() {

        record Result(Long count, Integer sum) {}

        var numbers = Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9);
        var result =
                numbers.stream()
                        .collect(Collectors.teeing(
                                Collectors.counting(),
                                Collectors.summingInt(n -> Integer.parseInt(n.toString())),
                                Result::new
                        ));
        System.out.println(result);
    }

    private void example4() {

        record Employee(long id, String name, double salary) {}
        record EmployeemaxAndMin(Employee min, Employee max) {}

        List<Employee> employees = Arrays.asList(
                new Employee(1, "A", 100),
                new Employee(2, "B", 200),
                new Employee(3, "C", 300),
                new Employee(4, "D", 400));
        EmployeemaxAndMin employeemaxAndMin = employees.stream()
                .collect(Collectors.teeing(
                        Collectors.minBy(Comparator.comparing(Employee::salary)),
                        Collectors.maxBy(Comparator.comparing(Employee::salary)),
                        (e1, e2) -> new EmployeemaxAndMin(e1.get(), e2.get())
                ));
        System.out.println("MIN: " + employeemaxAndMin.min.name +", MAX: " + employeemaxAndMin.max.name);
    }
}

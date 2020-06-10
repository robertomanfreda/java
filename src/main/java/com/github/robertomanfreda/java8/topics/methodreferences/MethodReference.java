package com.github.robertomanfreda.java8.topics.methodreferences;

import com.github.robertomanfreda.ITopic;
import com.github.robertomanfreda.java8.topics.functionalinterfaces.MyFunctionalInterfaceOneParam;

import java.util.function.IntPredicate;

public class MethodReference implements ITopic {

    public MethodReference() {
        postConstruct();
    }

    @Override
    public void postConstruct() {
        System.out.println("\n---------- Method Reference ----------");
        String intro = "Le method reference non sono nient'altro che una forma ancora più compatta di " +
                "lambda expression.\n" +
                "Tipi:\n" +
                "- Reference to a static method\n" +
                "- Reference to an instance method\n" +
                "- Reference to a constructor";
        System.out.println(intro);
    }

    @Override
    public void exec() {
        // static method reference
        MyFunctionalInterfaceOneParam myFunctionalInterfaceOneParam = System.out::println;
        myFunctionalInterfaceOneParam.aVoid("\nI'm called using static method reference");

        ICalculateNumbers myNumber = CalculateNumbers::sum;
        Integer result = myNumber.sum(2, 3);
        System.out.println("\nAddition result with static method reference = " + result.toString());


        // instance method reference
        int initNumber = 10;
        int numberToCheck = 9;
        NumberChecker numberChecker = new NumberChecker(initNumber);
        IntPredicate predicate = numberChecker::isBigger;
        boolean test = predicate.test(9);
        System.out.println("\n" + initNumber + " > " + numberToCheck + "? " + test);


        // constructor method reference
        NumberCheckerSupplier supplier = NumberChecker::new;
        NumberChecker checker = supplier.apply(10);
        System.out.println("\nCreated through constructor method reference: \n" + checker.toString());

        ISayHello hi = Hello::new;
        Hello hello = hi.sayHello("hello constructor method reference!!");
        System.out.println(hello.toString().toUpperCase());

    }
}

package com.github.robertomanfreda.java14;

import com.github.robertomanfreda.java14.enhancedinstanceof.EnhancedInstanceOf;
import com.github.robertomanfreda.java14.record.RecordJava14;

public class Main {

    public static void main(String[] args) {
        System.out.println("\n\n+-------------------------+");
        System.out.println("| Java 14 - main features |");
        System.out.println("+-------------------------+");
        System.out.println("Di seguito una serie di esempi delle novità portate dalla versione 14 di Java.");

        RecordJava14 recordTest = new RecordJava14();
        recordTest.exec();

        EnhancedInstanceOf enhancedInstanceOf = new EnhancedInstanceOf();
        enhancedInstanceOf.exec();
    }
}

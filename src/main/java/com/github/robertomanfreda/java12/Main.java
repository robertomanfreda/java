package com.github.robertomanfreda.java12;

import com.github.robertomanfreda.java12.teeingcollector.TeeingCollector;

public class Main {

    public static void main(String[] args) {
        System.out.println("\n\n+-------------------------+");
        System.out.println("| Java 12 - main features |");
        System.out.println("+-------------------------+");
        System.out.println("Di seguito una serie di esempi delle novità portate dalla versione 11 di Java.");

        TeeingCollector teeingCollector = new TeeingCollector();
        teeingCollector.exec();
    }
}

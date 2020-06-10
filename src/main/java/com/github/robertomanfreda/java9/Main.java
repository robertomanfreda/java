package com.github.robertomanfreda.java9;

import com.github.robertomanfreda.java9.collectionfactorymethods.CollectionFactoryMethods;
import com.github.robertomanfreda.java9.completablefutureimprovements.CompletableFutureImprovements;
import com.github.robertomanfreda.java9.interfaceprivatemethods.InterfacePrivateMethods;
import com.github.robertomanfreda.java9.streamapiimprovements.StreamApiImprovements;

public class Main {

    public static void main(String[] args) {
        System.out.println("\n\n+-------------------------+");
        System.out.println("| Java 9 - main features |");
        System.out.println("+-------------------------+");
        System.out.println("Di seguito una serie di esempi delle novità portate dalla versione 9 di Java.\n\n");

        InterfacePrivateMethods interfacePrivateMethods = new InterfacePrivateMethods();
        interfacePrivateMethods.exec();

        CompletableFutureImprovements completableFutureImprovements = new CompletableFutureImprovements();
        completableFutureImprovements.exec();

        new CollectionFactoryMethods().exec();

        new StreamApiImprovements().exec();

        new StreamApiImprovements().exec();
    }
}

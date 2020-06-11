package com.github.robertomanfreda.java11;

import com.github.robertomanfreda.java11.httpclient.StandardHttpClient;
import com.github.robertomanfreda.java11.varimprovements.VarImprovements;

public class Main {

    public static void main(String[] args) {
        System.out.println("\n\n+-------------------------+");
        System.out.println("| Java 11 - main features |");
        System.out.println("+-------------------------+");
        System.out.println("Di seguito una serie di esempi delle novità portate dalla versione 11 di Java.");

        VarImprovements varImprovements = new VarImprovements();
        varImprovements.exec();

        StandardHttpClient standardHttpClient = new StandardHttpClient();
        standardHttpClient.exec();
    }
}

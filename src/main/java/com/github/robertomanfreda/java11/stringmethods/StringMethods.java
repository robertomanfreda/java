package com.github.robertomanfreda.java11.stringmethods;

import com.github.robertomanfreda.ITopic;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Map;
import java.util.stream.Collectors;

public class StringMethods implements ITopic {

    public StringMethods(){
        postConstruct();
    }

    @Override
    public void postConstruct() {
        String intro = "Sono stati aggiunti nuovi metodi alla classe String";
        System.out.println(intro);
    }

    @Override
    public void exec() {
        String blank = "            ";
        System.out.println("This string is blank -> " + blank.isBlank() + " -> " + blank);
        String string = "Hello";
        System.out.println("This string is blank -> " + string.isBlank() + " -> " + string);

        blank = "Hi\nHi\nHi";
        System.out.println(blank);

//        List<String> a = blank.lines().collect(Collectors.toList());
        System.out.println(blank.lines().collect(Collectors.toList()));

        System.out.println("\n** var in lambda expression ");
        Map map = Map.of(1,"one", 2, "two", 3, "three");
        map.forEach((var key, var value) -> System.out.println("Key: " + key + "| Value: " + value));


        System.out.println("\n** Semplificazione metodi per scrittura e lettura delle stringhe dai Files");

        try {
            String testo = "file creato con java";
            Path path = Files.writeString(Files.createTempFile("testJava11", ".txt"), testo);
            System.out.println("\nCreato file di testo temporaneo in -> " + path);
            String s = Files.readString(path);
            System.out.println("\n***CONTENUTO***\n" + s + "\n***************");
            Files.delete(path);
            System.out.println("File cancellato");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

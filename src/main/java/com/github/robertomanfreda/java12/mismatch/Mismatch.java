package com.github.robertomanfreda.java12.mismatch;

import com.github.robertomanfreda.ITopic;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Mismatch implements ITopic {

    public Mismatch() {
        postConstruct();
    }

    @Override
    public void postConstruct() {
        String intro = "\nJava 12 introduce un nuovo metodo per confrontare due file. Due file possono presentare una" +
                " differenza nei seguenti scenari:\nSe i byte non sono identici. In questo caso, viene restituita la" +
                " posizione del primo byte non corrispondente.\nLe dimensioni dei file non sono identiche. " +
                "In questo caso, viene restituita la dimensione del file più piccolo. Per la tabella dei risultati vedere:" +
                "\nhttps://dzone.com/articles/jdk-12s-filesmismatch-method#:~:text=mismatch%20method%20for%20comparing%20files,time%2C%20of%20adding%20a%20Files.";
        System.out.println(intro);
    }

    @Override
    public void exec() {
        System.out.println();
        try {
            String testo = "\nTest Mismatch";
            Path file1 = Files.writeString(Files.createTempFile("File1", ".txt"), testo);
            Path file2 = Files.writeString(Files.createTempFile("File2", ".txt"), testo);
            long mismatch = Files.mismatch(file1, file2);
            System.out.println(checkMismatch(mismatch) + ", mismatch = " + mismatch);
            Files.isSameFile(file1, file2);
            file1.toFile().deleteOnExit();
            file2.toFile().deleteOnExit();

            System.out.println();

            Path file3 = Files.writeString(Files.createTempFile("File3", ".txt"), "boh");
            Path file4 = Files.writeString(Files.createTempFile("File4", ".txt"), testo);
            long mismatch2 = Files.mismatch(file3, file4);
            System.out.println(checkMismatch(mismatch2) + ", mismatch = " + mismatch2);
            file3.toFile().deleteOnExit();
            file4.toFile().deleteOnExit();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private String checkMismatch(Long mismatch) {
        if (mismatch == -1)
            return "File uguali";
        else
            return "File diversi";
    }
}

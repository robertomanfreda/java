package com.github.robertomanfreda.java8.principles;

public class YAGNI {

    public static void print() {
        String principle = "---------- The YAGNI principle ----------\n" +
                "Questo è un acronimo per \"You Ain't Gonna Need It.\"\n" +
                "Implementa sempre le cose quando ne hai realmente bisogno, mai quando pensi che ne avrai bisogno.\n" +
                "(Ron Jeffries) (co-fondatore di XP e autore del libro \"Extreme Programming Installed\")\n\n" +
                "Questo principio di programmazione estrema (XP) suggerisce che gli sviluppatori dovrebbero " +
                "implementare solo le funzionalità necessarie per i requisiti immediati ed evitare i tentativi di " +
                "prevedere il futuro implementando funzionalità che potrebbero essere necessarie in seguito.\n" +
                "L'adesione a questo principio dovrebbe ridurre la quantità di codice inutilizzato nella base di " +
                "codice ed evitare di perdere tempo e fatica in funzionalità che non apportano alcun valore.";
        System.out.println(principle);

    }
}

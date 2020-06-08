package com.github.robertomanfreda.java8.principles;

public class DRY {

    public static void print() {
        String principle = "---------- The DRY principle ----------\n" +
                "Ogni pezzo di conoscenza deve avere un'unica, inequivocabile, autorevole rappresentazione " +
                "all'interno di un sistema.\n" +
                "DRY è l'acronimo di Don't Repeat Yourself. Questo principio ha lo scopo di aiutare gli sviluppatori " +
                "a ridurre la ripetizione del codice e mantenere le informazioni in un unico posto ed è stato citato " +
                "nel 1999 da Andrew Hunt e Dave Thomas nel libro The Pragmatic Developer\n" +
                "L'opposto di DRY sarebbe WET (Scrivi tutto due volte ci divertiamo a digitare).\n" +
                "In pratica, se hai le stesse informazioni in due (o più) luoghi diversi, puoi usare DRY per " +
                "unirle in una singola e riutilizzarle dove vuoi / hai bisogno.\n" +
                "https://en.wikipedia.org/wiki/Don%27t_repeat_yourself";
        System.out.println(principle);
    }
}

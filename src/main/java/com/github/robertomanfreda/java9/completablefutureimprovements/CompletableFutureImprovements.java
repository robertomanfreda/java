package com.github.robertomanfreda.java9.completablefutureimprovements;

import com.github.robertomanfreda.ITopic;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

public class CompletableFutureImprovements implements ITopic {

    public CompletableFutureImprovements() {
        postConstruct();
    }

    @Override
    public void postConstruct() {
        System.out.println("\nSono stati introdotti nuovi metodi per la CompletableFuture.\n" +
                "I più significativi riguardano i timeout, nello specifico CompletableFuture#orTimeout e" +
                " CompletableFuture#completeOnTimeout");
    }

    @Override
    public void exec() {

        CompletableFuture<String> future1 = CompletableFuture.supplyAsync(() -> {
            try {
                TimeUnit.SECONDS.sleep(10);
            } catch (InterruptedException e) {
                throw new IllegalStateException(e);
            }
            return "Risultato dell'operazione asincrona 1";
        });

        CompletableFuture<String> future2 = CompletableFuture.supplyAsync(() -> {
            try {
                TimeUnit.SECONDS.sleep(10);
            } catch (InterruptedException e) {
                throw new IllegalStateException(e);
            }
            return "Risultato dell'operazione asincrona 2";
        });
        // Completa il "CompletableFuture" con eccezione se non viene completato entro i secondi passi in innput
        CompletableFuture<String> orTimeoutFuture = future1.orTimeout(4, TimeUnit.SECONDS);
        // Completa il "CompletableFuture" con un valore passato in input
        // se non viene completato entro i secondi passi in innput
        CompletableFuture<String> completeOnTimeoutFuture = future2.completeOnTimeout(
                "CompletableFuture#completeOnTimeout: valore in caso di timeout", 7, TimeUnit.SECONDS);

        try {
            System.out.println("La seguente eccezione è volontaria, per testare il nuovo metodo " +
                    "CompletableFuture#orTimeout\nCompletableFuture#orTimeout: ");
            System.out.println(orTimeoutFuture.get());
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }

        try {
            System.out.println(completeOnTimeoutFuture.get());
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }

    }
}

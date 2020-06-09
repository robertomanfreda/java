package com.github.robertomanfreda.java8.topics.completablefutures;

import com.github.robertomanfreda.java8.topics.ITopic;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

public class CompletableFutures implements ITopic {

    public CompletableFutures() {
        postConstruct();
    }

    @Override
    public void postConstruct() {
        System.out.println("\n---------- Completable Futures ----------");
        String intro = "Le completable futures tornano utili nella programmazione asincrona." +
                "Un possibile utilizzo potrebbe essere per le chiamate a servizi: staccando un thread non " +
                "rimaniamo in attesa della response";
        System.out.println(intro);
    }

    @Override
    public void exec() {

        CompletableFuture<String> future1 = CompletableFuture.supplyAsync(() -> {
            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                throw new IllegalStateException(e);
            }
            return "Risultato dell'operazione asincrona";
        });

        CompletableFuture<String> future2 = CompletableFuture.supplyAsync(() -> {
            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                throw new IllegalStateException(e);
            }
            return "Risultato dell'operazione asincrona";
        });

        CompletableFuture.completedFuture("CompletableFuture già completata").thenAccept((f) -> {
            f += " + thenAccept";
            System.out.println(f);
        });

        try {
            System.out.println(future1.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}

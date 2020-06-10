package com.github.robertomanfreda.java8.topics.completablefutures;

import com.github.robertomanfreda.ITopic;

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

        CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> {
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
            System.out.println(future.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }


        CompletableFuture<String> cf = new CompletableFuture<String>();
        try {
            System.out.println("Sleep for 1 second");
            TimeUnit.SECONDS.sleep(1);
            cf.complete("");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("1) Completed? " + cf.isDone());

        CompletableFuture<String> cf2 = new CompletableFuture<String>();
        System.out.println("2) Completed? " + cf2.isDone());

        CompletableFuture<String> name = CompletableFuture.supplyAsync(() -> {
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
             return "and .supplyAsync";
        });

        CompletableFuture<String> saluta = name.thenApply( a -> {
            return "Hi .thenApply " + a;
        });
        try {
            System.out.println(saluta.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}

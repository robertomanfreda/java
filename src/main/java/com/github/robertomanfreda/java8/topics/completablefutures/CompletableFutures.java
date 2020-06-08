package com.github.robertomanfreda.java8.topics.completablefutures;

import com.github.robertomanfreda.java8.topics.ITopic;

public class CompletableFutures implements ITopic {

    public CompletableFutures() {
        postConstruct();
    }

    @Override
    public void postConstruct() {
        System.out.println("\n---------- Completable Futures ----------");
        String intro = "TODO";
        System.out.println(intro);
    }
}

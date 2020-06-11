package com.github.robertomanfreda.java11.httpclient;

import com.github.robertomanfreda.ITopic;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class StandardHttpClient implements ITopic {

    public StandardHttpClient() {
        postConstruct();
    }

    @Override
    public void postConstruct() {

    }

    @Override
    public void exec() {

    }
}

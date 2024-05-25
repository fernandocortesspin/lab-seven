package com.fjcd.notifier;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executors;

public class NotificationService {


    public CompletableFuture process(){
        CompletableFuture<String> completableFuture = new CompletableFuture<>();

        Executors.newCachedThreadPool().submit(() -> {
            Thread.sleep(500);
            completableFuture.complete("Hello");
            return null;
        });

        return completableFuture;
    }

}

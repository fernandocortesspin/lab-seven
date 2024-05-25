package com.fjcd.domain;

import com.fjcd.constant.Action;
import com.fjcd.observer.StatusAction;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executors;

public abstract class User {

    private Action action;

    private List<StatusAction> observers = new ArrayList<>();

    public abstract boolean doAction();

    public Action getAction() {
        return action;
    }

    public void setAction(Action action) {
        this.action = action;
    }

    public void registerObserver(StatusAction statusAction){
        observers.add(statusAction);
    }

    public List<StatusAction> getObservers() {
        return observers;
    }

    public CompletableFuture notifyObservers(){
        CompletableFuture<String> completableFuture = new CompletableFuture<>();

        for (StatusAction observer : observers) {
            Executors.newCachedThreadPool().submit(() -> {
                observer.setExecuted(true);
                return null;
            });
        }

        return completableFuture;
    }
}

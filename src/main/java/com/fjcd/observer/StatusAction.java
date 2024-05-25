package com.fjcd.observer;

import java.util.UUID;

public class StatusAction {

    private UUID identifier;
    private boolean executed;


    public StatusAction(){
        this.identifier = UUID.randomUUID();
    }

    public boolean isExecuted() {
        return executed;
    }

    public void setExecuted(boolean executed) {
        this.executed = executed;
    }

    public UUID getIdentifier() {
        return identifier;
    }

    public void setIdentifier(UUID identifier) {
        this.identifier = identifier;
    }

}

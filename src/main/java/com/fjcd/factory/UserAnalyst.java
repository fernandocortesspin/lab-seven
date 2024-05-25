package com.fjcd.factory;

import com.fjcd.constant.Action;
import com.fjcd.domain.User;

public class UserAnalyst extends User {

    @Override
    public boolean doAction() {

        System.out.println("Executing " + Action.ANALYZE);


        this.notifyObservers();

        return true;
    }

}

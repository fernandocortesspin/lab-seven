package com.fjcd.factory;

import com.fjcd.constant.Action;
import com.fjcd.domain.User;

public class UserAuthorizer extends User {

    @Override
    public boolean doAction() {

        System.out.println("Executing " + Action.AUTHORIZE);

        this.notifyObservers();

        return true;
    }

}

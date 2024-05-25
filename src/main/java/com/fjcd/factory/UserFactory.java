package com.fjcd.factory;

import com.fjcd.constant.Action;
import com.fjcd.domain.User;

public class UserFactory {


    public static User getInstance(Action action) {

        if (Action.ANALYZE.equals(action)) {

            return new UserAnalyst();

        } else if (Action.AUTHORIZE.equals(action)) {

            return new UserAuthorizer();
        }

        throw new RuntimeException("Action Not Supported");
    }

}

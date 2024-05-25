package com.fjcd.config;

import com.fjcd.constant.Action;
import com.fjcd.domain.User;
import com.fjcd.factory.UserFactory;
import com.fjcd.observer.StatusAction;

import java.util.Objects;

public class GlobalConfiguration {

    private static GlobalConfiguration globalConfiguration;

    private GlobalConfiguration(){

    }

    public static synchronized GlobalConfiguration getInstance(){

        if(Objects.isNull(globalConfiguration)){
            globalConfiguration = new GlobalConfiguration();
        }

        return globalConfiguration;
    }

    public void setup(Action action){

        //Create/setup user
        User user = UserFactory.getInstance(action);

        // Register observer
        StatusAction observer = new StatusAction();
        user.registerObserver(observer);

        user.doAction();
    }
}

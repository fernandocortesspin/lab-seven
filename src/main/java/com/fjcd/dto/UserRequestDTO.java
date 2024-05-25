package com.fjcd.dto;

import com.fjcd.constant.Action;

import java.io.Serializable;

public class UserRequestDTO implements Serializable {

    private Action action;

    public Action getAction() {
        return action;
    }

    public void setAction(Action action) {
        this.action = action;
    }

}

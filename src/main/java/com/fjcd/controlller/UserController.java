package com.fjcd.controlller;

import com.fjcd.config.GlobalConfiguration;
import com.fjcd.dto.UserRequestDTO;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.core.MediaType;

@ApplicationPath("/v1/users")
public class UserController {

    private GlobalConfiguration globalConfiguration;


    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public void method(UserRequestDTO user){
        // Use nested Singleton logic
        globalConfiguration = GlobalConfiguration.getInstance();
        // Use nested Factory and observer pattern
        globalConfiguration.setup(user.getAction());
    }
}

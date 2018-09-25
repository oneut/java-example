package com.oneut.javaexample.controllers;

import com.oneut.javaexample.applicationservice.UserApplicationService;
import com.oneut.javaexample.models.User;
import com.typesafe.config.Config;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/")
public class HomeController {

    @Inject
    public UserApplicationService userApplicationService;

    @Inject
    public Config config;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public User hello() {
        String a = this.config.getString("APP_ENV");
        User user = this.userApplicationService.find(1);
        return user;
    }
}

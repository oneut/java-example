package com.oneut.javaexample;

import com.oneut.javaexample.applicationservice.UserApplicationService;
import com.typesafe.config.Config;

import org.glassfish.jersey.internal.inject.AbstractBinder;
import com.oneut.javaexample.serviceprovider.ConfigFactoryProvider;

import javax.inject.Singleton;

public class ApplicationBinder extends AbstractBinder {
    @Override
    protected void configure() {
        // Factory Provider
        bindFactory(ConfigFactoryProvider.class).to(Config.class).in(Singleton.class);

        // ApplicationService
        bindAsContract(UserApplicationService.class);

        // UseCase

        // Model
        bindAsContract(com.oneut.javaexample.models.User.class);
    }
}
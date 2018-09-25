package com.oneut.javaexample;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.server.ServerProperties;

@ApplicationPath("/")
public class Application extends ResourceConfig {

    private static final String CONTROLLERS_PACKAGE_PREFIX = ".controllers";

    public Application() {
        // Add a package used to scan for components.
        packages(this.getClass().getPackage().getName() + CONTROLLERS_PACKAGE_PREFIX);
        property(ServerProperties.PROVIDER_SCANNING_RECURSIVE, false);

        // Binder
        register(new ApplicationBinder());
    }

}
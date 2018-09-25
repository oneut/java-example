package com.oneut.javaexample.serviceprovider;

import com.typesafe.config.Config;
import com.typesafe.config.ConfigFactory;

import java.util.Date;
import java.util.function.Supplier;

public class ConfigFactoryProvider implements Supplier<Config> {
    private final Config config;
    private final Date date;

    public ConfigFactoryProvider() {
        date = new Date();
        config = ConfigFactory.load();
    }

    public Config get() {
        return this.config;
    }
}

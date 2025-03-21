package com.product.config;

import org.aeonbits.owner.ConfigCache;

import java.awt.*;

public final class ConfigFactory {

    private ConfigFactory()
    {

    }

    public static FrameworkConfig getConfig()
    {
        return ConfigCache.getOrCreate(FrameworkConfig.class);
    }

}

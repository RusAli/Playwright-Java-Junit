package com.config;

import org.aeonbits.owner.ConfigCache;

public class ConfigManager {
  public static Configuration config() {
    return ConfigCache.getOrCreate(Configuration.class);
  }
}

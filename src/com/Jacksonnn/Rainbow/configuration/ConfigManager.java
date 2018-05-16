package com.Jacksonnn.Rainbow.configuration;

import java.io.File;

import org.bukkit.configuration.file.FileConfiguration;

public class ConfigManager {
	public static Config defaultConfig;
	
	public ConfigManager() {
		defaultConfig = new Config(new File("config.yml"));
		configCheck(ConfigType.DEFAULT);
	}
	
	public static void configCheck(ConfigType type) {
		FileConfiguration config;
		if (type == ConfigType.DEFAULT) {
			config = defaultConfig.get();
			
			config.addDefault("Storage.engine", "sqlite");

			config.addDefault("Storage.MySQL.host", "localhost");
			config.addDefault("Storage.MySQL.port", 3306);
			config.addDefault("Storage.MySQL.pass", "");
			config.addDefault("Storage.MySQL.db", "minecraft");
			config.addDefault("Storage.MySQL.user", "root");
			defaultConfig.save();
		}
	}
}
package com.Jacksonnn.Rainbow;

import java.util.logging.Logger;

import org.bukkit.plugin.java.JavaPlugin;

import com.Jacksonnn.Rainbow.configuration.ConfigManager;

public class Rainbow extends JavaPlugin {
	public static Rainbow plugin;
	public static Logger log;
	
	@Override
	public void onEnable() {
		plugin = this;
		Rainbow.log = this.getLogger();
		new ConfigManager();
	}
	
	public void onDisable() {
		
	}
	
	public static void stopPlugin() {
		plugin.getServer().getPluginManager().disablePlugin(plugin);
	}
	
}

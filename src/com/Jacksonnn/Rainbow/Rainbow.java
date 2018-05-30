package com.Jacksonnn.Rainbow;

import java.util.logging.Logger;

import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import com.Jacksonnn.Rainbow.configuration.ConfigManager;

public class Rainbow extends JavaPlugin {
	public static Rainbow plugin;
	public static Logger log;
	private PluginManager pm = Bukkit.getServer().getPluginManager();
	
	@Override
	public void onEnable() {
		plugin = this;
		Rainbow.log = this.getLogger();
		new ConfigManager();

		registerListeners();

		Bukkit.getServer().getLogger().info("Rainbow has been enabled!");
	}
	
	public void onDisable() {
		Bukkit.getServer().getLogger().info("Rainbow has been disabled!");

	}
	
	public static void stopPlugin() {
		plugin.getServer().getPluginManager().disablePlugin(plugin);
	}

	private void registerListeners() {
		pm.registerEvents(new BlockPlaceListener(), this);
	}
}

package com.Jacksonnn.Rainbow;

import com.Jacksonnn.Rainbow.configuration.ConfigManager;
import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Logger;

public class Rainbow extends JavaPlugin {
	public static Rainbow plugin;
	public static Logger log;
	private PluginManager pm = Bukkit.getServer().getPluginManager();
	
	@Override
	public void onEnable() {
		plugin = this;
		Rainbow.log = this.getLogger();
		new ConfigManager();

		pm.registerEvents(new BlockPlaceListener(), this);

		Bukkit.getServer().getLogger().info("Rainbow has been enabled!");
	}
	
	public void onDisable() {
		Bukkit.getServer().getLogger().info("Rainbow has been disabled!");

	}
	
	public static void stopPlugin() {
		plugin.getServer().getPluginManager().disablePlugin(plugin);
	}
}

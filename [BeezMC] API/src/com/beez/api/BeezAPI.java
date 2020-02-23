package com.beez.api;

import org.bukkit.plugin.java.JavaPlugin;
import com.beez.api.listeners.ListenersManager;
import com.beez.api.tools.config.FileManager;

public class BeezAPI extends JavaPlugin {
	
	public static BeezAPI instance;
	
	@Override
	public void onEnable() {
		instance = this;
		
		new ListenersManager(this).registerListeners();
		FileManager fileManager = new FileManager();
		fileManager.getConfig("Teams.yml").copyDefaults(true).save();
	}
	
	@Override
	public void onDisable() {
		
	}

	public static BeezAPI get() {
		return instance;
	}
}

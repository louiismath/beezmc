package com.beez.api;

import java.util.Map;

import org.bukkit.plugin.java.JavaPlugin;

import com.beez.api.listeners.ListenersManager;
import com.beez.api.tools.config.FileManager;
import com.beez.api.tools.gui.GUIBuilder;
import com.beez.api.tools.gui.GUIManager;

public class BeezAPI extends JavaPlugin {
	
	public static BeezAPI instance;
	public GUIManager guiManager;
	public Map<Class<? extends GUIBuilder>, GUIBuilder> registeredMenus;
	
	@Override
	public void onEnable() {
		instance = this;
		
		new ListenersManager(this).registerListeners();
		FileManager fileManager = new FileManager();
		fileManager.getConfig("Teams.yml").copyDefaults(true).save();
		
		new GUIManager().loadMenus();
	}
	
	@Override
	public void onDisable() {
		
	}

	public static BeezAPI get() {
		return instance;
	}
	
	public static void log(String msg) {
		get().getLogger().info(msg);
	}
	
	public static void warn(String msg) {
		get().getLogger().warning(msg);
	}
	
	public void setGUIManager(GUIManager guiManager) {
		this.guiManager = guiManager;
	}
	
	public GUIManager getGUIManager() {
		return guiManager;
	}
	
	public void setRegisteredMenus(Map<Class<? extends GUIBuilder>, GUIBuilder> registeredMenus) {
		this.registeredMenus = registeredMenus;
	}
	
	public Map<Class<? extends GUIBuilder>, GUIBuilder> getRegisteredMenus() {
		return registeredMenus;
	}
}

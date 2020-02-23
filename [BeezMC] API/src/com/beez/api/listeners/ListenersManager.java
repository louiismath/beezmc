package com.beez.api.listeners;

import org.bukkit.Bukkit;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.PluginManager;

import com.beez.api.listeners.chat.PlayerChatListener;
import com.beez.api.listeners.connect.PlayerJoinListener;
import com.beez.api.listeners.connect.PlayerPreJoinListener;
import com.beez.api.listeners.connect.PlayerQuitListener;
import com.beez.api.listeners.move.PlayerMoveListener;

public class ListenersManager {
	
	Plugin plugin;
	PluginManager pluginManager;
	
	public ListenersManager(Plugin plugin) {
		this.plugin = plugin;
		this.pluginManager = Bukkit.getPluginManager();
	}
	
	public void registerListeners() {
		pluginManager.registerEvents(new PlayerPreJoinListener(), plugin);
		pluginManager.registerEvents(new PlayerJoinListener(), plugin);
		pluginManager.registerEvents(new PlayerQuitListener(), plugin);
		pluginManager.registerEvents(new PlayerChatListener(), plugin);
		pluginManager.registerEvents(new PlayerMoveListener(), plugin);
	}

}

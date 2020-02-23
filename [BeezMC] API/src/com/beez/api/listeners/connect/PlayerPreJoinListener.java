package com.beez.api.listeners.connect;

import java.util.UUID;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerPreLoginEvent;

public class PlayerPreJoinListener implements Listener {
	
	public void onPreJoin(AsyncPlayerPreLoginEvent event) {
		UUID uuid = event.getUniqueId();
		Player player = Bukkit.getPlayer(uuid);
	}

}

package com.beez.api.listeners.connect;

import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

public class PlayerQuitListener implements Listener {
	
	public void onPlayerQuit(PlayerQuitEvent event) {
		Player player = event.getPlayer();
		
	}

}

package com.beez.api.tools.gui;

import java.util.HashMap;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryView;
import org.bukkit.inventory.ItemStack;
import org.bukkit.scheduler.BukkitRunnable;

import com.beez.api.BeezAPI;

public class GUIManager implements Listener {
	
	@EventHandler
	public void onClick(InventoryClickEvent event) {
		
		Player player = (Player) event.getWhoClicked();
		Inventory inv = event.getInventory();
		InventoryView view = event.getView();
		ItemStack clickedItem = event.getCurrentItem();
		
		if(clickedItem == null || clickedItem.getType() == Material.AIR) return;
		
		BeezAPI.get().getRegisteredMenus().values().stream()
        .filter(menu -> view.getTitle().equalsIgnoreCase(menu.name()))
        .forEach(menu -> {
            menu.onClick(player, inv, clickedItem, event.getSlot());
            event.setCancelled(true);
        });
		
	}
	
	public void addMenu(GUIBuilder menu) {
		BeezAPI.get().getRegisteredMenus().put(menu.getClass(), menu);
	}
	
	public void open(Player player, Class<? extends GUIBuilder> guiClass) {
		
		if(!BeezAPI.get().getRegisteredMenus().containsKey(guiClass)) return;
		
		GUIBuilder gui = BeezAPI.get().getRegisteredMenus().get(guiClass);
		Inventory inv = Bukkit.createInventory(null, gui.getSize(), gui.name());
		gui.contents(player, inv);
		
		new BukkitRunnable() {
			
			@Override
			public void run() {
				player.openInventory(inv);
				
			}
		}.runTaskLater(BeezAPI.get(), 1);
		
		
		
	}
	
	public void loadMenus() {
		BeezAPI.log("Chargement des menus actifs");
		BeezAPI.get().setGUIManager(new GUIManager());
		BeezAPI.get().setRegisteredMenus(new HashMap<>());
		
		// Ici, on ajoute tous les menus à enregistrer
	}

}

package com.beez.api.tools;

import org.bukkit.ChatColor;

public class ChatMessage {
	
	// Utilisation du %value% pour le remplacer
	
	/**
	 * PRÉFIXES
	 */
	
	public static String api_prefix = "§f[§eBeez§6§lMC§r§f] " + ChatColor.RESET;
	public static String mod_chat_prefix = "§f(§6Mod§f) " + ChatColor.RESET;
	public static String staff_chat_prefix = "§f(§3Staff§f) " + ChatColor.RESET;
	public static String hive_chat_prefix = "§f(§2Hive§f) " + ChatColor.RESET;
	
	/**
	 * COMMANDS
	 */
	
	public static String mtp_prefix = "§f(§6§lMTP§f) " + ChatColor.RESET;
	public static String mtp_teleport = mtp_prefix + "§e%player1% §f§l> §r§bplayer2" + ChatColor.RESET;
	
	/**
	 * PERMISSIONS
	 */
	
	public static String no_permission = "§cVous n'avez pas les droits nécessaires pour effectuer cela. Veuillez contacter les administrateurs si vous croyez que c'est une erreur." + ChatColor.RESET;

}

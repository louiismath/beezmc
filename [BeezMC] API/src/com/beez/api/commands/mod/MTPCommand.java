package com.beez.api.commands.mod;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class MTPCommand implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

		if(!(sender instanceof Player)) return true;
		
		// permissions check
		
		if(args.length <= 0) {
			//displayhelp
			return true;
		}
		
		return true;
	}
	
//	private void displayHelp() {
//		
//	}

}

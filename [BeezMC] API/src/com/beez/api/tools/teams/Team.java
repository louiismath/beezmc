package com.beez.api.tools.teams;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.entity.Player;

public class Team {
	
	private List<Player> team_players = new ArrayList<Player>();
	private String name, displayName, prefix, suffix;
	private boolean assignArmor, showPrefix, showSuffix, showGlow, friendlyFire;
	
	public List<Player> getTeamPlayers() {
		return team_players;
	}
	
	public void setTeamPlayers(List<Player> team_players) {
		this.team_players = team_players;
	}
	
	public void addTeamPlayer(Player player) {
		if(getTeamPlayers().contains(player)) return;
		team_players.add(player);
	}
	
	public void removeTeamPlayer(Player player) {
		if(!getTeamPlayers().contains(player)) return;
		team_players.remove(player);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDisplayName() {
		return displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	public String getPrefix() {
		return prefix;
	}

	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}

	public String getSuffix() {
		return suffix;
	}

	public void setSuffix(String suffix) {
		this.suffix = suffix;
	}

	public boolean isAssignArmor() {
		return assignArmor;
	}

	public void setAssignArmor(boolean assignArmor) {
		this.assignArmor = assignArmor;
	}

	public boolean isShowPrefix() {
		return showPrefix;
	}

	public void setShowPrefix(boolean showPrefix) {
		this.showPrefix = showPrefix;
	}

	public boolean getShowSuffix() {
		return showSuffix;
	}

	public void setShowSuffix(boolean showSuffix) {
		this.showSuffix = showSuffix;
	}

	public boolean getShowGlow() {
		return showGlow;
	}

	public void setShowGlow(boolean showGlow) {
		this.showGlow = showGlow;
	}

	public boolean getFriendlyFire() {
		return friendlyFire;
	}

	public void setFriendlyFire(boolean friendlyFire) {
		this.friendlyFire = friendlyFire;
	}
	
	
	

}

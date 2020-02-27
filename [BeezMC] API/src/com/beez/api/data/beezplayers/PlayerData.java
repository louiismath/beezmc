package com.beez.api.data.beezplayers;

public class PlayerData {
	
	public int VIPLevel;
	public int MODLevel;
	public String prefix;
	public String suffix;
	public boolean bypass;
	
	public int getVIPLevel() {
		return VIPLevel;
	}
	
	public void setVIPLevel(int VIPLevel) {
		this.VIPLevel = VIPLevel;
	}

	public int getMODLevel() {
		return MODLevel;
	}

	public void setMODLevel(int MODLevel) {
		this.MODLevel = MODLevel;
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

	public boolean canBypass() {
		return bypass;
	}

	public void setBypass(boolean bypass) {
		this.bypass = bypass;
	}
	
	

}

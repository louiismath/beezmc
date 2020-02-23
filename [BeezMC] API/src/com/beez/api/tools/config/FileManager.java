package com.beez.api.tools.config;

import java.util.HashMap;

public class FileManager {
	
	private HashMap<String, Config> configs = new HashMap<String, Config>();
	
	public Config getConfig(String name) {
        if (!configs.containsKey(name))
            configs.put(name, new Config(name));
     
        return configs.get(name);
    }
	
	public Config saveConfig(String name) {
        return getConfig(name).save();
    }
	
	public Config reloadConfig(String name) {
        return getConfig(name).reload();
    }

}

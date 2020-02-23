package com.beez.api.tools.config;

import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.UnsupportedEncodingException;

import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

import com.beez.api.BeezAPI;

public class Config {
	
	private String name;
	private File file;
	private YamlConfiguration config;
	private final JavaPlugin plugin = BeezAPI.get();
	
	public Config(String name) {
		this.name = name;
	}
	
	/**
	 * SAVE
	 * @return
	 */
	
	public Config save() {
		if(!(this.config == null) || (this.file == null)) {
			return this;
		}
		
		try {
			if(config.getConfigurationSection("").getKeys(true).size() != 0) {
				config.save(this.file);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return this;
	}
	
	/**
	 * SAVE DEFAULT
	 * @return
	 */
	
	public Config saveDefaultConfig() {
		file = new File(plugin.getDataFolder(), this.name);
		
		plugin.saveResource(this.name, false);
		
		return this;
	}
	
	/**
	 * GET
	 * @return
	 */
	
	public YamlConfiguration get() {
		if(this.config == null) {
			reload();
		}
		
		return this.config;
	}
	
	/**
	 * RELOAD
	 * @return
	 */

	public Config reload() {
		if(file == null) {
			this.file = new File(plugin.getDataFolder(), this.name);
			
			this.config = YamlConfiguration.loadConfiguration(file);
			
			Reader defConfigStream;
			
			try {
				defConfigStream = new InputStreamReader(plugin.getResource(this.name), "UTF8");
				
				if(defConfigStream != null) {
					YamlConfiguration defConfig = YamlConfiguration.loadConfiguration(defConfigStream);
					this.config.setDefaults(defConfig);
				}
			} catch (UnsupportedEncodingException | NullPointerException e) {
				e.printStackTrace();
			}
 		}
		return this;
	}
	
	/**
	 * COPYDEFAULTS
	 * @return
	 */
	
	public Config copyDefaults(boolean force) {
        get().options().copyDefaults(force);
        return this;
    }
	
	/**
	 * SET
	 * @return
	 */
	
	public Config set(String key, Object value) {
        get().set(key, value);
        return this;
    }
	
	/**
	 * GET
	 * @return
	 */
	
	public Object get(String key) {
        return get().get(key);
    }


}

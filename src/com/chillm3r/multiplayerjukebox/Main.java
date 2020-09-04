package com.chillm3r.multiplayerjukebox;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

	@Override
	public void onEnable() {
		getLogger().info("Loading MultiplayerJukebox v1.0");
	}
	
	@Override
	public void onDisable() {
		getLogger().info("Disabling MultiplayerJukebox v1.0");
	}
	
}

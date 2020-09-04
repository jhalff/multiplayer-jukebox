package com.chillm3r.multiplayerjukebox;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
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
	
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if(label.equalsIgnoreCase("jb")) {
			if(sender instanceof Player) {
				// Player runs command
				Player player = (Player) sender;
				if (player.hasPermission("jb.use")) {
					player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&f[&c&k|/|&fJukebox&c&k|/|&f] - Playing &lsong"));
					for(Player p : Bukkit.getOnlinePlayers()) {
			            p.playSound(p.getLocation(), Sound.MUSIC_DISC_CAT, 1, 0);
			            p.playSound(p.getLocation(), Sound.MUSIC_DISC_WARD, 1, 0);
			            p.playSound(p.getLocation(), Sound.MUSIC_DISC_WAIT, 1, 0);
			            p.playSound(p.getLocation(), Sound.MUSIC_DISC_STRAD, 1, 0);
			            p.playSound(p.getLocation(), Sound.MUSIC_DISC_BLOCKS, 1, 0);
			        }
					return true;
				}
				else {
					player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&k&lYou do not have permission!"));
					return true;
				}
			} 
			else {
				// Console runs command
			}
		}
		
		return false;
	}
	
}

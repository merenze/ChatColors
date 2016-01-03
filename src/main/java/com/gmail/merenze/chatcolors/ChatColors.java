package com.gmail.merenze.chatcolors;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerLoginEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class ChatColors extends JavaPlugin {
	@Override
	public void onEnable() {
		getLogger().info("ChatColors plugin has been enabled!");
		
		this.getCommand("color").setExecutor(new ColorCommand(this));
	}
	@Override
	public void onDisable() {
		getLogger().info("ChatColors plugin has terminated!");
	}
	
	public void setNameColor(Player player, ChatColor color) {
		String name = color + player.getName() + ChatColor.WHITE;
		player.setDisplayName(name);
		player.setPlayerListName(name);
	}
}

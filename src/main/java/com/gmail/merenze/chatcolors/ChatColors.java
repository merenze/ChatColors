package com.gmail.merenze.chatcolors;

import jellyrekt.CustomConfig;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class ChatColors extends JavaPlugin implements Listener {
	private CustomConfig tagColors;
	@Override
	public void onEnable() {
		tagColors = new CustomConfig(this, "tagColors.yml");
		this.getCommand("tag").setExecutor(new TagCommand(this));
		getServer().getPluginManager().registerEvents(this, this);
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
	public CustomConfig getTagColors() {
		return tagColors;
	}
	@EventHandler
	public void onJoin(PlayerJoinEvent event) {
		new TagHandler(this).updateTags();
	}
}

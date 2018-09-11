package com.gmail.merenze.chatcolors;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

public class TagHandler {
	private ChatColors plugin;
	
	public TagHandler(ChatColors plugin) {
		this.plugin = plugin;
	}
	
	public ChatColor getTagColor(Player player) {
		return ChatColor.getByChar(plugin.getTagColors().getYaml().getString(player.getUniqueId().toString()));
	}
	public void setTagColor(Player player, ChatColor color) {
		plugin.getTagColors().getYaml().set(player.getUniqueId().toString(), color.getChar());
		plugin.getTagColors().save();
		
		updateTags();
	}
	
	public void updateTags() {
		for (Player player:plugin.getServer().getOnlinePlayers()) {
			String uuid = player.getUniqueId().toString();
			if (plugin.getTagColors().getYaml().getConfigurationSection("").contains(uuid)) {
				player.setDisplayName(ChatColor.getByChar(plugin.getTagColors().getYaml().getString(uuid)) + player.getName() + ChatColor.WHITE);
				player.setPlayerListName(ChatColor.getByChar(plugin.getTagColors().getYaml().getString(uuid)) + player.getName() + ChatColor.WHITE);
			}
		}
	}
}

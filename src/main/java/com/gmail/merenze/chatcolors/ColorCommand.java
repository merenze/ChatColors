package com.gmail.merenze.chatcolors;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;


public class ColorCommand implements CommandExecutor {
	private final ChatColors plugin;
	
	public ColorCommand(ChatColors plugin) {
		this.plugin = plugin;
	}
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
			if (sender instanceof Player) { //If sender is a player
				Player player = (Player) sender;
				if (player.hasPermission("chatcolors.color")) { //If player has permission to use command
					if (args.length >= 1) { //If player includes arguments
						String color = args[0];				
						if (color.equalsIgnoreCase("aqua")) {
							plugin.setNameColor(player, ChatColor.AQUA);
						} else if (color.equalsIgnoreCase("black")) {
							plugin.setNameColor(player, ChatColor.BLACK);
							sender.sendMessage(ChatColor.GRAY + "Changing your name color to " + color.toLowerCase() + ".");
						} else if (color.equalsIgnoreCase("blue")) {
							plugin.setNameColor(player, ChatColor.BLUE);
							sender.sendMessage(ChatColor.GRAY + "Changing your name color to " + color.toLowerCase() + ".");
						} else if (color.equalsIgnoreCase("darkaqua")) {
							plugin.setNameColor(player, ChatColor.DARK_AQUA);
							sender.sendMessage(ChatColor.GRAY + "Changing your name color to " + color.toLowerCase() + ".");
						} else if (color.equalsIgnoreCase("darkblue")) {
							plugin.setNameColor(player, ChatColor.DARK_BLUE);
							sender.sendMessage(ChatColor.GRAY + "Changing your name color to " + color.toLowerCase() + ".");
						} else if (color.equalsIgnoreCase("darkgray")) {
							plugin.setNameColor(player, ChatColor.DARK_GRAY);
							sender.sendMessage(ChatColor.GRAY + "Changing your name color to " + color.toLowerCase() + ".");
						} else if (color.equalsIgnoreCase("darkgreen")) {
							plugin.setNameColor(player, ChatColor.DARK_GREEN);
							sender.sendMessage(ChatColor.GRAY + "Changing your name color to " + color.toLowerCase() + ".");
						} else if (color.equalsIgnoreCase("darkpurple")) {
							plugin.setNameColor(player, ChatColor.DARK_PURPLE);
							sender.sendMessage(ChatColor.GRAY + "Changing your name color to " + color.toLowerCase() + ".");
						} else if (color.equalsIgnoreCase("darkred")) {
							plugin.setNameColor(player, ChatColor.DARK_RED);
							sender.sendMessage(ChatColor.GRAY + "Changing your name color to " + color.toLowerCase() + ".");
						} else if (color.equalsIgnoreCase("gold")) {
							plugin.setNameColor(player, ChatColor.GOLD);
							sender.sendMessage(ChatColor.GRAY + "Changing your name color to " + color.toLowerCase() + ".");
						} else if (color.equalsIgnoreCase("gray")) {
							plugin.setNameColor(player, ChatColor.GRAY);
							sender.sendMessage(ChatColor.GRAY + "Changing your name color to " + color.toLowerCase() + ".");
						} else if (color.equalsIgnoreCase("green")) {
							plugin.setNameColor(player, ChatColor.GREEN);
							sender.sendMessage(ChatColor.GRAY + "Changing your name color to " + color.toLowerCase() + ".");
						} else if (color.equalsIgnoreCase("lightpurple")) {
							plugin.setNameColor(player, ChatColor.LIGHT_PURPLE);
							sender.sendMessage(ChatColor.GRAY + "Changing your name color to " + color.toLowerCase() + ".");
						} else if (color.equalsIgnoreCase("red")) {
							plugin.setNameColor(player, ChatColor.RED);
							sender.sendMessage(ChatColor.GRAY + "Changing your name color to " + color.toLowerCase() + ".");
						} else if (color.equalsIgnoreCase("white")) {
							plugin.setNameColor(player, ChatColor.WHITE);
							sender.sendMessage(ChatColor.GRAY + "Changing your name color to " + color.toLowerCase() + ".");
						} else if (color.equalsIgnoreCase("yellow")) {
							plugin.setNameColor(player, ChatColor.YELLOW);
							sender.sendMessage(ChatColor.GRAY + "Changing your name color to " + color.toLowerCase() + ".");
						} else { //If color is not recognized
							listColors(sender);
						}
					} else { //If there are no arguments
						listColors(sender);
					}
				} else { //If player does not have permission
					sender.sendMessage(ChatColor.DARK_RED + "You do not have permission to do that.");
				}
			} else { //If sender is not a player
				listColors(sender);
			}
		return true;
	}
	
	public static void listColors(CommandSender sender) { //Shows the color interface
		sender.sendMessage(
				"Usage: /color <color>\n" +
				"Colors:\n" +
				ChatColor.AQUA + "<aqua>" + ChatColor.BLACK + "<black>" + ChatColor.BLUE + "<blue>" +
				ChatColor.DARK_AQUA + "<darkaqua>" + ChatColor.DARK_BLUE + "<darkblue>" + ChatColor.DARK_GRAY +
				"<darkgray>" + ChatColor.DARK_GREEN + "<darkgreen>" + ChatColor.DARK_PURPLE + "<darkpurple>" +
				ChatColor.DARK_RED + "<darkred>" + ChatColor.GOLD + "<gold>" + ChatColor.GRAY + "<gray>" +
				ChatColor.GREEN + "<green>" + ChatColor.LIGHT_PURPLE + "<lightpurple>" + ChatColor.RED + "<red>" +
				ChatColor.WHITE + "<white>" + ChatColor.YELLOW + "<yellow>"
				);
	}
}
package com.gmail.merenze.chatcolors;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class TagCommand implements CommandExecutor{
	private final ChatColors plugin;
	private final String CHANGE = ChatColor.GRAY + "Changing your name color to ";
	private final String NO_PERM = ChatColor.DARK_RED + "Insufficient permission.";
	
	public TagCommand(ChatColors plugin) {
		this.plugin = plugin;
	}
	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		if (sender.hasPermission("chatcolors.tag")) {
			if (!(sender instanceof Player)) {
				listColors(sender);
			} else {
				if (args.length==0) {
					listColors(sender);
				} else if (args.length>=1) {
					TagHandler handler = new TagHandler(plugin);
					Player player = (Player)sender;
					String change = CHANGE + args[0];
					switch(args[0]) {
						case "black":
							player.sendMessage(change);
							handler.setTagColor(player, ChatColor.BLACK);
							break;
						case "darkblue":
							player.sendMessage(change);
							handler.setTagColor(player, ChatColor.DARK_BLUE);
							break;
						case "darkgreen":
							player.sendMessage(change);
							handler.setTagColor(player, ChatColor.DARK_GREEN);
							break;
						case "darkaqua":
							player.sendMessage(change);
							handler.setTagColor(player, ChatColor.DARK_AQUA);
							break;
						case "darkred":
							player.sendMessage(change);
							handler.setTagColor(player, ChatColor.DARK_RED);
							break;
						case "darkpurple":
							player.sendMessage(change);
							handler.setTagColor(player, ChatColor.DARK_PURPLE);
							break;
						case "gold":
							player.sendMessage(change);
							handler.setTagColor(player, ChatColor.GOLD);
							break;
						case "gray":
							player.sendMessage(change);
							handler.setTagColor(player, ChatColor.GRAY);
							break;
						case "darkgray":
							player.sendMessage(change);
							handler.setTagColor(player, ChatColor.DARK_GRAY);
							break;
						case "blue":
							player.sendMessage(change);
							handler.setTagColor(player, ChatColor.DARK_BLUE);
							break;
						case "green":
							player.sendMessage(change);
							handler.setTagColor(player, ChatColor.GREEN);
							break;
						case "aqua":
							player.sendMessage(change);
							handler.setTagColor(player, ChatColor.AQUA);
							break;
						case "red":
							player.sendMessage(change);
							handler.setTagColor(player, ChatColor.RED);
							break;
						case "lightpurple":
							player.sendMessage(change);
							handler.setTagColor(player, ChatColor.LIGHT_PURPLE);
							break;
						case "yellow":
							player.sendMessage(change);
							handler.setTagColor(player, ChatColor.YELLOW);
							break;
						case "white":
							player.sendMessage(change);
							handler.setTagColor(player, ChatColor.WHITE);
							break;
						default:
							listColors(sender);
					}
				}
			}
		}
		else {
			sender.sendMessage(NO_PERM);
		}
		return true;
	}
	
	private void listColors(CommandSender sender) {
		String usage = "Usage: /warp <color>\n"
				+ ChatColor.BLACK + "black " + ChatColor.DARK_BLUE + "darkblue " + ChatColor.DARK_GREEN + "darkgreen " + ChatColor.DARK_AQUA + "darkaqua "
				+ ChatColor.DARK_RED + "darkred " + ChatColor.DARK_PURPLE + "darkpurple " + ChatColor.GOLD + "gold " + ChatColor.GRAY + "gray "
				+ ChatColor.DARK_BLUE + "darkblue " + ChatColor.GREEN + "green " + ChatColor.AQUA + "aqua " + ChatColor.RED + "red " + ChatColor.LIGHT_PURPLE
				+ "lightpurple " + ChatColor.YELLOW + "yellow " + ChatColor.WHITE + "white";
		
		sender.sendMessage(usage);
	}
}

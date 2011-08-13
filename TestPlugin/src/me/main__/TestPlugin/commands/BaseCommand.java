package me.main__.TestPlugin.commands;

import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public abstract class BaseCommand {
	public boolean needPlayer;
	public String permission;
	
	public abstract boolean run(CommandSender sender, String[] args);
	
	public boolean execute(CommandSender sender, String[] args)
	{
		if ((!(sender instanceof Player)) && needPlayer) return false;
		return run(sender, args);
	}
}

package me.main__.TestPlugin.commands;

import org.bukkit.command.CommandSender;

public class TestCommand extends BaseCommand {
	public TestCommand() {

	}
	
	public boolean run(CommandSender sender, String[] args) {
		if (args.length != 0) return false;
		sender.sendMessage("Test erfolgreich!");
		return true;
	}

}

/**
 * 
 */
package me.main__.TestPlugin;

import java.util.HashMap;
import java.util.logging.Logger;

import me.main__.TestPlugin.commands.BaseCommand;
import me.main__.TestPlugin.commands.TestCommand;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.event.Event;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * @author main()
 *
 */
@SuppressWarnings("unused")
public class TestPlugin extends JavaPlugin {
	
	private HashMap<String, BaseCommand> commands = new HashMap<String, BaseCommand>();
	
	Logger log = Logger.getLogger("Minecraft");
	//private final TestPluginPlayerListener playerListener = new TestPluginPlayerListener(this);
	
	public void onEnable(){ 
		//PluginManager pm = this.getServer().getPluginManager();
		//pm.registerEvent(Event.Type.PLAYER_COMMAND, playerListener, Event.Priority.Normal, this);
		
		commands.put("test", new TestCommand());
		
		log.info("Das TestPlugin wurde aktiviert.");
		System.out.println("(epic awesome test des TestPlugins)");
	}
	
	public void onDisable(){ 
		log.info("Das TestPlugin wurde deaktiviert.");
	}
	
	public boolean onCommand(CommandSender sender, Command command, String commandLabel, String[] args) {
		BaseCommand cmd = commands.get(command.getName().toLowerCase());
		if (cmd != null) return cmd.execute(sender, args);
		return false;
	}
}


package me.main__.TestPlugin;

import org.bukkit.event.player.PlayerListener;

public class TestPluginPlayerListener extends PlayerListener {
	public static TestPlugin plugin;
	
	public TestPluginPlayerListener(TestPlugin instance)
	{
		plugin = instance;
	}
	
	public boolean onCommand()
	{
		return false;
	}
	
	public void onPlayerMove()
	{
		
	}
}

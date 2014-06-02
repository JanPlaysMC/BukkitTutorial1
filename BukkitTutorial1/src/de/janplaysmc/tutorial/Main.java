package de.janplaysmc.tutorial;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
	
	public void onEnable()
	{
		
	}
	
	public void onDisable()
	{
		
	}
	
	public boolean onCommand(CommandSender sender,Command cmd,String cmdlabel,String [] args)
	{
		Player p = (Player)sender;
		if(cmd.getName().equalsIgnoreCase("hello"))
		{
			p.sendMessage("Hello World!");
		}
		return false;
	}
	
}

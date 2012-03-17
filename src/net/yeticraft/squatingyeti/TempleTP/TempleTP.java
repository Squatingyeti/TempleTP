package net.yeticraft.squatingyeti.TempleTP;

import java.util.logging.Logger;

import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.command.CommandExecutor;



public class TempleTP extends JavaPlugin {
	
	Logger log = Logger.getLogger("Minecraft");
	
	public void onDisable() {
		log.info("TempleTP has been disabled");
	}
	
	public void onEnable() {
		log.info("TempleTP has been enabled");
		
		// hand commands over to TempleCommand & Found
		CommandExecutor TempleCommandExecutor = new TempleCommand(this);
		CommandExecutor FoundExecutor = new Found(this);
		getCommand("temple").setExecutor(TempleCommandExecutor);
    	getCommand("tt").setExecutor(TempleCommandExecutor);
    	getCommand("found").setExecutor(FoundExecutor);
	}
}

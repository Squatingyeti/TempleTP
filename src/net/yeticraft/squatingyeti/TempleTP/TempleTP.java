package net.yeticraft.squatingyeti.TempleTP;

import java.util.logging.Logger;

import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.command.CommandExecutor;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.RegisteredServiceProvider;

import net.milkbowl.vault.Vault;
import net.milkbowl.vault.economy.Economy;

public class TempleTP extends JavaPlugin {
	
	Logger log = Logger.getLogger("Minecraft");
	private static Economy economy = null;
	private static boolean usingVault = false;
	private static boolean usingEconomy = false;
	
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
    	initializeVault();
	}
	
	public static Economy getEconomy() {
		return economy;
	}
	
	public static boolean isUsingVault() {
		return usingVault;
	}
	
	public static boolean isUsingEconomy() {
		return usingEconomy;
	}
	
	private boolean setupEconomy() {
		if (usingVault) {
			RegisteredServiceProvider<Economy> economyProvider = getServer().getServicesManager()
					.getRegistration(net.milkbowl.vault.economy.Economy.class);
			if (economyProvider != null) {
				economy = economyProvider.getProvider();
			}
			usingEconomy = true;
			return (economy != null);
		}
		usingEconomy = false;
		return false;
	}
	
	private void initializeVault() {
		Plugin x = this.getServer().getPluginManager().getPlugin("Vault");
		if (x != null & x instanceof Vault) {
			log.info("[TempleTP] found [Vault] and searching for economy plugin.");
			usingVault = true;
			if (setupEconomy()) {
				log.info("[TempleTP] found [" + economy.getName() + "] plugin. Prices enabled.");
			}
				else if (!setupEconomy()) {
					log.info("[TempleTP] economy plugin not found. Prices disabled.");
					usingEconomy = false;
				}
		}else {
			log.info("[TempleTP] could not find [Vault]...disabling pricing support.");
			usingVault = false;
		}
	}
}

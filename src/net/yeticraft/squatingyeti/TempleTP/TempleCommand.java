package net.yeticraft.squatingyeti.TempleTP;

import org.bukkit.Chunk;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.ChatColor;
import net.milkbowl.vault.economy.Economy;

public class TempleCommand implements CommandExecutor {
	public TempleCommand(TempleTP plugin) {
	}
	// enum all of our temples
	enum SubCommand {
		HELP,
		LIST,
		PARTHENON,
		PRAMBANAN,
		JOKHANG,
		CONFUCION,
		BAALBEK,
		TOJI,
		COBA,
		LUXOR,
		BEITI,
		TIKAL,
		PANTHEON,
		UPPSALA,
		QORIKANCHA,
		CHOLULA,
		ZAHIR,
		SEVILLE,
		SRIRANGAN,
		NOOB,
		UNKNOWN;
		
		private static SubCommand toSubCommand(String str) {
			try {
				return valueOf(str.toUpperCase());
			} catch (Exception ex) {
				return UNKNOWN;
			}
		}
	}

	
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		if (!(sender instanceof Player)) {
	           sender.sendMessage("You must be a player!");
	           return true;
	        }
		double allyTemple = 100;
		double enemyTemple = 500;
		Player player = (Player) sender;
		String playerName = player.getName();
		Economy economy = TempleTP.getEconomy();
	  	
		if (args.length == 0) {
	    		sender.sendMessage(ChatColor.YELLOW + "Not enough arguments. Try /temple [name]");
				return true;
	    	}
	  	if (args.length >= 2) {
			sender.sendMessage(ChatColor.YELLOW + "Too many arguments. Try /temple [name]");
			return true;
	  		}

	  		switch (SubCommand.toSubCommand(args[0].toUpperCase())) {
	  			case HELP:
	  				sender.sendMessage(ChatColor.YELLOW + "TempleTP Help:");
	  				sender.sendMessage(ChatColor.GRAY + "For a list of temples type:");
	  				sender.sendMessage(ChatColor.GRAY + "/temple list");
	  				sender.sendMessage(ChatColor.GRAY + "to teleport to a temple: /tt [name]");
	  				return true;
	  			case LIST:
	  				player.sendMessage(ChatColor.YELLOW + "Red Temples:");
	  				player.sendMessage(ChatColor.GREEN + "===================================");
	  				player.sendMessage(ChatColor.GRAY + "Prambanan, Jokhang, Confucion, Baalbek,");
	  				player.sendMessage(ChatColor.GRAY + "Toji, Coba, Luxor, Beiti");
	  				player.sendMessage(ChatColor.YELLOW + "Blue Temples:");
	  				player.sendMessage(ChatColor.GREEN + "===================================");
	  				player.sendMessage(ChatColor.GRAY + "Tikal, Pantheon, Uppsala, Qorikancha,");
	  				player.sendMessage(ChatColor.GRAY + "Cholula, Zahir, Seville, Srirangan");
	  				return true;
	  			case PARTHENON:
	  				if (!hasPermission(player,"temple.parthenon")) {
	  					player.sendMessage(ChatColor.YELLOW + "You have not located this great temple");
	  					return true;
	  				}
	  				if (TempleTP.isUsingEconomy()) {
	  					if (TempleTP.getEconomy().getBalance(player.getName()) >= allyTemple &&
	  							player.hasPermission("temple.blue") || player.hasPermission("temple.red") || player.hasPermission("temple.almas")) {
	  							economy.withdrawPlayer(playerName, allyTemple);
	  					}
	  					else {
	  						player.sendMessage(ChatColor.RED + "You do not have enough TPs for this action");
	  						return true;
	  					}
	  				}
	  					if (player.getWorld().getName().equalsIgnoreCase("Yeticraft")) {
	  						Location par = new Location(player.getWorld(), -22, 108, -109);
	  						Chunk parchnk = par.getChunk();
	  						parchnk.load();
	  						player.teleport(par);
	  						player.sendMessage(ChatColor.GREEN + "A Squatch appears");
	  				}
	  				else { 
	  					player.sendMessage(ChatColor.RED + "You cannot teleport to " + args[0] + " from this world");
	  				}
	  				return true;
	  			case PRAMBANAN:
	  				if (!hasPermission(player,"temple.prambanan")) {
	  					player.sendMessage(ChatColor.YELLOW + "You have not located this great temple");
	  					return true;
	  				}
	  				if(player.hasPermission("temple.red") && TempleTP.getEconomy().getBalance(player.getName()) >= allyTemple) {
	  					economy.withdrawPlayer(playerName, allyTemple);
	  				}
	  					else if ((player.hasPermission("temple.blue") || player.hasPermission("temple.almas")) && TempleTP.getEconomy().getBalance(player.getName()) >= enemyTemple) {
	  						economy.withdrawPlayer(playerName, enemyTemple);
	  					}
	  					else {
	  						player.sendMessage(ChatColor.RED + "You do not have enough TPs for this action");
	  						return true;
	  					}
	  					if (player.getWorld().getName().equalsIgnoreCase("Yeticraft")) {
	  						Location pra = new Location(player.getWorld(), 2967, 66, -1366);
	  						Chunk prachnk = pra.getChunk();
	  						prachnk.load();
	  						player.teleport(pra);
	  						player.sendMessage(ChatColor.GREEN + "A Squatch appears");
	  				}
	  				else {
	  					player.sendMessage(ChatColor.RED + "You cannot teleport to " + args[0] + " from this world");
	  				}
	  				return true;
	  			case JOKHANG:
	  				if (!hasPermission(player,"temple.jokhang")) {
	  					player.sendMessage(ChatColor.YELLOW + "You have not located this great temple");
	  					return true;
	  				}
	  				if(player.hasPermission("temple.red") && TempleTP.getEconomy().getBalance(player.getName()) >= allyTemple) {
	  					economy.withdrawPlayer(playerName, allyTemple);
	  				}
	  					else if ((player.hasPermission("temple.blue") || player.hasPermission("temple.almas")) && TempleTP.getEconomy().getBalance(player.getName()) >= enemyTemple) {
	  						economy.withdrawPlayer(playerName, enemyTemple);
	  					}
	  					else {
	  						player.sendMessage(ChatColor.RED + "You do not have enough TPs for this action");
	  						return true;
	  					}
	  					if (player.getWorld().getName().equalsIgnoreCase("Yeticraft")) {
	  						Location jok = new Location(player.getWorld(), 1008, 66, -1373);
	  						Chunk jokchnk = jok.getChunk();
	  						jokchnk.load();
	  						player.teleport(jok);
	  						player.sendMessage(ChatColor.GREEN + "A Squatch appears");
	  				}
	  				else {
	  					player.sendMessage(ChatColor.RED + "You cannot teleport to " + args[0] + " from this world");
	  				}
	  				return true;
	  			case CONFUCION:
	  				if (!hasPermission(player,"temple.confucion")) {
	  					player.sendMessage(ChatColor.YELLOW + "You have not located this great temple");
	  					return true;
	  				}
	  				if(player.hasPermission("temple.red") && TempleTP.getEconomy().getBalance(player.getName()) >= allyTemple) {
	  					economy.withdrawPlayer(playerName, allyTemple);
	  				}
	  					else if ((player.hasPermission("temple.blue") || player.hasPermission("temple.almas")) && TempleTP.getEconomy().getBalance(player.getName()) >= enemyTemple) {
	  						economy.withdrawPlayer(playerName, enemyTemple);
	  					}
	  					else {
	  						player.sendMessage(ChatColor.RED + "You do not have enough TPs for this action");
	  						return true;
	  					}
	  					if (player.getWorld().getName().equalsIgnoreCase("Yeticraft")) {
	  						Location con = new Location(player.getWorld(), -954, 66, -1382);
	  						Chunk conchnk = con.getChunk();
		  					conchnk.load();
	  						player.teleport(con);
	  						player.sendMessage(ChatColor.GREEN + "A Squatch appears");
	  				}
	  				else {
	  					player.sendMessage(ChatColor.RED + "You cannot teleport to " + args[0] + " from this world");
	  				}
	  				return true;
	  			case BAALBEK:
	  				if (!hasPermission(player,"temple.baalbek")) {
	  					player.sendMessage(ChatColor.YELLOW + "You have not located this great temple");
	  					return true;
	  				}
	  				if(player.hasPermission("temple.red") && TempleTP.getEconomy().getBalance(player.getName()) >= allyTemple) {
	  					economy.withdrawPlayer(playerName, allyTemple);
	  				}
	  					else if ((player.hasPermission("temple.blue") || player.hasPermission("temple.almas")) && TempleTP.getEconomy().getBalance(player.getName()) >= enemyTemple) {
	  						economy.withdrawPlayer(playerName, enemyTemple);
	  					}
	  					else {
	  						player.sendMessage(ChatColor.RED + "You do not have enough TPs for this action");
	  						return true;
	  					}
	  					if (player.getWorld().getName().equalsIgnoreCase("Yeticraft")) {
	  						Location baa = new Location(player.getWorld(), -3000, 66, -1383);
	  						Chunk baachnk = baa.getChunk();
		  					baachnk.load();
	  						player.teleport(baa);
	  						player.sendMessage(ChatColor.GREEN + "A Squatch appears");
	  				}
	  				else {
	  					player.sendMessage(ChatColor.RED + "You cannot teleport to " + args[0] + " from this world");
	  				}
	  				return true;
	  			case TOJI:
	  				if (!hasPermission(player,"temple.toji")) {
	  					player.sendMessage(ChatColor.YELLOW + "You have not located this great temple");
	  					return true;
	  				}
	  				if(player.hasPermission("temple.red") && TempleTP.getEconomy().getBalance(player.getName()) >= allyTemple) {
	  					economy.withdrawPlayer(playerName, allyTemple);
	  				}
	  					else if ((player.hasPermission("temple.blue") || player.hasPermission("temple.almas")) && TempleTP.getEconomy().getBalance(player.getName()) >= enemyTemple) {
	  						economy.withdrawPlayer(playerName, enemyTemple);
	  					}
	  					else {
	  						player.sendMessage(ChatColor.RED + "You do not have enough TPs for this action");
	  						return true;
	  					}
	  					if (player.getWorld().getName().equalsIgnoreCase("Yeticraft")) {
	  						Location toj = new Location(player.getWorld(), 3034, 66, -3174);
	  						Chunk tojchnk = toj.getChunk();
		  					tojchnk.load();
	  						player.teleport(toj);
	  						player.sendMessage(ChatColor.GREEN + "A Squatch appears");
	  				}
	  				else {
	  					player.sendMessage(ChatColor.RED + "You cannot teleport to " + args[0] + " from this world");
	  				}
	  				return true;
	  			case COBA:
	  				if (!hasPermission(player,"temple.coba")) {
	  					player.sendMessage(ChatColor.YELLOW + "You have not located this great temple");
	  					return true;
	  				}
	  				if(player.hasPermission("temple.red") && TempleTP.getEconomy().getBalance(player.getName()) >= allyTemple) {
	  					economy.withdrawPlayer(playerName, allyTemple);
	  				}
	  					else if ((player.hasPermission("temple.blue") || player.hasPermission("temple.almas")) && TempleTP.getEconomy().getBalance(player.getName()) >= enemyTemple) {
	  						economy.withdrawPlayer(playerName, enemyTemple);
	  					}
	  					else {
	  						player.sendMessage(ChatColor.RED + "You do not have enough TPs for this action");
	  						return true;
	  					}
	  					if (player.getWorld().getName().equalsIgnoreCase("Yeticraft")) {
	  						Location cob = new Location(player.getWorld(), 1000, 66, -3124);
	  						Chunk cobchnk = cob.getChunk();
		  					cobchnk.load();
	  						player.teleport(cob);
	  						player.sendMessage(ChatColor.GREEN + "A Squatch appears");
	  				}
	  				else {
	  					player.sendMessage(ChatColor.RED + "You cannot teleport to " + args[0] + " from this world");
	  				}
	  				return true;
	  			case LUXOR:
	  				if (!hasPermission(player,"temple.luxor")) {
	  					player.sendMessage(ChatColor.YELLOW + "You have not located this great temple");
	  					return true;
	  				}
	  				if(player.hasPermission("temple.red") && TempleTP.getEconomy().getBalance(player.getName()) >= allyTemple) {
	  					economy.withdrawPlayer(playerName, allyTemple);
	  				}
	  					else if ((player.hasPermission("temple.blue") || player.hasPermission("temple.almas")) && TempleTP.getEconomy().getBalance(player.getName()) >= enemyTemple) {
	  						economy.withdrawPlayer(playerName, enemyTemple);
	  					}
	  					else {
	  						player.sendMessage(ChatColor.RED + "You do not have enough TPs for this action");
	  						return true;
	  					}
	  					if (player.getWorld().getName().equalsIgnoreCase("Yeticraft")) {
	  						Location lux = new Location(player.getWorld(), -1000, 65, -3099);
	  						Chunk luxchnk = lux.getChunk();
		  					luxchnk.load();
	  						player.teleport(lux);
	  						player.sendMessage(ChatColor.GREEN + "A Squatch appears");
	  				}
	  				else {
	  					player.sendMessage(ChatColor.RED + "You cannot teleport to " + args[0] + " from this world");
	  				}
	  				return true;
	  			case BEITI:
	  				if (!hasPermission(player,"temple.beiti")) {
	  					player.sendMessage(ChatColor.YELLOW + "You have not located this great temple");
	  					return true;
	  				}
	  				if(player.hasPermission("temple.red") && TempleTP.getEconomy().getBalance(player.getName()) >= allyTemple) {
	  					economy.withdrawPlayer(playerName, allyTemple);
	  				}
	  					else if ((player.hasPermission("temple.blue") || player.hasPermission("temple.almas")) && TempleTP.getEconomy().getBalance(player.getName()) >= enemyTemple) {
	  						economy.withdrawPlayer(playerName, enemyTemple);
	  					}
	  					else {
	  						player.sendMessage(ChatColor.RED + "You do not have enough TPs for this action");
	  						return true;
	  					}
	  					if (player.getWorld().getName().equalsIgnoreCase("Yeticraft")) {
	  						Location bei = new Location(player.getWorld(), -2991, 69, -3138);
	  						Chunk beichnk = bei.getChunk();
		  					beichnk.load();
	  						player.teleport(bei);
	  						player.sendMessage(ChatColor.GREEN + "A Squatch appears");
	  				}
	  				else {
	  					player.sendMessage(ChatColor.RED + "You cannot teleport to " + args[0] + " from this world");
	  				}
	  				return true;
	  			case TIKAL:
	  				if (!hasPermission(player,"temple.tikal")) {
	  					player.sendMessage(ChatColor.YELLOW + "You have not located this great temple");
	  					return true;
	  				}
	  				if(player.hasPermission("temple.blue") && TempleTP.getEconomy().getBalance(player.getName()) >= allyTemple) {
	  					economy.withdrawPlayer(playerName, allyTemple);
	  				}
	  					else if ((player.hasPermission("temple.red") || player.hasPermission("temple.almas")) && TempleTP.getEconomy().getBalance(player.getName()) >= enemyTemple) {
	  						economy.withdrawPlayer(playerName, enemyTemple);
	  					}
	  					else {
	  						player.sendMessage(ChatColor.RED + "You do not have enough TPs for this action");
	  						return true;
	  					}
	  					if (player.getWorld().getName().equalsIgnoreCase("Yeticraft")) {
	  						Location tik = new Location(player.getWorld(), 3018, 66, 1362);
	  						Chunk tikchnk = tik.getChunk();
		  					tikchnk.load();
	  						player.teleport(tik);
	  						player.sendMessage(ChatColor.GREEN + "A Squatch appears");
	  				}
	  				else {
	  					player.sendMessage(ChatColor.RED + "You cannot teleport to " + args[0] + " from this world");
	  				}
	  				return true;
	  			case PANTHEON:
	  				if (!hasPermission(player,"temple.pantheon")) {
	  					player.sendMessage(ChatColor.YELLOW + "You have not located this great temple");
	  					return true;
	  				}
	  				if(player.hasPermission("temple.blue") && TempleTP.getEconomy().getBalance(player.getName()) >= allyTemple) {
	  					economy.withdrawPlayer(playerName, allyTemple);
	  				}
	  					else if ((player.hasPermission("temple.red") || player.hasPermission("temple.almas")) && TempleTP.getEconomy().getBalance(player.getName()) >= enemyTemple) {
	  						economy.withdrawPlayer(playerName, enemyTemple);
	  					}
	  					else {
	  						player.sendMessage(ChatColor.RED + "You do not have enough TPs for this action");
	  						return true;
	  					}
	  					if (player.getWorld().getName().equalsIgnoreCase("Yeticraft")) {
	  						Location pan = new Location(player.getWorld(), 1000, 70, 1375);
	  						Chunk panchnk = pan.getChunk();
		  					panchnk.load();
	  						player.teleport(pan);
	  						player.sendMessage(ChatColor.GREEN + "A Squatch appears");
	  				}
	  				else {
	  					player.sendMessage(ChatColor.RED + "You cannot teleport to " + args[0] + " from this world");
	  				}
	  				return true;
	  			case UPPSALA:
	  				if (!hasPermission(player,"temple.uppsala")) {
	  					player.sendMessage(ChatColor.YELLOW + "You have not located this great temple");
	  					return true;
	  				}
	  				if (player.hasPermission("temple.blue") && TempleTP.getEconomy().getBalance(player.getName()) >= allyTemple) {
	  					economy.withdrawPlayer(playerName, allyTemple);
	  				}
	  					else if ((player.hasPermission("temple.red") || player.hasPermission("temple.almas")) && TempleTP.getEconomy().getBalance(player.getName()) >= enemyTemple) {
	  						economy.withdrawPlayer(playerName, enemyTemple);
	  					}
	  					else {
	  						player.sendMessage(ChatColor.RED + "You do not have enough TPs for this action");
	  						return true;
	  					}
	  					if (player.getWorld().getName().equalsIgnoreCase("Yeticraft")) {
	  						Location upp = new Location(player.getWorld(), -1000, 66, 1375);
	  						Chunk uppchnk = upp.getChunk();
		  					uppchnk.load();
	  						player.teleport(upp);
	  						player.sendMessage(ChatColor.GREEN + "A Squatch appears");
	  				}
	  				else {
	  					player.sendMessage(ChatColor.RED + "You cannot teleport to " + args[0] + " from this world");
	  				}
	  				return true;
	  			case QORIKANCHA:
	  				if (!hasPermission(player,"temple.qorikancha")) {
	  					player.sendMessage(ChatColor.YELLOW + "You have not located this great temple");
	  					return true;
	  				}
	  				if(player.hasPermission("temple.blue") && TempleTP.getEconomy().getBalance(player.getName()) >= allyTemple) {
	  					economy.withdrawPlayer(playerName, allyTemple);
	  				}
	  					else if ((player.hasPermission("temple.red") || player.hasPermission("temple.almas")) && TempleTP.getEconomy().getBalance(player.getName()) >= enemyTemple) {
	  						economy.withdrawPlayer(playerName, enemyTemple);
	  					}
	  					else {
	  						player.sendMessage(ChatColor.RED + "You do not have enough TPs for this action");
	  						return true;
	  					}
	  					if (player.getWorld().getName().equalsIgnoreCase("Yeticraft")) {
	  						Location qor = new Location(player.getWorld(), -3001, 71, 1395);
	  						Chunk qorchnk = qor.getChunk();
		  					qorchnk.load();
	  						player.teleport(qor);
	  						player.sendMessage(ChatColor.GREEN + "A Squatch appears");
	  				}
	  				else {
	  					player.sendMessage(ChatColor.RED + "You cannot teleport to " + args[0] + " from this world");
	  				}
	  				return true;
	  			case CHOLULA:
	  				if (!hasPermission(player,"temple.cholula")) {
	  					player.sendMessage(ChatColor.YELLOW + "You have not located this great temple");
	  					return true;
	  				}
	  				if(player.hasPermission("temple.blue") && TempleTP.getEconomy().getBalance(player.getName()) >= allyTemple) {
	  					economy.withdrawPlayer(playerName, allyTemple);
	  				}
	  					else if ((player.hasPermission("temple.red") || player.hasPermission("temple.almas")) && TempleTP.getEconomy().getBalance(player.getName()) >= enemyTemple) {
	  						economy.withdrawPlayer(playerName, enemyTemple);
	  					}
	  					else {
	  						player.sendMessage(ChatColor.RED + "You do not have enough TPs for this action");
	  						return true;
	  					}
	  					if (player.getWorld().getName().equalsIgnoreCase("Yeticraft")) {
	  						Location cho = new Location(player.getWorld(), 3018, 71, 3094);
	  						Chunk chochnk = cho.getChunk();
		  					chochnk.load();
	  						player.teleport(cho);
	  						player.sendMessage(ChatColor.GREEN + "A Squatch appears");
	  				}
	  				else {
	  					player.sendMessage(ChatColor.RED + "You cannot teleport to " + args[0] + " from this world");
	  				}
	  				return true;
	  			case ZAHIR:
	  				if (!hasPermission(player,"temple.zahir")) {
	  					player.sendMessage(ChatColor.YELLOW + "You have not located this great temple");
	  					return true;
	  				}
	  				if(player.hasPermission("temple.blue") && TempleTP.getEconomy().getBalance(player.getName()) >= allyTemple) {
	  					economy.withdrawPlayer(playerName, allyTemple);
	  				}
	  					else if ((player.hasPermission("temple.red") || player.hasPermission("temple.almas")) && TempleTP.getEconomy().getBalance(player.getName()) >= enemyTemple) {
	  						economy.withdrawPlayer(playerName, enemyTemple);
	  					}
	  					else {
	  						player.sendMessage(ChatColor.RED + "You do not have enough TPs for this action");
	  						return true;
	  					}
	  					if (player.getWorld().getName().equalsIgnoreCase("Yeticraft")) {
	  						Location zah = new Location(player.getWorld(), 973, 77, 3131);
	  						Chunk zahchnk = zah.getChunk();
		  					zahchnk.load();
	  						player.teleport(zah);
	  						player.sendMessage(ChatColor.GREEN + "A Squatch appears");
	  				}
	  				else {
	  					player.sendMessage(ChatColor.RED + "You cannot teleport to " + args[0] + " from this world");
	  				}
	  				return true;
	  			case SEVILLE:
	  				if (!hasPermission(player,"temple.seville")) {
	  					player.sendMessage(ChatColor.YELLOW + "You have not located this great temple");
	  					return true;
	  				}
	  				if(player.hasPermission("temple.blue") && TempleTP.getEconomy().getBalance(player.getName()) >= allyTemple) {
	  					economy.withdrawPlayer(playerName, allyTemple);
	  				}
	  					else if ((player.hasPermission("temple.red") || player.hasPermission("temple.almas")) && TempleTP.getEconomy().getBalance(player.getName()) >= enemyTemple) {
	  						economy.withdrawPlayer(playerName, enemyTemple);
	  					}
	  					else {
	  						player.sendMessage(ChatColor.RED + "You do not have enough TPs for this action");
	  						return true;
	  					}
	  					if (player.getWorld().getName().equalsIgnoreCase("Yeticraft")) {
	  						Location sev = new Location(player.getWorld(), -957, 68, 3159);
	  						Chunk sevchnk = sev.getChunk();
		  					sevchnk.load();
	  						player.teleport(sev);
	  						player.sendMessage(ChatColor.GREEN + "A Squatch appears");
	  				}
	  				else {
	  					player.sendMessage(ChatColor.RED + "You cannot teleport to " + args[0] + " from this world");
	  				}
	  				return true;
	  			case SRIRANGAN:
	  				if (!hasPermission(player,"temple.srirangan")) {
	  					player.sendMessage(ChatColor.YELLOW + "You have not located this great temple");
	  					return true;
	  				}
	  				if(player.hasPermission("temple.blue") && TempleTP.getEconomy().getBalance(player.getName()) >= allyTemple) {
	  					economy.withdrawPlayer(playerName, allyTemple);
	  				}
	  					else if ((player.hasPermission("temple.red") || player.hasPermission("temple.almas")) && TempleTP.getEconomy().getBalance(player.getName()) >= enemyTemple) {
	  						economy.withdrawPlayer(playerName, enemyTemple);
	  					}
	  					else {
	  						player.sendMessage(ChatColor.RED + "You do not have enough TPs for this action");
	  						return true;
	  					}
	  					if (player.getWorld().getName().equalsIgnoreCase("Yeticraft")) {
	  						Location srir = new Location(player.getWorld(), -3000, 69, 3125);
	  						Chunk srichnk = srir.getChunk();
		  					srichnk.load();
	  						player.teleport(srir);
	  						player.sendMessage(ChatColor.GREEN + "A Squatch appears");
	  				}
	  				else {
	  					player.sendMessage(ChatColor.RED + "You cannot teleport to " + args[0] + " from this world");
	  				}
	  				return true;
	  			case NOOB:
	  				World yeticraft = player.getServer().getWorld("Yeticraft");
	  				Location noob = new Location(yeticraft, -47, 96, 33);
	  				if (player.hasPermission("temple.noob")) {
	  					Chunk noobchnk = noob.getChunk();
	  					noobchnk.load();
	  					player.teleport(noob);
	  					player.sendMessage(ChatColor.GREEN + "Check up on dem nubs");
	  				}
	  				else {
	  					player.sendMessage(ChatColor.RED + "You do not have permission to go there");
	  				}
	  				return true;
	  			case UNKNOWN:
	  				player.sendMessage("Unknown command. Please try again");
	  				return true;
	  		}
	  				return false;
		}
	
	boolean hasPermission(Player player, String perm) {
		return player.isOp() || player.hasPermission(perm);
	}
	
}
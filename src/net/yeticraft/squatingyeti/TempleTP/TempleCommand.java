package net.yeticraft.squatingyeti.TempleTP;

import org.bukkit.Chunk;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.ChatColor;

public class TempleCommand implements CommandExecutor {
	public TempleCommand(TempleTP plugin) {
	}
	
	enum SubCommand {
		HELP,
		TIKAL,
		PRAMBANAN,
		JOKHANG,
		CONFUCION,
		BAALBEK,
		TOJI,
		COBA,
		LUXOR,
		BEITI,
		PARTHENON,
		PANTHEON,
		UPPSALA,
		QORIKANCHA,
		CHOLULA,
		ZAHIR,
		SEVILLE,
		SRIRANGAN,
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
		Player player = (Player) sender;
	  	if (args.length == 0) {
	    		sender.sendMessage("Not enough arguments. Try /temple [name]");
				return true;
	    	}
	  	if (args.length > 2) {
			sender.sendMessage("Too many arguments. Try /temple [name]");
			return true;
	  		}
	  	/* Currently don't know how to make sure they're not teleporting out of the nether or the end
	  	   Need to set up a test to make sure the player is only in the main world
	  	   Also realized I can just input the coords without calling (x, y, z) in the location
	  	   The player.getWorld() is still a janky implementation to make things work
	  	*/
	  		switch (SubCommand.toSubCommand(args[0].toUpperCase())) {
	  			case HELP:
	  				sender.sendMessage("Help test");
	  				return true;
	  			case TIKAL:
	  				if (!hasPermission(player,"temple.tikal")) {
	  					player.sendMessage("You have not located this great temple");
	  				}
	  					else if (player.getWorld().getName().equalsIgnoreCase("Yeticraft")) {
	  						Location tik = new Location(player.getWorld(), -22, 67, -109);
	  						Chunk tikchnk = tik.getChunk();
	  						tikchnk.load();
	  						player.teleport(tik);
	  						player.sendMessage(ChatColor.YELLOW + "A Squatch appears");
	  				}
	  				else { 
	  					player.sendMessage(ChatColor.RED + "You cannot teleport to " + args[0] + " from this world");
	  				}
	  				return true;
	  			case PRAMBANAN:
	  				if (!hasPermission(player,"temple.prambanan")) {
	  					player.sendMessage("You have not located this great temple");
	  				}
	  					else if (player.getWorld().getName().equalsIgnoreCase("Yeticraft")) {
	  						Location pra = new Location(player.getWorld(), 3000, 67, -1375);
	  						Chunk prachnk = pra.getChunk();
	  						prachnk.load();
	  						player.teleport(pra);
	  						player.sendMessage(ChatColor.YELLOW + "A Squatch appears");
	  				}
	  				else {
	  					player.sendMessage(ChatColor.RED + "You cannot teleport to " + args[0] + " from this world");
	  				}
	  				return true;
	  			case JOKHANG:
	  				if (!hasPermission(player,"temple.jokhang")) {
	  					player.sendMessage("You have not located this great temple");
	  				}
	  					else if (player.getWorld().getName().equalsIgnoreCase("Yeticraft")) {
	  						Location jok = new Location(player.getWorld(), 1000, 67, -1375);
	  						Chunk jokchnk = jok.getChunk();
	  						jokchnk.load();
	  						player.teleport(jok);
	  						player.sendMessage(ChatColor.YELLOW + "A Squatch appears");
	  				}
	  				else {
	  					player.sendMessage(ChatColor.RED + "You cannot teleport to " + args[0] + " from this world");
	  				}
	  				return true;
	  			case CONFUCION:
	  				if (!hasPermission(player,"temple.confucion")) {
	  					player.sendMessage("You have not located this great temple");
	  				}
	  					else if (player.getWorld().getName().equalsIgnoreCase("Yeticraft")) {
	  						Location con = new Location(player.getWorld(), -1000, 80, -1375);
	  						Chunk conchnk = con.getChunk();
		  					conchnk.load();
	  						player.teleport(con);
	  						player.sendMessage(ChatColor.YELLOW + "A Squatch appears");
	  				}
	  				else {
	  					player.sendMessage(ChatColor.RED + "You cannot teleport to " + args[0] + " from this world");
	  				}
	  				return true;
	  			case BAALBEK:
	  				if (!hasPermission(player,"temple.baalbek")) {
	  					player.sendMessage("You have not located this great temple");
	  				}
	  					else if (player.getWorld().getName().equalsIgnoreCase("Yeticraft")) {
	  						Location baa = new Location(player.getWorld(), -3000, 80, -1375);
	  						Chunk baachnk = baa.getChunk();
		  					baachnk.load();
	  						player.teleport(baa);
	  						player.sendMessage(ChatColor.YELLOW + "A Squatch appears");
	  				}
	  				else {
	  					player.sendMessage(ChatColor.RED + "You cannot teleport to " + args[0] + " from this world");
	  				}
	  				return true;
	  			case TOJI:
	  				if (!hasPermission(player,"temple.toji")) {
	  					player.sendMessage("You have not located this great temple");
	  				}
	  					else if (player.getWorld().getName().equalsIgnoreCase("Yeticraft")) {
	  						Location toj = new Location(player.getWorld(), 3000, 80, -3125);
	  						Chunk tojchnk = toj.getChunk();
		  					tojchnk.load();
	  						player.teleport(toj);
	  						player.sendMessage(ChatColor.YELLOW + "A Squatch appears");
	  				}
	  				else {
	  					player.sendMessage(ChatColor.RED + "You cannot teleport to " + args[0] + " from this world");
	  				}
	  				return true;
	  			case COBA:
	  				if (!hasPermission(player,"temple.coba")) {
	  					player.sendMessage("You have not located this great temple");
	  				}
	  					else if (player.getWorld().getName().equalsIgnoreCase("Yeticraft")) {
	  						Location cob = new Location(player.getWorld(), 1000, 80, -3125);
	  						Chunk cobchnk = cob.getChunk();
		  					cobchnk.load();
	  						player.teleport(cob);
	  						player.sendMessage(ChatColor.YELLOW + "A Squatch appears");
	  				}
	  				else {
	  					player.sendMessage(ChatColor.RED + "You cannot teleport to " + args[0] + " from this world");
	  				}
	  				return true;
	  			case LUXOR:
	  				if (!hasPermission(player,"temple.luxor")) {
	  					player.sendMessage("You have not located this great temple");
	  				}
	  					else if (player.getWorld().getName().equalsIgnoreCase("Yeticraft")) {
	  						Location lux = new Location(player.getWorld(), -1000, 80, -3125);
	  						Chunk luxchnk = lux.getChunk();
		  					luxchnk.load();
	  						player.teleport(lux);
	  						player.sendMessage(ChatColor.YELLOW + "A Squatch appears");
	  				}
	  				else {
	  					player.sendMessage(ChatColor.RED + "You cannot teleport to " + args[0] + " from this world");
	  				}
	  				return true;
	  			case BEITI:
	  				if (!hasPermission(player,"temple.beiti")) {
	  					player.sendMessage("You have not located this great temple");
	  				}
	  					else if (player.getWorld().getName().equalsIgnoreCase("Yeticraft")) {
	  						Location bei = new Location(player.getWorld(), -3000, 80, -3125);
	  						Chunk beichnk = bei.getChunk();
		  					beichnk.load();
	  						player.teleport(bei);
	  						player.sendMessage(ChatColor.YELLOW + "A Squatch appears");
	  				}
	  				else {
	  					player.sendMessage(ChatColor.RED + "You cannot teleport to " + args[0] + " from this world");
	  				}
	  				return true;
	  			case PARTHENON:
	  				if (!hasPermission(player,"temple.parthenon")) {
	  					player.sendMessage("You have not located this great temple");
	  				}
	  					else if (player.getWorld().getName().equalsIgnoreCase("Yeticraft")) {
	  						Location par = new Location(player.getWorld(), 3000, 80, 1375);
	  						Chunk parchnk = par.getChunk();
		  					parchnk.load();
	  						player.teleport(par);
	  						player.sendMessage(ChatColor.YELLOW + "A Squatch appears");
	  				}
	  				else {
	  					player.sendMessage(ChatColor.RED + "You cannot teleport to " + args[0] + " from this world");
	  				}
	  				return true;
	  			case PANTHEON:
	  				if (!hasPermission(player,"temple.pantheon")) {
	  					player.sendMessage("You have not located this great temple");
	  				}
	  					else if (player.getWorld().getName().equalsIgnoreCase("Yeticraft")) {
	  						Location pan = new Location(player.getWorld(), 1000, 80, 1375);
	  						Chunk panchnk = pan.getChunk();
		  					panchnk.load();
	  						player.teleport(pan);
	  						player.sendMessage(ChatColor.YELLOW + "A Squatch appears");
	  				}
	  				else {
	  					player.sendMessage(ChatColor.RED + "You cannot teleport to " + args[0] + " from this world");
	  				}
	  				return true;
	  			case UPPSALA:
	  				if (!hasPermission(player,"temple.uppsala")) {
	  					player.sendMessage("You have not located this great temple");
	  				}
	  					else if (player.getWorld().getName().equalsIgnoreCase("Yeticraft")) {
	  						Location upp = new Location(player.getWorld(), -1000, 80, 1375);
	  						Chunk uppchnk = upp.getChunk();
		  					uppchnk.load();
	  						player.teleport(upp);
	  						player.sendMessage(ChatColor.YELLOW + "A Squatch appears");
	  				}
	  				else {
	  					player.sendMessage(ChatColor.RED + "You cannot teleport to " + args[0] + " from this world");
	  				}
	  				return true;
	  			case QORIKANCHA:
	  				if (!hasPermission(player,"temple.qorikancha")) {
	  					player.sendMessage("You have not located this great temple");
	  				}
	  					else if (player.getWorld().getName().equalsIgnoreCase("Yeticraft")) {
	  						Location qor = new Location(player.getWorld(), -3000, 80, 1375);
	  						Chunk qorchnk = qor.getChunk();
		  					qorchnk.load();
	  						player.teleport(qor);
	  						player.sendMessage(ChatColor.YELLOW + "A Squatch appears");
	  				}
	  				else {
	  					player.sendMessage(ChatColor.RED + "You cannot teleport to " + args[0] + " from this world");
	  				}
	  				return true;
	  			case CHOLULA:
	  				if (!hasPermission(player,"temple.cholula")) {
	  					player.sendMessage("You have not located this great temple");
	  				}
	  					else if (player.getWorld().getName().equalsIgnoreCase("Yeticraft")) {
	  						Location cho = new Location(player.getWorld(), 3000, 80, 3125);
	  						Chunk chochnk = cho.getChunk();
		  					chochnk.load();
	  						player.teleport(cho);
	  						player.sendMessage(ChatColor.YELLOW + "A Squatch appears");
	  				}
	  				else {
	  					player.sendMessage(ChatColor.RED + "You cannot teleport to " + args[0] + " from this world");
	  				}
	  				return true;
	  			case ZAHIR:
	  				if (!hasPermission(player,"temple.zahir")) {
	  					player.sendMessage("You have not located this great temple");
	  				}
	  					else if (player.getWorld().getName().equalsIgnoreCase("Yeticraft")) {
	  						Location zah = new Location(player.getWorld(), 1000, 80, 3125);
	  						Chunk zahchnk = zah.getChunk();
		  					zahchnk.load();
	  						player.teleport(zah);
	  						player.sendMessage(ChatColor.YELLOW + "A Squatch appears");
	  				}
	  				else {
	  					player.sendMessage(ChatColor.RED + "You cannot teleport to " + args[0] + " from this world");
	  				}
	  				return true;
	  			case SEVILLE:
	  				if (!hasPermission(player,"temple.seville")) {
	  					player.sendMessage("You have not located this great temple");
	  				}
	  					else if (player.getWorld().getName().equalsIgnoreCase("Yeticraft")) {
	  						Location sev = new Location(player.getWorld(), -1000, 80, 3125);
	  						Chunk sevchnk = sev.getChunk();
		  					sevchnk.load();
	  						player.teleport(sev);
	  						player.sendMessage(ChatColor.YELLOW + "A Squatch appears");
	  				}
	  				else {
	  					player.sendMessage(ChatColor.RED + "You cannot teleport to " + args[0] + " from this world");
	  				}
	  				return true;
	  			case SRIRANGAN:
	  				if (!hasPermission(player,"temple.srirangan")) {
	  					player.sendMessage("You have not located this great temple");
	  				}
	  					else if (player.getWorld().getName().equalsIgnoreCase("Yeticraft")) {
	  						Location srir = new Location(player.getWorld(), -3000, 80, 3125);
	  						Chunk srichnk = srir.getChunk();
		  					srichnk.load();
	  						player.teleport(srir);
	  						player.sendMessage(ChatColor.YELLOW + "A Squatch appears");
	  				}
	  				else {
	  					player.sendMessage(ChatColor.RED + "You cannot teleport to " + args[0] + " from this world");
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

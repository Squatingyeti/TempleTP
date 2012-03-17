package me.squatingyeti.TempleTP;

import org.bukkit.Chunk;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.ChatColor;

import ru.tehkode.permissions.PermissionManager; 
import ru.tehkode.permissions.PermissionUser; 
import ru.tehkode.permissions.bukkit.PermissionsEx;

public class TempleCommand implements CommandExecutor {
	public TempleCommand(TempleTP plugin) {
	}

	enum SubCommand {
		HELP,
		TIKAL,
		NEXT,
		ANOTHER,
		HOFF,
		YETI,
		A,
		B,
		C,
		D,
		E,
		F,
		G,
		H,
		I,
		J,
		K,
		L,
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
		PermissionManager pexPlayer = PermissionsEx.getPermissionManager();
		PermissionUser pPlayer = pexPlayer.getUser(player);
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
	  				if (player.getWorld().getName().equalsIgnoreCase("Yeticraft")) {
	  				Location tikal = new Location(player.getWorld(), -22, 67, -109);
	  				Chunk chnk = tikal.getChunk();
	  				chnk.load();
	  				player.teleport(tikal);
	  				player.sendMessage(ChatColor.YELLOW + "Teleport successful");
	  				}
	  				else { 
	  					player.sendMessage(ChatColor.RED + "You cannot teleport to " + args[0] + " from this world");
	  				}
	  				return true;
	  			case NEXT:
	  				if (player.getWorld().getName().equalsIgnoreCase("Yetonia")) {
	  				Location next = new Location(player.getWorld(), 3000, 67, -1375);
	  				Chunk chnk = next.getChunk();
	  				chnk.load();
	  				player.teleport(next);
	  				player.sendMessage(ChatColor.YELLOW + "Teleport successful");
	  				}
	  				else {
	  					player.sendMessage(ChatColor.RED + "You cannot teleport to " + args[0] + " from this world");
	  				}
	  				return true;
	  			case ANOTHER:
	  				if (player.getWorld().getName().equalsIgnoreCase("Yetonia")) {
	  				Location another = new Location(player.getWorld(), 1000, 67, -1375);
	  				Chunk chnk = another.getChunk();
	  				chnk.load();
	  				player.teleport(another);
	  				player.sendMessage(ChatColor.YELLOW + "A Squatch appears");
	  				}
	  				else {
	  					player.sendMessage(ChatColor.RED + "You cannot teleport to " + args[0] + " from this world");
	  				}
	  				return true;
	  			case HOFF:
	  				if (player.getWorld().getName().equalsIgnoreCase("Yeticraft")) {
	  					Location hoff = new Location(player.getWorld(), -1000, 80, -1375);
	  					Chunk chnk = hoff.getChunk();
		  				chnk.load();
	  					player.teleport(hoff);
	  					player.sendMessage(ChatColor.YELLOW + "A Squatch appears");
	  				}
	  				else {
	  					player.sendMessage(ChatColor.RED + "You cannot teleport to " + args[0] + " from this world");
	  				}
	  				return true;
	  			case YETI:
	  				if (player.getWorld().getName().equalsIgnoreCase("Yeticraft")) {
	  					Location yeti = new Location(player.getWorld(), -3000, 80, -1375);
	  					Chunk chnk = yeti.getChunk();
		  				chnk.load();
	  					player.teleport(yeti);
	  					player.sendMessage(ChatColor.YELLOW + "A Squatch appears");
	  				}
	  				else {
	  					player.sendMessage(ChatColor.RED + "You cannot teleport to " + args[0] + " from this world");
	  				}
	  				return true;
	  			case A:
	  				if (player.getWorld().getName().equalsIgnoreCase("Yeticraft")) {
	  					Location a = new Location(player.getWorld(), 3000, 80, -3125);
	  					Chunk chnk = a.getChunk();
		  				chnk.load();
	  					player.teleport(a);
	  					player.sendMessage(ChatColor.YELLOW + "A Squatch appears");
	  				}
	  				else {
	  					player.sendMessage(ChatColor.RED + "You cannot teleport to " + args[0] + " from this world");
	  				}
	  				return true;
	  			case B:
	  				if (player.getWorld().getName().equalsIgnoreCase("Yeticraft")) {
	  					Location b = new Location(player.getWorld(), 1000, 80, -3125);
	  					Chunk chnk = b.getChunk();
		  				chnk.load();
	  					player.teleport(b);
	  					player.sendMessage(ChatColor.YELLOW + "A Squatch appears");
	  				}
	  				else {
	  					player.sendMessage(ChatColor.RED + "You cannot teleport to " + args[0] + " from this world");
	  				}
	  				return true;
	  			case C:
	  				if (player.getWorld().getName().equalsIgnoreCase("Yeticraft")) {
	  					Location c = new Location(player.getWorld(), -1000, 80, -3125);
	  					Chunk chnk = c.getChunk();
		  				chnk.load();
	  					player.teleport(c);
	  					player.sendMessage(ChatColor.YELLOW + "A Squatch appears");
	  				}
	  				else {
	  					player.sendMessage(ChatColor.RED + "You cannot teleport to " + args[0] + " from this world");
	  				}
	  				return true;
	  			case D:
	  				if (player.getWorld().getName().equalsIgnoreCase("Yeticraft")) {
	  					Location d = new Location(player.getWorld(), -3000, 80, -3125);
	  					Chunk chnk = d.getChunk();
		  				chnk.load();
	  					player.teleport(d);
	  					player.sendMessage(ChatColor.YELLOW + "A Squatch appears");
	  				}
	  				else {
	  					player.sendMessage(ChatColor.RED + "You cannot teleport to " + args[0] + " from this world");
	  				}
	  				return true;
	  			case E:
	  				if (player.getWorld().getName().equalsIgnoreCase("Yeticraft")) {
	  					Location e = new Location(player.getWorld(), 3000, 80, 1375);
	  					Chunk chnk = e.getChunk();
		  				chnk.load();
	  					player.teleport(e);
	  					player.sendMessage(ChatColor.YELLOW + "A Squatch appears");
	  				}
	  				else {
	  					player.sendMessage(ChatColor.RED + "You cannot teleport to " + args[0] + " from this world");
	  				}
	  				return true;
	  			case F:
	  				if (player.getWorld().getName().equalsIgnoreCase("Yeticraft")) {
	  					Location f = new Location(player.getWorld(), 1000, 80, 1375);
	  					Chunk chnk = f.getChunk();
		  				chnk.load();
	  					player.teleport(f);
	  					player.sendMessage(ChatColor.YELLOW + "A Squatch appears");
	  				}
	  				else {
	  					player.sendMessage(ChatColor.RED + "You cannot teleport to " + args[0] + " from this world");
	  				}
	  				return true;
	  			case G:
	  				if (player.getWorld().getName().equalsIgnoreCase("Yeticraft")) {
	  					Location g = new Location(player.getWorld(), -1000, 80, 1375);
	  					Chunk chnk = g.getChunk();
		  				chnk.load();
	  					player.teleport(g);
	  					player.sendMessage(ChatColor.YELLOW + "A Squatch appears");
	  				}
	  				else {
	  					player.sendMessage(ChatColor.RED + "You cannot teleport to " + args[0] + " from this world");
	  				}
	  				return true;
	  			case H:
	  				if (player.getWorld().getName().equalsIgnoreCase("Yeticraft")) {
	  					Location h = new Location(player.getWorld(), -3000, 80, 1375);
	  					Chunk chnk = h.getChunk();
		  				chnk.load();
	  					player.teleport(h);
	  					player.sendMessage(ChatColor.YELLOW + "A Squatch appears");
	  				}
	  				else {
	  					player.sendMessage(ChatColor.RED + "You cannot teleport to " + args[0] + " from this world");
	  				}
	  				return true;
	  			case I:
	  				if (player.getWorld().getName().equalsIgnoreCase("Yeticraft")) {
	  					Location i = new Location(player.getWorld(), 3000, 80, 3125);
	  					Chunk chnk = i.getChunk();
		  				chnk.load();
	  					player.teleport(i);
	  					player.sendMessage(ChatColor.YELLOW + "A Squatch appears");
	  				}
	  				else {
	  					player.sendMessage(ChatColor.RED + "You cannot teleport to " + args[0] + " from this world");
	  				}
	  				return true;
	  			case J:
	  				if (player.getWorld().getName().equalsIgnoreCase("Yeticraft")) {
	  					Location j = new Location(player.getWorld(), 1000, 80, 3125);
	  					Chunk chnk = j.getChunk();
		  				chnk.load();
	  					player.teleport(j);
	  					player.sendMessage(ChatColor.YELLOW + "A Squatch appears");
	  				}
	  				else {
	  					player.sendMessage(ChatColor.RED + "You cannot teleport to " + args[0] + " from this world");
	  				}
	  				return true;
	  			case K:
	  				if (player.getWorld().getName().equalsIgnoreCase("Yeticraft")) {
	  					Location k = new Location(player.getWorld(), -1000, 80, 3125);
	  					Chunk chnk = k.getChunk();
		  				chnk.load();
	  					player.teleport(k);
	  					player.sendMessage(ChatColor.YELLOW + "A Squatch appears");
	  				}
	  				else {
	  					player.sendMessage(ChatColor.RED + "You cannot teleport to " + args[0] + " from this world");
	  				}
	  				return true;
	  			case L:
	  				if (player.getWorld().getName().equalsIgnoreCase("Yeticraft")) {
	  					Location l = new Location(player.getWorld(), -3000, 80, 3125);
	  					Chunk chnk = l.getChunk();
		  				chnk.load();
	  					player.teleport(l);
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
	}

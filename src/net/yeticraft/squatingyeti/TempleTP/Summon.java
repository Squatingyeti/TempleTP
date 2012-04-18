package net.yeticraft.squatingyeti.TempleTP;

import net.milkbowl.vault.economy.Economy;

import org.bukkit.ChatColor;
import org.bukkit.Chunk;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Summon implements CommandExecutor {
	private final TempleTP plugin;
	
	public Summon (TempleTP plugin) {
		this.plugin = plugin;
	}
		
	
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		if (!(sender instanceof Player)) {
			sender.sendMessage("Summoning only works within the game");
			return true;
		}
		
		if (args.length == 0) {
			sender.sendMessage(ChatColor.YELLOW + "You did not specify a player to summon");
			return true;
		}
		if (args.length >= 2) {
			sender.sendMessage(ChatColor.YELLOW + "Too many paramaters. Try: /summon [playername]");
			return true;
		}
		Player target = plugin.findOnlinePlayer(args[0]);
		Player player = (Player) sender;
		String playerName = player.getName();
		Location loc = player.getLocation();
		double sCost = 200;
		Economy economy = TempleTP.getEconomy();
		
        Location par = new Location(player.getWorld(), -22, 108, -109);
		Chunk parchnk = par.getChunk();
        Location pra = new Location(player.getWorld(), 2967, 66, -1366);
		Chunk prachnk = pra.getChunk();
        Location jok = new Location(player.getWorld(), 1008, 66, -1373);
		Chunk jokchnk = jok.getChunk();
        Location con = new Location(player.getWorld(), -954, 65, -1382);
		Chunk conchnk = con.getChunk();
        Location baa = new Location(player.getWorld(), -3000, 66, -1383);
		Chunk baachnk = baa.getChunk();
        Location toj = new Location(player.getWorld(), 3034, 66, -3174);
		Chunk tojchnk = toj.getChunk();
        Location cob = new Location(player.getWorld(), 1000, 66, -3124);
		Chunk cobchnk = cob.getChunk();
        Location lux = new Location(player.getWorld(), -1000, 65, -3099);
		Chunk luxchnk = lux.getChunk();
        Location bei = new Location(player.getWorld(), -2991, 69, -3138);
		Chunk beichnk = bei.getChunk();
        Location tik = new Location(player.getWorld(), 3018, 66, 1362);
		Chunk tikchnk = tik.getChunk();
        Location pan = new Location(player.getWorld(), 1000, 70, 1375);
		Chunk panchnk = pan.getChunk();
        Location upp = new Location(player.getWorld(), -1000, 66, 1375);
		Chunk uppchnk = upp.getChunk();
        Location qor = new Location(player.getWorld(), -3001, 71, 1395);
		Chunk qorchnk = qor.getChunk();
        Location cho = new Location(player.getWorld(), 3018, 71, 3094);
		Chunk chochnk = cho.getChunk();
        Location zah = new Location(player.getWorld(), 973, 77, 3131);
		Chunk zahchnk = zah.getChunk();
        Location sev = new Location(player.getWorld(), -957, 68, 3159);
		Chunk sevchnk = sev.getChunk();
        Location srir = new Location(player.getWorld(), -3000, 69, 3125);
		Chunk srichnk = srir.getChunk();

		if (!(player.getLocation().getChunk().equals(parchnk) || player.getLocation().getChunk().equals(prachnk) || player.getLocation().getChunk().equals(jokchnk) || 
			player.getLocation().getChunk().equals(conchnk) || player.getLocation().getChunk().equals(baachnk) || player.getLocation().getChunk().equals(tojchnk) ||
			player.getLocation().getChunk().equals(cobchnk) || player.getLocation().getChunk().equals(luxchnk) || player.getLocation().getChunk().equals(beichnk) ||
			player.getLocation().getChunk().equals(tikchnk) || player.getLocation().getChunk().equals(panchnk) || player.getLocation().getChunk().equals(uppchnk) ||
			player.getLocation().getChunk().equals(qorchnk) || player.getLocation().getChunk().equals(chochnk) || player.getLocation().getChunk().equals(zahchnk) ||
			player.getLocation().getChunk().equals(sevchnk) || player.getLocation().getChunk().equals(srichnk))) {
			player.sendMessage(ChatColor.YELLOW + "You must be at a temple to summon");
			return true;
		}
		if (target == null) {
			player.sendMessage(ChatColor.RED + "No such player is online."); 
			return true;
			}
		

		if (!(target.getLocation().getChunk().equals(parchnk) || target.getLocation().getChunk().equals(prachnk) || target.getLocation().getChunk().equals(jokchnk) || 
				target.getLocation().getChunk().equals(conchnk) || target.getLocation().getChunk().equals(baachnk) || target.getLocation().getChunk().equals(tojchnk) ||
				target.getLocation().getChunk().equals(cobchnk) || target.getLocation().getChunk().equals(luxchnk) || target.getLocation().getChunk().equals(beichnk) ||
				target.getLocation().getChunk().equals(tikchnk) || target.getLocation().getChunk().equals(panchnk) || target.getLocation().getChunk().equals(uppchnk) ||
				target.getLocation().getChunk().equals(qorchnk) || target.getLocation().getChunk().equals(chochnk) || target.getLocation().getChunk().equals(zahchnk) ||
				target.getLocation().getChunk().equals(sevchnk) || target.getLocation().getChunk().equals(srichnk))) {
				player.sendMessage(ChatColor.YELLOW + target.getName() + " must be at another temple in order to be summoned");
				return true;
		}
		
		if (!(TempleTP.getEconomy().getBalance(player.getName()) >= sCost)) {
			player.sendMessage(ChatColor.RED + "You do not have enough TPs to summon" + target.getName());
			return true;
		}
		else {
			player.sendMessage(ChatColor.GRAY + "You assume the mystical squatting yeti position to focus your powers.");
			economy.withdrawPlayer(playerName, sCost);
			target.teleport(loc);
			target.sendMessage(ChatColor.GRAY + "You feel the intense focus of a fellow squatch and appear at their location");
			player.sendMessage(ChatColor.GREEN + "200TPs " + ChatColor.GRAY + "were withdrawn from your account");
			return true;
			}
		}

	}
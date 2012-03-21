package net.yeticraft.squatingyeti.TempleTP;

import net.milkbowl.vault.economy.Economy;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.ChatColor;
import org.bukkit.Chunk;
import org.bukkit.Location;
import ru.tehkode.permissions.PermissionManager;
import ru.tehkode.permissions.PermissionUser;
import ru.tehkode.permissions.bukkit.PermissionsEx;

public class Found implements CommandExecutor {
	public Found(TempleTP plugin) {
	}
	
	enum SubCommand {
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
			sender.sendMessage("Only players can perform this action");
			return true;
		}
		
		Player player = (Player) sender;
		Location loc = player.getLocation();
		double deposit = 100;
		Economy economy = TempleTP.getEconomy();
		PermissionManager pexPlayer = PermissionsEx.getPermissionManager();
		PermissionUser pPlayer = pexPlayer.getUser(player);
		int y = loc.getBlockY();
		
		if (args.length == 0) {
			sender.sendMessage("The great temples tried to hear you, but no names were spoken");
			return true;
		}
		if (args.length >= 2) {
			sender.sendMessage("You can only seek the blessing of 1 temple at a time");
			return true;
		}
		
		switch (SubCommand.toSubCommand(args[0].toUpperCase())) {
			case PARTHENON:
				Location par = new Location(player.getWorld(), -22, 108, -109);
				Chunk parchnk = par.getChunk();
				if(player.hasPermission("temple.parthenon")){
					player.sendMessage(ChatColor.YELLOW + "This temple already knows your scent");
				}
				else if (y > 60 && loc.getChunk().equals(parchnk)) {
					player.sendMessage(ChatColor.GREEN + "Parthenon"  + ChatColor.WHITE + " has learned your scent. " + ChatColor.GREEN + "Return with /tt Parthenon");
					pPlayer.addPermission("temple.parthenon");
					economy.depositPlayer(player.getName(), deposit);
				}
				else {
					player.sendMessage(ChatColor.YELLOW + "Your Squatch call has gone unheard");
				}
				return true;
			case PRAMBANAN:
				Location pra = new Location(player.getWorld(), 2967, 66, -1366);
				Chunk prachnk = pra.getChunk();
				if(player.hasPermission("temple.prambanan")){
					player.sendMessage(ChatColor.YELLOW + "This temple already knows your scent");
				}
					else if (y > 60 && loc.getChunk().equals(prachnk)) {
						player.sendMessage(ChatColor.GREEN + "Prambanan"  + ChatColor.WHITE + " has learned your scent. " + ChatColor.GREEN + "Return with /tt Prambanan");
						pPlayer.addPermission("temple.prambanan");
						economy.depositPlayer(player.getName(), deposit);
						player.sendMessage(ChatColor.GREEN + "100 " + ChatColor.WHITE + "TPs added to your account.");
				}
				else {
					player.sendMessage(ChatColor.YELLOW + "Your Squatch call has gone unheard");
				}
				return true;
			case JOKHANG:
				Location jok = new Location(player.getWorld(), 1008, 66, -1373);
				Chunk jokchnk = jok.getChunk();
				if(player.hasPermission("temple.jokhang")){
					player.sendMessage(ChatColor.YELLOW + "This temple already knows your scent");
				}
				else if (y > 60 && loc.getChunk().equals(jokchnk)) {
					player.sendMessage(ChatColor.GREEN + "Jokhang"  + ChatColor.WHITE + " has learned your scent. " + ChatColor.GREEN + "Return with /tt Jokhang");
					pPlayer.addPermission("temple.jokhang");
				}
				else {
					player.sendMessage(ChatColor.YELLOW + "Your Squatch call has gone unheard");
				}
				return true;
			case CONFUCION:
				Location con = new Location(player.getWorld(), -954, 65, -1382);
				Chunk conchnk = con.getChunk();
				if(player.hasPermission("temple.confucion")){
					player.sendMessage(ChatColor.YELLOW + "This temple already knows your scent");
				}
				else if (y > 60 && loc.getChunk().equals(conchnk)) {
					player.sendMessage(ChatColor.GREEN + "Confucion"  + ChatColor.WHITE + " has learned your scent." + ChatColor.GREEN + " Return with /tt Confucion");
					pPlayer.addPermission("temple.confucion");
				}
				else {
					player.sendMessage(ChatColor.YELLOW + "Your Squatch call has gone unheard");
				}
				return true;
			case BAALBEK:
				Location baa = new Location(player.getWorld(), -3000, 66, -1383);
				Chunk baachnk = baa.getChunk();
				if(player.hasPermission("temple.baalbek")){
					player.sendMessage(ChatColor.YELLOW + "This temple already knows your scent");
				}
				else if (y > 60 && loc.getChunk().equals(baachnk)) {
					player.sendMessage(ChatColor.GREEN + "Baalbek" + ChatColor.WHITE + " has learned your scent." + ChatColor.GREEN + " Return with /tt Baalbek");
					pPlayer.addPermission("temple.baalbek");
				}
				else {
					player.sendMessage(ChatColor.YELLOW + "Your Squatch call has gone unheard");
				}
				return true;
			case TOJI:
				Location toj = new Location(player.getWorld(), 3034, 66, -3174);
				Chunk tojchnk = toj.getChunk();
				if(player.hasPermission("temple.toji")){
					player.sendMessage(ChatColor.YELLOW + "This temple already knows your scent");
				}
				else if (y > 60 && loc.getChunk().equals(tojchnk)) {
					player.sendMessage(ChatColor.GREEN + "Toji" + ChatColor.WHITE + " has learned your scent. " + ChatColor.GREEN + "Return with /tt Toji");
					pPlayer.addPermission("temple.toji");
				}
				else {
					player.sendMessage(ChatColor.YELLOW + "Your Squatch call has gone unheard");
				}
				return true;
			case COBA:
				Location cob = new Location(player.getWorld(), 1000, 66, -3124);
				Chunk cobchnk = cob.getChunk();
				if(player.hasPermission("temple.coba")){
					player.sendMessage(ChatColor.YELLOW + "This temple already knows your scent");
				}
				else if (y > 60 && loc.getChunk().equals(cobchnk)) {
					player.sendMessage(ChatColor.GREEN + "Coba" + ChatColor.WHITE + " has learned your scent. " + ChatColor.GREEN + "Return with /tt Coba");
					pPlayer.addPermission("temple.coba");
				}
				else {
					player.sendMessage(ChatColor.YELLOW + "Your Squatch call has gone unheard");
				}
				return true;
			case LUXOR:
				Location lux = new Location(player.getWorld(), -1000, 65, -3099);
				Chunk luxchnk = lux.getChunk();
				if(player.hasPermission("temple.luxor")){
					player.sendMessage(ChatColor.YELLOW + "This temple already knows your scent");
				}
				else if (y > 60 && loc.getChunk().equals(luxchnk)) {
					player.sendMessage(ChatColor.GREEN + "Luxor" + ChatColor.WHITE + " has learned your scent. " + ChatColor.GREEN + "Return with /tt Luxor");
					pPlayer.addPermission("temple.luxor");
				}
				else {
					player.sendMessage(ChatColor.YELLOW + "Your Squatch call has gone unheard");
				} 
				return true;
			case BEITI:
				Location bei = new Location(player.getWorld(), -2991, 69, -3138);
				Chunk beichnk = bei.getChunk();
				if(player.hasPermission("temple.beiti")){
					player.sendMessage(ChatColor.YELLOW + "This temple already knows your scent");
				}
				else if (y > 60 && loc.getChunk().equals(beichnk)) {
					player.sendMessage(ChatColor.GREEN + "Beiti" + ChatColor.WHITE + " has learned your scent. " + ChatColor.GREEN + "Return with /tt Beiti");
					pPlayer.addPermission("temple.beiti");
				}
				else {
					player.sendMessage(ChatColor.YELLOW + "Your Squatch call has gone unheard");
				}
				return true;
			case TIKAL:
				Location tik = new Location(player.getWorld(), 3018, 66, 1362);
				Chunk tikchnk = tik.getChunk();
				if(player.hasPermission("temple.tikal")){
					player.sendMessage(ChatColor.YELLOW + "This temple already knows your scent");
				}
				else if (y > 60 && loc.getChunk().equals(tikchnk)) {
					player.sendMessage(ChatColor.GREEN + "Tikal" + ChatColor.WHITE + " has learned your scent. " + ChatColor.GREEN + "Return with /tt Tikal");
					pPlayer.addPermission("temple.tikal");
				}
				else {
					player.sendMessage(ChatColor.YELLOW + "Your Squatch call has gone unheard");
				}
				return true;
			case PANTHEON:
				Location pan = new Location(player.getWorld(), 1000, 70, 1375);
				Chunk panchnk = pan.getChunk();
				if(player.hasPermission("temple.pantheon")){
					player.sendMessage(ChatColor.YELLOW + "This temple already knows your scent");
				}
				else if (y > 60 && loc.getChunk().equals(panchnk)) {
					player.sendMessage(ChatColor.GREEN + "Pantheon" + ChatColor.WHITE + " has learned your scent. " + ChatColor.GREEN + "Return with /tt Pantheon");
					pPlayer.addPermission("temple.pantheon");
				}
				else {
					player.sendMessage(ChatColor.YELLOW + "Your Squatch call has gone unheard");
				}
				return true;
			case UPPSALA:
				Location upp = new Location(player.getWorld(), -1000, 66, 1375);
				Chunk uppchnk = upp.getChunk();
				if(player.hasPermission("temple.uppsala")){
					player.sendMessage(ChatColor.YELLOW + "This temple already knows your scent");
				}
				else if (y > 60 && loc.getChunk().equals(uppchnk)) {
					player.sendMessage(ChatColor.GREEN + "Uppsala" + ChatColor.WHITE + " has learned your scent. " + ChatColor.GREEN + "Return with /tt Uppsala");
					pPlayer.addPermission("temple.uppsala");
				}
				else {
					player.sendMessage(ChatColor.YELLOW + "Your Squatch call has gone unheard");
				}
				return true;
			case QORIKANCHA:
				Location qor = new Location(player.getWorld(), -3001, 71, 1395);
				Chunk qorchnk = qor.getChunk();
				if(player.hasPermission("temple.qorikancha")){
					player.sendMessage(ChatColor.YELLOW + "This temple already knows your scent");
				}
				else if (y > 60 && loc.getChunk().equals(qorchnk)) {
					player.sendMessage(ChatColor.GREEN + "Qorikancha" + ChatColor.WHITE + " has learned your scent. " + ChatColor.GREEN + "Return with /tt Qorikancha");
					pPlayer.addPermission("temple.qorikancha");
				}
				else {
					player.sendMessage(ChatColor.YELLOW + "Your Squatch call has gone unheard");
				}
				return true;
			case CHOLULA:
				Location cho = new Location(player.getWorld(), 3018, 71, 3094);
				Chunk chochnk = cho.getChunk();
				if(player.hasPermission("temple.cholula")){
					player.sendMessage(ChatColor.YELLOW + "This temple already knows your scent");
				}
				else if (y > 60 && loc.getChunk().equals(chochnk)) {
					player.sendMessage(ChatColor.GREEN + "Cholula" + ChatColor.WHITE + " has learned your scent. " + ChatColor.GREEN + "Return with /tt Cholula");
					pPlayer.addPermission("temple.cholula");
				}
				else {
					player.sendMessage(ChatColor.YELLOW + "Your Squatch call has gone unheard");
				}
				return true;
			case ZAHIR:
				Location zah = new Location(player.getWorld(), 973, 77, 3131);
				Chunk zahchnk = zah.getChunk();
				if(player.hasPermission("temple.zahir")){
					player.sendMessage(ChatColor.YELLOW + "This temple already knows your scent");
				}
				else if (y > 60 && loc.getChunk().equals(zahchnk)) {
					player.sendMessage(ChatColor.GREEN + "Zahir" + ChatColor.WHITE + " has learned your scent. " + ChatColor.GREEN + "Return with /tt Zahir");
					pPlayer.addPermission("temple.zahir");
				}
				else {
					player.sendMessage(ChatColor.YELLOW + "Your Squatch call has gone unheard");
				}
				return true;
			case SEVILLE:
				Location sev = new Location(player.getWorld(), -957, 68, 3159);
				Chunk sevchnk = sev.getChunk();
				if(player.hasPermission("temple.seville")){
					player.sendMessage(ChatColor.YELLOW + "This temple already knows your scent");
				}
				else if (y > 60 && loc.getChunk().equals(sevchnk)) {
					player.sendMessage(ChatColor.GREEN + "Seville" + ChatColor.WHITE + " has learned your scent. " + ChatColor.GREEN + "Return with /tt Seville");
					pPlayer.addPermission("temple.seville");
				}
				else {
					player.sendMessage(ChatColor.YELLOW + "Your Squatch call has gone unheard");
				}
				return true;
			case SRIRANGAN:
				Location srir = new Location(player.getWorld(), -3000, 69, 3125);
				Chunk srichnk = srir.getChunk();
				if(player.hasPermission("temple.srirangan")){
					player.sendMessage(ChatColor.YELLOW + "This temple already knows your scent");
				}
				else if (y > 60 && loc.getChunk().equals(srichnk)) {
					player.sendMessage(ChatColor.GREEN + "Srirangan" + ChatColor.WHITE + " has learned your scent. " + ChatColor.GREEN + "Return with /tt Srirangan");
					pPlayer.addPermission("temple.srirangan");
				}
				else {
					player.sendMessage(ChatColor.YELLOW + "Your Squatch call has gone unheard");
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
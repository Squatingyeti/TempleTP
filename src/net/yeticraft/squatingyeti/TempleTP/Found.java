package net.yeticraft.squatingyeti.TempleTP;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.Chunk;
import org.bukkit.Location;
import ru.tehkode.permissions.PermissionManager;
import ru.tehkode.permissions.PermissionUser;
import ru.tehkode.permissions.bukkit.PermissionsEx;

public class Found implements CommandExecutor {
	public Found(TempleTP plugin) {
	}
	
	enum SubCommand {
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
			sender.sendMessage("Only players can perform this action");
			return true;
		}
		
		Player player = (Player) sender;
		Location loc = player.getLocation();
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
			case TIKAL:
				Location tik = new Location(player.getWorld(), -22, 67, -109);
				Chunk tikchnk = tik.getChunk();
				if(player.hasPermission("temple.tikal")){
					player.sendMessage("This temple already knows your scent");
				}
				else if (y > 60 && loc.getChunk().equals(tikchnk)) {
					player.sendMessage("Tikal has learned your scent. Return with /tt tikal");
					pPlayer.addPermission("temple.tikal");
				}
				else {
					player.sendMessage("Your Squatch call has gone unheard");
				}
				return true;
			case PRAMBANAN:
				Location pra = new Location(player.getWorld(), 3000, 67, -1375);
				Chunk prachnk = pra.getChunk();
				if(player.hasPermission("temple.prambanan")){
					player.sendMessage("This temple already knows your scent");
				}
					else if (y > 60 && loc.getChunk().equals(prachnk)) {
						player.sendMessage("Prambanan has learned your scent. Return with /tt Prambanan");
						pPlayer.addPermission("temple.prambanan");
				}
				else {
					player.sendMessage("Your Squatch call has gone unheard");
				}
				return true;
			case JOKHANG:
				Location jok = new Location(player.getWorld(), 1000, 67, -1375);
				Chunk jokchnk = jok.getChunk();
				if(player.hasPermission("temple.jokhang")){
					player.sendMessage("This temple already knows your scent");
				}
				else if (y > 60 && loc.getChunk().equals(jokchnk)) {
					player.sendMessage("Jokhang has learned your scent. Return with /tt Jokhang");
					pPlayer.addPermission("temple.jokhang");
				}
				else {
					player.sendMessage("Your Squatch call has gone unheard");
				}
				return true;
			case CONFUCION:
				Location con = new Location(player.getWorld(), -1000, 80, -1375);
				Chunk conchnk = con.getChunk();
				if(player.hasPermission("temple.confucion")){
					player.sendMessage("This temple already knows your scent");
				}
				else if (y > 60 && loc.getChunk().equals(conchnk)) {
					player.sendMessage("Confucion has learned your scent. Return with /tt Confucion");
					pPlayer.addPermission("temple.confucion");
				}
				else {
					player.sendMessage("Your Squatch call has gone unheard");
				}
				return true;
			case BAALBEK:
				Location baa = new Location(player.getWorld(), -3000, 80, -1375);
				Chunk baachnk = baa.getChunk();
				if(player.hasPermission("temple.baalbek")){
					player.sendMessage("This temple already knows your scent");
				}
				else if (y > 60 && loc.getChunk().equals(baachnk)) {
					player.sendMessage("Baalbek has learned your scent. Return with /tt Baalbek");
					pPlayer.addPermission("temple.baalbek");
				}
				else {
					player.sendMessage("Your Squatch call has gone unheard");
				}
				return true;
			case TOJI:
				Location toj = new Location(player.getWorld(), 3000, 80, -3125);
				Chunk tojchnk = toj.getChunk();
				if(player.hasPermission("temple.toji")){
					player.sendMessage("This temple already knows your scent");
				}
				else if (y > 60 && loc.getChunk().equals(tojchnk)) {
					player.sendMessage("Toji has learned your scent. Return with /tt Toji");
					pPlayer.addPermission("temple.toji");
				}
				else {
					player.sendMessage("Your Squatch call has gone unheard");
				}
				return true;
			case COBA:
				Location cob = new Location(player.getWorld(), 1000, 80, -3125);
				Chunk cobchnk = cob.getChunk();
				if(player.hasPermission("temple.coba")){
					player.sendMessage("This temple already knows your scent");
				}
				else if (y > 60 && loc.getChunk().equals(cobchnk)) {
					player.sendMessage("Coba has learned your scent. Return with /tt Coba");
					pPlayer.addPermission("temple.coba");
				}
				else {
					player.sendMessage("Your Squatch call has gone unheard");
				}
				return true;
			case LUXOR:
				Location lux = new Location(player.getWorld(), -1000, 80, -3125);
				Chunk luxchnk = lux.getChunk();
				if(player.hasPermission("temple.luxor")){
					player.sendMessage("This temple already knows your scent");
				}
				else if (y > 60 && loc.getChunk().equals(luxchnk)) {
					player.sendMessage("Luxor has learned your scent. Return with /tt Luxor");
					pPlayer.addPermission("temple.luxor");
				}
				else {
					player.sendMessage("Your Squatch call has gone unheard");
				}
				return true;
			case BEITI:
				Location bei = new Location(player.getWorld(), -3000, 80, -3125);
				Chunk beichnk = bei.getChunk();
				if(player.hasPermission("temple.beiti")){
					player.sendMessage("This temple already knows your scent");
				}
				else if (y > 60 && loc.getChunk().equals(beichnk)) {
					player.sendMessage("Beiti has learned your scent. Return with /tt Beiti");
					pPlayer.addPermission("temple.beiti");
				}
				else {
					player.sendMessage("Your Squatch call has gone unheard");
				}
				return true;
			case PARTHENON:
				Location par = new Location(player.getWorld(), 3000, 80, 1375);
				Chunk parchnk = par.getChunk();
				if(player.hasPermission("temple.parthenon")){
					player.sendMessage("This temple already knows your scent");
				}
				else if (y > 60 && loc.getChunk().equals(parchnk)) {
					player.sendMessage("Parthenon has learned your scent. Return with /tt Parthenon");
					pPlayer.addPermission("temple.parthenon");
				}
				else {
					player.sendMessage("Your Squatch call has gone unheard");
				}
				return true;
			case PANTHEON:
				Location pan = new Location(player.getWorld(), 1000, 80, 1375);
				Chunk panchnk = pan.getChunk();
				if(player.hasPermission("temple.pantheon")){
					player.sendMessage("This temple already knows your scent");
				}
				else if (y > 60 && loc.getChunk().equals(panchnk)) {
					player.sendMessage("Pantheon has learned your scent. Return with /tt Pantheon");
					pPlayer.addPermission("temple.pantheon");
				}
				else {
					player.sendMessage("Your Squatch call has gone unheard");
				}
				return true;
			case UPPSALA:
				Location upp = new Location(player.getWorld(), -1000, 80, 1375);
				Chunk uppchnk = upp.getChunk();
				if(player.hasPermission("temple.uppsala")){
					player.sendMessage("This temple already knows your scent");
				}
				else if (y > 60 && loc.getChunk().equals(uppchnk)) {
					player.sendMessage("Uppsala has learned your scent. Return with /tt Uppsala");
					pPlayer.addPermission("temple.uppsala");
				}
				else {
					player.sendMessage("Your Squatch call has gone unheard");
				}
				return true;
			case QORIKANCHA:
				Location qor = new Location(player.getWorld(), -3000, 80, 1375);
				Chunk qorchnk = qor.getChunk();
				if(player.hasPermission("temple.qorikancha")){
					player.sendMessage("This temple already knows your scent");
				}
				else if (y > 60 && loc.getChunk().equals(qorchnk)) {
					player.sendMessage("Qorikancha has learned your scent. Return with /tt Qorikancha");
					pPlayer.addPermission("temple.qorikancha");
				}
				else {
					player.sendMessage("Your Squatch call has gone unheard");
				}
				return true;
			case CHOLULA:
				Location cho = new Location(player.getWorld(), 3000, 80, 3125);
				Chunk chochnk = cho.getChunk();
				if(player.hasPermission("temple.cholula")){
					player.sendMessage("This temple already knows your scent");
				}
				else if (y > 60 && loc.getChunk().equals(chochnk)) {
					player.sendMessage("Cholula has learned your scent. Return with /tt Cholula");
					pPlayer.addPermission("temple.cholula");
				}
				else {
					player.sendMessage("Your Squatch call has gone unheard");
				}
				return true;
			case ZAHIR:
				Location zah = new Location(player.getWorld(), 1000, 80, 3125);
				Chunk zahchnk = zah.getChunk();
				if(player.hasPermission("temple.zahir")){
					player.sendMessage("This temple already knows your scent");
				}
				else if (y > 60 && loc.getChunk().equals(zahchnk)) {
					player.sendMessage("Zahir has learned your scent. Return with /tt Zahir");
					pPlayer.addPermission("temple.zahir");
				}
				else {
					player.sendMessage("Your Squatch call has gone unheard");
				}
				return true;
			case SEVILLE:
				Location sev = new Location(player.getWorld(), -1000, 80, 3125);
				Chunk sevchnk = sev.getChunk();
				if(player.hasPermission("temple.seville")){
					player.sendMessage("This temple already knows your scent");
				}
				else if (y > 60 && loc.getChunk().equals(sevchnk)) {
					player.sendMessage("Seville has learned your scent. Return with /tt Seville");
					pPlayer.addPermission("temple.seville");
				}
				else {
					player.sendMessage("Your Squatch call has gone unheard");
				}
				return true;
			case SRIRANGAN:
				Location srir = new Location(player.getWorld(), -3000, 80, 3125);
				Chunk srichnk = srir.getChunk();
				if(player.hasPermission("temple.srirangan")){
					player.sendMessage("This temple already knows your scent");
				}
				else if (y > 60 && loc.getChunk().equals(srichnk)) {
					player.sendMessage("Srirangan has learned your scent. Return with /tt Srirangan");
					pPlayer.addPermission("temple.srirangan");
				}
				else {
					player.sendMessage("Your Squatch call has gone unheard");
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
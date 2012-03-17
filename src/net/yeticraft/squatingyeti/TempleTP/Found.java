package net.yeticraft.squatingyeti.TempleTP;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.Location;
import ru.tehkode.permissions.PermissionManager;
import ru.tehkode.permissions.PermissionUser;
import ru.tehkode.permissions.bukkit.PermissionsEx;

public class Found implements CommandExecutor {
	public Found(TempleTP plugin) {
	}
	
	enum SubCommand {
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
			sender.sendMessage("Only players can perform this action");
			return true;
		}
		
		Player player = (Player) sender;
		Location loc = player.getLocation();
		PermissionManager pexPlayer = PermissionsEx.getPermissionManager();
		PermissionUser pPlayer = pexPlayer.getUser(player);
		int x = loc.getBlockX();
		int y = loc.getBlockY();
		int z = loc.getBlockZ();
		
		if (args.length == 0) {
			sender.sendMessage("The great temples tried to hear you, but no names were spoken");
			return true;
		}
		if (args.length > 2) {
			sender.sendMessage("You can only seek the blessing of 1 temple at a time");
			return true;
		}
		
		switch (SubCommand.toSubCommand(args[0].toUpperCase())) {
			case TIKAL:
				if(player.hasPermission("temple.tikal")){
					player.sendMessage("This temple already knows your scent");
				}
				else if (x > -32 && x < -5 && y > 60 && z < -95 && z > -120) {
					player.sendMessage("Tikal has learned your scent. Return with /tt tikal");
					pPlayer.addPermission("temple.tikal");
				}
				else {
					player.sendMessage("Your Squatch call has gone unheard");
				}
				return true;
			case NEXT:
				if(player.hasPermission("temple.next")){
					player.sendMessage("This temple already knows your scent");
				}
					else if (x > 2090 && x < 3015 && y > 60 && z > -1385 && z < -1365) {
						player.sendMessage("Next has learned your scent. Return with /tt next");
						pPlayer.addPermission("temple.next");
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
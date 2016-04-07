package ivans.learningyoutube;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Goodbye implements CommandExecutor{
	
	public boolean onCommand(CommandSender sender, Command cmd, String commandLable, String[] arg3) {
		Player player = (Player) sender;
		if(commandLable.equalsIgnoreCase("byebye")){		
			player.sendMessage(ChatColor.LIGHT_PURPLE+"88888");
			Location l = new Location(player.getWorld(),0,500,0);
			player.teleport(l);
		}		
	
		return false;
	}
}

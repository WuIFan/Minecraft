package ivans.learningyoutube;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Hello implements CommandExecutor{
	String[] ans={"���o!","�A�n��!�Ȧ��!","�T�T","�ڤ��Q��A����...","...","�M�ߪ��C���n��?","OwO",ChatColor.RED + "�p�ߧA�᭱!!!"};

	public boolean onCommand(CommandSender sender, Command cmd, String commandLable, String[] arg3) {
		Player player = (Player) sender;
		if(commandLable.equalsIgnoreCase("Hello")){
			int rad=(int)(Math.random()*8);
			player.sendMessage(ans[rad]);
		}		
	
		return false;
	}

}

package ivans.learningyoutube;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Hello implements CommandExecutor{
	String[] ans={"哈囉!","你好啊!旅行者!","掰掰","我不想跟你說話...","...","專心玩遊戲好嗎?","OwO",ChatColor.RED + "小心你後面!!!"};

	public boolean onCommand(CommandSender sender, Command cmd, String commandLable, String[] arg3) {
		Player player = (Player) sender;
		if(commandLable.equalsIgnoreCase("Hello")){
			int rad=(int)(Math.random()*8);
			player.sendMessage(ans[rad]);
		}		
	
		return false;
	}

}

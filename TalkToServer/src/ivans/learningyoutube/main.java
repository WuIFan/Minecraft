package ivans.learningyoutube;

import java.util.logging.Logger;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;

public class main extends JavaPlugin{
	String[] ans={"哈囉!","你好啊!旅行者!","掰掰","我不想跟你說話...","...","專心玩遊戲好嗎?","OwO",ChatColor.RED + "小心你後面!!!"};
		
	
	
	public final Logger logger=Logger.getLogger("Minecraft");
	public static main plugin;
	
	public void  onDisable(){
		PluginDescriptionFile pdfFile=this.getDescription();
		this.logger.info(pdfFile.getName()+" Has been disable!");
	}
	public void  onEnable(){
		PluginDescriptionFile pdfFile=this.getDescription();
		this.logger.info(pdfFile.getName()+" Version "+ pdfFile.getVersion() +" Has been Enable!");
	}
	public boolean onCommand(CommandSender sender,Command cmd,String commandLable,String[] args){
		Player player = (Player) sender;
		if(commandLable.equalsIgnoreCase("Hello")){
			int rad=(int)(Math.random()*8);
			player.sendMessage(ans[rad]);
		}
		return false;
	}
	
}

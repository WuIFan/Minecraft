package ivans.learningyoutube;

import java.util.logging.Logger;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;

public class main extends JavaPlugin{
	String[] ans={"���o!","�A�n��!�Ȧ��!","�T�T","�ڤ��Q��A����...","...","�M�ߪ��C���n��?","OwO",ChatColor.RED + "�p�ߧA�᭱!!!"};
		
	
	
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

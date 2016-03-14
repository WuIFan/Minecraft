package ivans.tp;

import java.util.logging.Logger;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;


public class TpPlugin extends JavaPlugin{
	public final Logger logger=Logger.getLogger("Minecraft");
	public static TpPlugin plugin;
	
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
		if(commandLable.equalsIgnoreCase("fly")){
			if(args.length==0){
				player.sendMessage(ChatColor.DARK_RED + "�t�x�����F��");
			}
			else if(args.length==1){
				Player targetPlayer = player.getServer().getPlayer(args[0]); 
				Location targetPlayerLocation = targetPlayer.getLocation();
				player.teleport(targetPlayerLocation);
			}
			else if(args.length==2){
				Player targetPlayer = player.getServer().getPlayer(args[0]);
				Player targetPlayer1 = player.getServer().getPlayer(args[1]);				
				Location targetPlayer1Location = targetPlayer1.getLocation();
				targetPlayer.teleport(targetPlayer1Location);
			}
		}		
		
		return false;
	}
	
	
	

}

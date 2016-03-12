package ivans.heal;

import java.util.logging.Logger;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;


public class Heal extends JavaPlugin{
	public final Logger logger=Logger.getLogger("Minecraft");
	public static Heal plugin;
	
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
		if(commandLable.equalsIgnoreCase("heal")){
			if(args.length==0){
				player.setHealth(20);
				player.setFireTicks(0);			
				player.sendMessage(ChatColor.GREEN + "干干!");
			}
			else if(args.length==1){
				if(player.getServer().getPlayer(args[0])!=null){
					Player targetPlayer = player.getServer().getPlayer(args[0]);
					targetPlayer.setHealth(20);
					targetPlayer.setFireTicks(0);
					player.sendMessage(ChatColor.GREEN + "干干!");
				}
			}
			else{
				player.sendMessage(ChatColor.RED + "干ぃQQ");
			}
			
			
		}
		return false;
	}
	
}

package ivans.learningyoutube;

import java.util.logging.Logger;

import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;

public class main extends JavaPlugin{		
	
	
	public final Logger logger=Logger.getLogger("Minecraft");
	public static main plugin;
	
	public void  onDisable(){
		PluginDescriptionFile pdfFile=this.getDescription();
		this.logger.info("<"+pdfFile.getName()+">"+" Has been disable!");
	}
	public void  onEnable(){
		PluginDescriptionFile pdfFile=this.getDescription();
		this.logger.info("<"+pdfFile.getName()+">"+" Version "+ pdfFile.getVersion() +" Has been Enable!");
		
		getCommand("Hello").setExecutor(new Hello());
		getCommand("byebye").setExecutor(new Goodbye());
	}
	
	
}


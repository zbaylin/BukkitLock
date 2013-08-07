package io.github.zaboon.bookLoadout;

import java.util.logging.Logger;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin
{
	public final Logger logger = Logger.getLogger("Minecraft");
	public static Main plugin;
	public static IconMenu menu;
	@Override
	public void onDisable() {
		PluginDescriptionFile pdfFile = this.getDescription() ;
		this.logger.info( pdfFile.getName() + " has been disabled!" ) ;
	}
	
	@Override
	public void onEnable() {
		PluginDescriptionFile pdfFile = this.getDescription() ;
		this.logger.info( pdfFile.getName() + pdfFile.getVersion() +" has been enabled!" ) ;
		
	}
	
	public boolean onCommand ( CommandSender sender, Command cmd, String commandLabel, String[] args){
		Player player = (Player) sender;
		if ( commandLabel.equalsIgnoreCase("cif")){
			if( player.getAllowFlight() == true){
				player.sendMessage("You can FLY!!!") ;
			}
			else
			{
				player.sendMessage("You cant fly!") ;
			}
		}
		return true;
	}
}

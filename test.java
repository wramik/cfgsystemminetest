package wramik.redir1;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;


public class Main extends JavaPlugin {
	@Override
	public void onEnable()
		this.saveDefaultConfig();
		Config mmo = new Config(this);
		mmo.reload();
			getServer().getPluginManager().registerEvents(new PlayerJoinListener()	
	}
	@Override
	public void onDisable() {
	}
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label,  String[] args) {
		if (cmd.getName().equalsIgnoreCase("mmolbby")) { 
			if (sender.hasPermission("operator.test")) {
				if (args.length < 1)
					
					return true;
				}
			
				if (args[0].equalsIgnoreCase("reload")) {
		
					Config mmo = new Config(this);
					mmo.reload();
					sender.sendMessage(ChatColor.GREEN + "зашел??????");
					return true;
				}
				if (args.length > 1) {
				
					sender.sendMessage(ChatColor.RED + "?");
					return false;
				}
			}	
		}
		return false;
	}
}

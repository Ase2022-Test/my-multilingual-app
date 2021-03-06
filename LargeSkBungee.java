package pl.pickaxe.largesk;

import net.md_5.bungee.api.ChatColor;
import net.md_5.bungee.api.ProxyServer;
import net.md_5.bungee.api.plugin.Plugin;
import pl.pickaxe.largesk.util.Xlog;

public class LargeSkBungee extends Plugin
{

	public static Plugin getPlugin()
	{
		return ProxyServer.getInstance().getPluginManager().getPlugin("LargeSk");
	}

	@Override
	public void onEnable()
	{
		//Enabling timer
		long eTime = System.currentTimeMillis();
		Xlog.logBungeeInfo(ChatColor.YELLOW  + "=== ENABLE " + ChatColor.GREEN + "START" + ChatColor.YELLOW + " ===");
		
		Xlog.logBungeeInfo("Just a test");
		
		//Announcing how much time enabling took
		eTime = System.currentTimeMillis() - eTime;
		Xlog.logInfo(ChatColor.YELLOW  + "=== ENABLE " + ChatColor.GREEN + "COMPLETE" + ChatColor.YELLOW + " (Took " + ChatColor.LIGHT_PURPLE + eTime + "ms" + ChatColor.YELLOW + ") ===");
				
	}
	
	@Override
	public void onDisable()
	{
		Xlog.logBungeeInfo("Disabling plugin");
	}
}

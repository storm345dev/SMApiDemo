package org.stormdev.SMApiDemo.main;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;
import org.stormdev.SMApiDemo.commands.CustomEvent;
import org.stormdev.SMApiDemo.listeners.DummyEventListener;
import org.stormdev.servermanager.api.APIProvider;
import org.stormdev.servermanager.api.ServerManagerAPI;

public class SMApiDemo extends JavaPlugin {
	
	public static SMApiDemo plugin;
	public static ServerManagerAPI api;
	
	@Override
	public void onEnable(){
		plugin = this;
		
		getLogger().info("Starting SMApiDemo..");
		
		//Start how to safely use this as a dependency!
		
		if(Bukkit.getPluginManager().getPlugin("ServerManager") == null){
			getLogger().info("Sorry this plugin requires ServerManager!");
			return;
		}
		
		try {
			Class.forName("org.stormdev.servermanager.api.APIProvider");
		} catch (ClassNotFoundException e) {
			getLogger().info("Sorry this plugin requires ServerManager with the API!");
			return;
		}
		
		api = APIProvider.getAPI();
		if(api == null){
			getLogger().info("Sorry this plugin requires ServerManager with the API!");
			return;
		}
		
		//End how to safely use this as a dependency
		
		getLogger().info("Acting API version: "+api.getAPIVersion()); //The version of the API can be retrieved to check compatibility
		getLogger().info("API provider: "+api.getProvider().name()); //EIther HOST or CORE
		
		api.getEventManager().registerListener(new DummyEventListener()); //Register our custom event listener
		
		getCommand("customevent").setExecutor(new CustomEvent()); //Register the command to show custom event usage
		
		getLogger().info("SMApiDemo started!");
	}
	
	@Override
	public void onDisable(){
		getLogger().info("SMApiDemo stopped!");
	}
	
	
}

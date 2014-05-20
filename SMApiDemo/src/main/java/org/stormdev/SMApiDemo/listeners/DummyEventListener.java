package org.stormdev.SMApiDemo.listeners;

import org.bukkit.Bukkit;
import org.stormdev.SMApiDemo.events.DummyEvent;
import org.stormdev.servermanager.api.listeners.SMEventHandler;
import org.stormdev.servermanager.api.listeners.SMListener;

public class DummyEventListener implements SMListener {
	
	@SMEventHandler(priority=SMEventHandler.Priority.LOWEST)
	public void onDummyEvent(DummyEvent event){
		Bukkit.broadcastMessage("Dummy event listener priority Lowest #1 - Called first");
	}
	
	@SMEventHandler(priority=SMEventHandler.Priority.HIGHEST)
	public void onDummyEvent2(DummyEvent event){
		Bukkit.broadcastMessage("Dummy event listener priority Highest #2 - Called second");
	}
}

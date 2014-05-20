package org.stormdev.SMApiDemo.listeners;

import org.bukkit.Bukkit;
import org.stormdev.SMApiDemo.events.DummyEvent;
import org.stormdev.servermanager.api.listeners.SMEventHandler;
import org.stormdev.servermanager.api.listeners.SMListener;

public class DummyEventListener implements SMListener {
	
	@SMEventHandler(priority=SMEventHandler.Priority.LOWEST) //Priority isn't necessary but lets you decide when your event handler will be called
	public void onDummyEvent(DummyEvent event){
		Bukkit.broadcastMessage("Dummy event listener priority Lowest #1 - Called first");
	}
	
	@SMEventHandler(priority=SMEventHandler.Priority.HIGHEST) //This one uses a HIGHER priority and is called AFTER the lower priority (So it overrides it if event cancelled, etc)
	public void onDummyEvent2(DummyEvent event){
		Bukkit.broadcastMessage("Dummy event listener priority Highest #2 - Called second");
	}
}

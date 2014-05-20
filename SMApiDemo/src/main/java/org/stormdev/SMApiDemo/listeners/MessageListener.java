package org.stormdev.SMApiDemo.listeners;

import org.bukkit.Bukkit;
import org.stormdev.servermanager.api.events.MessageReceiveEvent;
import org.stormdev.servermanager.api.events.ReceivedMessage;
import org.stormdev.servermanager.api.listeners.SMEventHandler;
import org.stormdev.servermanager.api.listeners.SMListener;

public class MessageListener implements SMListener {
	@SMEventHandler
	public void onReceive(MessageReceiveEvent event){
		ReceivedMessage rm = event.getMessage();
		Bukkit.broadcastMessage("Received message: "+rm.getTitle()+":"+rm.getMessage());
	}
}

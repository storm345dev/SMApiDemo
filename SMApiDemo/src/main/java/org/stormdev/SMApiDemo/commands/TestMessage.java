package org.stormdev.SMApiDemo.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.stormdev.SMApiDemo.main.SMApiDemo;
import org.stormdev.servermanager.api.messaging.MessageRecipient;

/*
 * A simple command executor for /testmessage to demo the custom events
 * 
 */
public class TestMessage implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command arg1, String arg2,
			String[] arg3) {
		sender.sendMessage("Sending message...");
		try {
			SMApiDemo.api.getMessenger().sendMessage(MessageRecipient.create(SMApiDemo.api.getOwnConnectionID()), "testMsg", "Testing messaging..");
		} catch (Exception e) {
			sender.sendMessage("Message send failed: "+e.getMessage());
		}
		
		return true;
	}

}

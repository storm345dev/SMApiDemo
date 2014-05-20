package org.stormdev.SMApiDemo.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.stormdev.SMApiDemo.events.DummyEvent;
import org.stormdev.SMApiDemo.main.SMApiDemo;

public class CustomEvent implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender arg0, Command arg1, String arg2,
			String[] arg3) {
		SMApiDemo.api.getEventManager().callEvent(new DummyEvent());
		return true;
	}

}

package org.stormdev.SMApiDemo.events;

import org.stormdev.servermanager.api.listeners.SMEvent;

public class DummyEvent implements SMEvent {

	@Override
	public String getEventName() {
		return "Dummy Event";
	}

	@Override
	public Class<? extends SMEvent> getEventClass() {
		return DummyEvent.class;
	}

}

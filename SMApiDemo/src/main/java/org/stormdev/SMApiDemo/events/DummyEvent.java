package org.stormdev.SMApiDemo.events;

import org.stormdev.servermanager.api.listeners.SMEvent;

/*
 * A dummy event which doesn't DO anything other than show how easy custom events are
 * 
 * 
 */
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

package com.Event.EventClean.core.gateway;

import com.Event.EventClean.core.entities.Event;

import java.util.List;

public interface EventGateway {
    Event createEvent(Event event);
    List<Event> searchEvents();


}

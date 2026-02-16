package com.Event.EventClean.core.gateway;

import com.Event.EventClean.core.entities.Event;
import java.util.List;
import java.util.Optional;

public interface EventGateway {

    Optional<Event> filterById(String identityEvent);
    Event createEvent(Event event);
    List<Event> searchEvents();

}

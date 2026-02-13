package com.Event.EventClean.core.useCases;

import com.Event.EventClean.core.entities.Event;

public interface NewEventCase {
    public Event execute(Event event);
}

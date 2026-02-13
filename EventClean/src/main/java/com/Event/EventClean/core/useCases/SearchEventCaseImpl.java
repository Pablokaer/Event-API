package com.Event.EventClean.core.useCases;

import com.Event.EventClean.core.entities.Event;
import com.Event.EventClean.core.gateway.EventGateway;

import java.util.List;

public class SearchEventCaseImpl implements SearchEventCase {

    private final EventGateway eventGateway;

    public SearchEventCaseImpl(EventGateway eventGateway) {
        this.eventGateway = eventGateway;
    }

    @Override
    public List<Event> execute() {
        return eventGateway.searchEvents();
    }
}

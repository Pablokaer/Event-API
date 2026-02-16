package com.Event.EventClean.core.useCases;

import com.Event.EventClean.core.entities.Event;
import com.Event.EventClean.core.gateway.EventGateway;
import com.Event.EventClean.infra.exceptions.NotFoundEventException;
import com.Event.EventClean.infra.persistency.EventEntity;

import java.util.List;

public class FilterIdCaseImpl implements FilterIdCase{

    private final EventGateway eventGateway;

    public FilterIdCaseImpl(EventGateway eventGateway) {
        this.eventGateway = eventGateway;
    }

    @Override
    public Event execute(String identityEvent) {
        return eventGateway.filterById(identityEvent).orElseThrow(()-> new NotFoundEventException("Event with ID: "+ identityEvent + " nao encontrado"));
    }
}

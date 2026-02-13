package com.Event.EventClean.core.useCases;

import com.Event.EventClean.core.entities.Event;
import com.Event.EventClean.infra.dtos.EventDto;

import java.util.List;

public interface SearchEventCase {
    public List<Event> execute();

}

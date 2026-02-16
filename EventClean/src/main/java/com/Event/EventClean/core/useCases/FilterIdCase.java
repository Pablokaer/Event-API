package com.Event.EventClean.core.useCases;

import com.Event.EventClean.core.entities.Event;
import java.util.List;

public interface FilterIdCase {
    public Event execute(String identityEvent);

}

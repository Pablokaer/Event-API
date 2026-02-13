package com.Event.EventClean.infra.beans;

import com.Event.EventClean.core.gateway.EventGateway;
import com.Event.EventClean.core.useCases.NewEventCase;
import com.Event.EventClean.core.useCases.NewEventCaseImpl;
import com.Event.EventClean.core.useCases.SearchEventCase;
import com.Event.EventClean.core.useCases.SearchEventCaseImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {

    @Bean
    public NewEventCase newEventCase(EventGateway eventGateway){
        return new NewEventCaseImpl(eventGateway);
    }

    @Bean
   public SearchEventCase searchEventCase(EventGateway eventGateway){
        return new SearchEventCaseImpl(eventGateway);
    }
}

package com.Event.EventClean.infra.beans;

import com.Event.EventClean.core.gateway.EventGateway;
import com.Event.EventClean.core.useCases.*;
import com.Event.EventClean.infra.gateway.EventRepositoryGateway;
import com.Event.EventClean.infra.persistency.EventEntity;
import com.Event.EventClean.infra.persistency.EventRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

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

    @Bean
    public FilterIdCase filterIdCase(EventGateway eventGateway) { return new FilterIdCaseImpl(eventGateway);}

}

package org.example.skb.service;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.example.skb.entity.Worker;

@Log4j2
@Service
public class ServiceWithFieldInjection {
    @Autowired
    private Worker builder;

    @Autowired
    private Worker developer;

    @PostConstruct
    public void init(){
        log.info("ServiceWithFieldInjection is working");
    }

    @PreDestroy
    public void destroy(){
        log.info("ServiceWithFieldInjection is destroying");
    }

    public void workWorkers(){
        builder.works();
        developer.works();
    }

    public void restWorker(){
        builder.rest();
        developer.rest();
    }
}

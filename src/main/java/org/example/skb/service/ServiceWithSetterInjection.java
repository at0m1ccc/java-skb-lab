package org.example.skb.service;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.example.skb.entity.Worker;

@Log4j2
@Service
public class ServiceWithSetterInjection {
    private Worker builder;
    private Worker developer;

    @Autowired
    private void setBuilder(Worker builder) {
        this.builder = builder;
    }

    @Autowired
    private void setDeveloper(Worker developer){
        this.developer = developer;
    }

    @PostConstruct
    private void init(){
        log.info("ServiceWithSetterInjection is working");
    }

    @PreDestroy
    private void destroy(){
        log.info("ServiceWithSetterInjection is destroying");
    }

    public void worksWorker(){
        builder.works();
        developer.works();
    }

    public void restWorker(){
        builder.rest();
        developer.rest();
    }
}

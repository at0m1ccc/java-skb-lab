package org.example.skb.service;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;
import org.example.skb.entity.Worker;

@Log4j2
@Service
@RequiredArgsConstructor
public class ServiceWithConstructorInjection {
    private final Worker builder;
    private final Worker developer;

    @PostConstruct
    private void init(){
        log.info("ServiceWithConstructorInjection is working");
    }

    @PreDestroy
    private void destroy(){
        log.info("ServiceWithConstructorInjection is destroying");
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

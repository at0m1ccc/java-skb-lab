package org.example.skb.entity;

import org.springframework.stereotype.Component;

@Component
public class Developer implements Worker {

    @Override
    public void works(){
        System.out.println("The developer starts writing code");
    }

    @Override
    public void rest(){
        System.out.println("The developer went to drink coffee");
    }
}

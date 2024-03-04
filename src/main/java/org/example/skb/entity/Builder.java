package org.example.skb.entity;

import org.springframework.stereotype.Component;

@Component
public class Builder implements Worker{

    @Override
    public void works(){
        System.out.println("The builder went to build a house");
    }

    @Override
    public void rest(){
        System.out.println("The builder went to lunch");
    }
}

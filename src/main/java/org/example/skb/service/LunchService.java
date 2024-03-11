package org.example.skb.service;


import org.example.skb.entity.dto.AdditionalInfoLunchResponse;
import org.example.skb.entity.dto.LunchRequest;
import org.example.skb.entity.dto.LunchResponse;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class LunchService {
    private final ArrayList<LunchResponse> lunches = new ArrayList<>();

    public LunchResponse addNewLunch(LunchRequest newLunch){
        lunches.add(new LunchResponse(newLunch.price(),
                new AdditionalInfoLunchResponse(lunches.size(), newLunch.info().date())));
        return lunches.getLast();
    }
}

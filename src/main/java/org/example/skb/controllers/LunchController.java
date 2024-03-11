package org.example.skb.controllers;

import org.example.skb.service.LunchService;
import org.springframework.web.bind.annotation.*;
import org.example.skb.entity.dto.LunchRequest;
import org.example.skb.entity.dto.LunchResponse;


@RestController
@RequestMapping("/lunch")
public class LunchController {
    LunchService lunchService;
    @GetMapping
    public LunchResponse getLunch(@RequestBody LunchRequest lunchRequest){
        return lunchService.addNewLunch(lunchRequest);
    }
}

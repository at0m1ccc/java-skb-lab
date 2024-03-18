package org.example.skb.controllers;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.example.skb.entity.dto.LunchRequest;
import org.example.skb.entity.dto.LunchResponse;
import org.example.skb.service.LunchService;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@RestController
@RequestMapping("/lunch")
public class LunchController {
    LunchService lunchService;

    @PostMapping
    public LunchResponse getLunch(@RequestBody LunchRequest lunchRequest) {
        return lunchService.addNewLunch(lunchRequest);
    }
}

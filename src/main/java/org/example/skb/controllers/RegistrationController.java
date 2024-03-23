package org.example.skb.controllers;

import jakarta.validation.Valid;
import org.example.skb.entity.dto.RegisterRequest;
import org.example.skb.entity.dto.RegisterResponse;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Validated
@RequestMapping("/user")
public class RegistrationController {
    @PostMapping
    public RegisterResponse registerUser(@Valid @RequestBody RegisterRequest registerRequest){
        return new RegisterResponse(registerRequest);
    }
}

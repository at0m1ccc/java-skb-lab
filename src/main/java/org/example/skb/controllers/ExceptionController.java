package org.example.skb.controllers;


import org.example.skb.exception.CustomException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/exception")
public class ExceptionController {
    @GetMapping
    public void getException() throws CustomException{
        throw new CustomException();
    }
}

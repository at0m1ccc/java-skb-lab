package org.example.skb.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/header")
public class HeadersController {
    @GetMapping
    public String getRequestHeaders(@RequestHeader Map<String, String> headers){
        StringBuilder requestHeaders = new StringBuilder();
        for (var header : headers.entrySet()) {
            requestHeaders.append(header.getKey())
                    .append("- ")
                    .append(header.getValue())
                    .append("\n");
        }
        return requestHeaders.toString();
    }
}

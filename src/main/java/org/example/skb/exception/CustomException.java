package org.example.skb.exception;

import org.springframework.http.HttpStatus;

public class CustomException extends Exception{
    public CustomException(){
        super("Error 502: The server is temporarily unavailable. Please try again later.");
    }
}
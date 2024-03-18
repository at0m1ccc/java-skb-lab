package org.example.skb.exception;

public class CustomException extends Exception{
    public CustomException(){
        super("Error 502: The server is temporarily unavailable. Please try again later.");
    }
}

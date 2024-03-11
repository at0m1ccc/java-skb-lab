package org.example.skb.handler;

import org.example.skb.exception.CustomException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class CustomExceptionHandler {
    @ExceptionHandler(CustomException.class)
    public ResponseEntity<String> getCustomException(CustomException exc){
        return new ResponseEntity<>(exc.getMessage(), HttpStatus.BAD_GATEWAY);
    }
}

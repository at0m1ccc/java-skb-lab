package org.example.skb.handler;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.List;

@ControllerAdvice
public class ConstraintExceptionHandler {
    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public List<String> handleConstraintException(MethodArgumentNotValidException exc){
        return exc.getBindingResult()
                .getFieldErrors()
                .stream()
                .map(e -> "Validation exception: " + e.getField() + " " + e.getDefaultMessage())
                .toList();
    }
}

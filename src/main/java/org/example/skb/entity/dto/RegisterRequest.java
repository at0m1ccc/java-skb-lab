package org.example.skb.entity.dto;

import lombok.Data;
import org.example.skb.validation.UserEmail;
import org.example.skb.validation.UserPassword;

@Data
public class RegisterRequest {
    @UserEmail
    private String userEmail;
    @UserPassword
    private String userPassword;
}

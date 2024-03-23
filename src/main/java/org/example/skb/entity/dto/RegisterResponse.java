package org.example.skb.entity.dto;

import lombok.Data;

@Data
public class RegisterResponse {
    String userEmail;
    String userPassword;

    public RegisterResponse(RegisterRequest registerRequest){
        this.userEmail = registerRequest.getUserEmail();
        this.userPassword = registerRequest.getUserPassword();
    }
}

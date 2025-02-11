package com.skincare.controller;

import com.skincare.dto.request.UserRequest;
import com.skincare.entity.User;
import com.skincare.service.AuthenticationService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/auth")
public class AuthenticationAPI {
    @Autowired
    AuthenticationService authenticationService;
    @PostMapping("/register")
    public ResponseEntity register(@Valid @RequestBody UserRequest account) {
        User newUser = authenticationService.register(account);
        return ResponseEntity.ok(newUser);
    }


}

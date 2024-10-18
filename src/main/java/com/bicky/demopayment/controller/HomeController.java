package com.bicky.demopayment.controller;

import com.bicky.demopayment.client.UserClient;
import com.bicky.demopayment.entity.User;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/delivery")
public class HomeController {
    private final UserClient userClient;

    @GetMapping("")
    public String home() {
        return "Hello World!";
    }

    @GetMapping("/me")
    public ResponseEntity<User> me(@RequestHeader("Authorization") String authToken) {
        return new ResponseEntity<>(userClient.me(authToken), HttpStatus.OK);
    }
}

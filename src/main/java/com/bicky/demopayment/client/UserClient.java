package com.bicky.demopayment.client;

import com.bicky.demopayment.entity.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;

@FeignClient(name = "user-service")
public interface UserClient {
    @GetMapping("/api/users/me")
    User me(@RequestHeader("Authorization") String authToken);
}
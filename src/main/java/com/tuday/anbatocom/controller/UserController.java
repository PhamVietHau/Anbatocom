package com.tuday.anbatocom.controller;

import common.api.ApiResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.ErrorResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("")
    public ResponseEntity<ApiResponse<Object>> hello(){
        return ResponseEntity.ok(ApiResponse.error(400, "Fail"));
    }

}

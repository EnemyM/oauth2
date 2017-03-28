package com.mostipan.oauth.rest.example.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by anton on 04.03.17.
 */
@RestController
@RequestMapping(value = "/api")
public class RestService {

    @GetMapping(value = "/get")
    public ResponseEntity<?> getResource() {
        System.out.println("Rest GET resource invoked");
        return new ResponseEntity<Object>("This is the protected resource.", HttpStatus.OK);
    }
}

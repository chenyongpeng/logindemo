package com.thoughtworks;

import org.springframework.http.ResponseEntity;

import static org.springframework.http.HttpStatus.BAD_REQUEST;
import static org.springframework.http.HttpStatus.OK;

public class Login {
    public ResponseEntity<String> save(String username, String phone) {
        if(username.equals("") || phone.equals("")){
            return new ResponseEntity<String>("bad request", BAD_REQUEST);
        }
        System.out.println(username);
        System.out.println(phone);
        return new ResponseEntity<String>("login success", OK);
    }
}

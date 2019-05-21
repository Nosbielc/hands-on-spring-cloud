package com.handson.treinamento.jparest.controller;

import com.handson.treinamento.jparest.services.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.data.domain.Pageable;

@RestController
@RequestMapping("/v1")
public class AccountController {

    @Autowired
    AccountService accountService;


    @GetMapping("/all")
    public ResponseEntity<?> getListAllAccount(Pageable pageable) {
        final HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setContentType(MediaType.APPLICATION_JSON);
        return new ResponseEntity<>(accountService.getAllListAccount(pageable), httpHeaders, HttpStatus.OK);
    }
}

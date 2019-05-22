package com.handson.treinamento.jparest.controller;

import com.handson.treinamento.jparest.entities.model.AccountModel;
import com.handson.treinamento.jparest.services.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.data.domain.Pageable;

@RestController
@RequestMapping("/v1")
public class AccountController {


    @Autowired
    AccountService accountService;


    @GetMapping("/account")
    public ResponseEntity<?> getListAllAccount(Pageable pageable) {
        final HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setContentType(MediaType.APPLICATION_JSON);
        return new ResponseEntity<>(accountService.getAllListAccount(pageable), httpHeaders, HttpStatus.OK);
    }

    @PostMapping("/account")
    public ResponseEntity<?> setNewAccount(@RequestBody AccountModel account){
        final HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setContentType(MediaType.APPLICATION_JSON);
        accountService.setNewAccount(account);
        return new ResponseEntity<>(account, httpHeaders, HttpStatus.CREATED);

    }

    @DeleteMapping("/account")
    public ResponseEntity<?> deleteAccount(@RequestBody AccountModel account){
        final HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setContentType(MediaType.APPLICATION_JSON);
        accountService.deleteAccount(account);
        return new ResponseEntity<>("Register deleted:"+ account.getNumber().toString(), httpHeaders, HttpStatus.OK);

    }
    @PutMapping("/account")
    public ResponseEntity<?> alterAccount(@RequestBody AccountModel account){
        final HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setContentType(MediaType.APPLICATION_JSON);
        accountService.setNewAccount(account);
        return new ResponseEntity<>(account, httpHeaders, HttpStatus.OK);

    }


}

package com.handson.treinamento.jparest.services;

import com.handson.treinamento.jparest.entities.model.AccountModel;
import com.handson.treinamento.jparest.repositories.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountService {

    @Autowired
    AccountRepository accountRepository;


    public Page<AccountModel> getAllListAccount(Pageable pageable) {

        return accountRepository.findAll(pageable);

    }
}

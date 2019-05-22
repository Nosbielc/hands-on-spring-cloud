package com.handson.treinamento.jparest.services;

import com.handson.treinamento.jparest.entities.model.AccountModel;
import com.handson.treinamento.jparest.repositories.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;


@Service
public class AccountService {

    @Autowired
    AccountRepository accountRepository;


    public Page<AccountModel> getAllListAccount(Pageable pageable) {
        return accountRepository.findAll(pageable);
    }

    public AccountModel getOneAccountById(Integer numberAccount){

        return accountRepository.findbyNumber(numberAccount);
    }

    public void setNewAccount(AccountModel account){
        accountRepository.save(account);
    }

    public void updateAccount(AccountModel account){
        accountRepository.save(account);
    }

    public void deleteAccount(AccountModel account){

        accountRepository.delete(account);
    }
}

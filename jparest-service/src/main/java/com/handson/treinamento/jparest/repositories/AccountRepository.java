package com.handson.treinamento.jparest.repositories;


import com.handson.treinamento.jparest.entities.model.AccountModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<AccountModel, Long> {

}

package com.handson.treinamento.bancodatarest.repositories;

import com.handson.treinamento.bancodatarest.entities.Transacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransacaoRepository extends JpaRepository<Transacao, Long> {
}

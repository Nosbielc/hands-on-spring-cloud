package com.handson.treinamento.camelapidb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class CamelApiDbApplication {

    public static void main(String[] args) {
        SpringApplication.run(CamelApiDbApplication.class, args);
    }

}
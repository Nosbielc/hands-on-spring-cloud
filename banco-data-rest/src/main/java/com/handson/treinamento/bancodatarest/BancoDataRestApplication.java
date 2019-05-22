package com.handson.treinamento.bancodatarest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class BancoDataRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(BancoDataRestApplication.class, args);
	}

}

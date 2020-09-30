package com.maynar.poc01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
public class Poc01Application {

	public static void main(String[] args) {
		SpringApplication.run(Poc01Application.class, args);
	}

}

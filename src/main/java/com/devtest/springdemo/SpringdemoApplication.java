package com.devtest.springdemo;

import com.devtest.springdemo.model.SpringBootApplicationLuncher;
import com.devtest.springdemo.repository.RandomGeneratorController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class SpringdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootApplicationLuncher.class, args);
	}

}

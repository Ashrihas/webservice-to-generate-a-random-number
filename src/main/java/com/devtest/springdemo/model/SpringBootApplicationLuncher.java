
package com.devtest.springdemo.model;

import com.devtest.springdemo.repository.RandomGeneratorController;
import org.springframework.boot.SpringApplication;


public class SpringBootApplicationLuncher {
  public static void main(String[] args) {
    SpringApplication.run(RandomGeneratorController.class, args);
  }
}

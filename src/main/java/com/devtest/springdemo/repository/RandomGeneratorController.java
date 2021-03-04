package com.devtest.springdemo.repository;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@EnableAutoConfiguration
public class RandomGeneratorController {
  
  @RequestMapping("/generator")
  @ResponseBody
  public String counter() {
  long startTime = System.nanoTime();
  String display;
  display = Long.toString(startTime);
  return "Random number generated is: " + display;

  }

}
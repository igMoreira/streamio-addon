package com.streamio.addon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.streamio.addon", "com.streamio.common"})
public class AddOnApplication {

  public static void main(String[] args) {
    SpringApplication.run(AddOnApplication.class, args);
  }
}

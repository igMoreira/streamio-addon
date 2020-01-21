package com.stremio.addon;

import com.stremio.core.annotation.StremioAddon;
import org.springframework.boot.SpringApplication;

@StremioAddon
public class AddOnApplication {

  public static void main(String[] args) {
    SpringApplication.run(AddOnApplication.class, args);
  }
}

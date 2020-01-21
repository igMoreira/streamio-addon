package com.stremio.core.annotation;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
@SpringBootApplication
@ComponentScan(basePackages = {"com.stremio.addon", "com.stremio.core"})
public @interface StremioAddon  {

}

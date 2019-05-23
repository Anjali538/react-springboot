package com.in28minute.fullstack.springboot.jwt.basic.authentication.springbootjwtauthloginlogout;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.SecurityAutoConfiguration;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class })
public class SpringBootFullStackJwtAuthLoginLogoutApplication {
  public static void main(String[] args) {
    SpringApplication.run(SpringBootFullStackJwtAuthLoginLogoutApplication.class, args);
  }

}

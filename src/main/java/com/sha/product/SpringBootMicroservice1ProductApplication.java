package com.sha.product;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

@SpringBootApplication (exclude = SecurityAutoConfiguration.class)
@PropertySource("classpath:application-${spring.profiles.active:default}.properties")
public class SpringBootMicroservice1ProductApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMicroservice1ProductApplication.class, args);
	}

}

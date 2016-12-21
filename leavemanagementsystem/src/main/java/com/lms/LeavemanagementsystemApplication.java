package com.lms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableOAuth2Sso
@EnableScheduling
public class LeavemanagementsystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(LeavemanagementsystemApplication.class, args);
	}
}

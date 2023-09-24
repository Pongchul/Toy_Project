package com.FBTEAMS.PONG;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

// TODO : 이것은 SpringSecurity의 모든기능을 막는 것 나중에 SpringSecurity에서 작업 필요
@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
public class PongApplication {

	public static void main(String[] args) {
		SpringApplication.run(PongApplication.class, args);
	}

}

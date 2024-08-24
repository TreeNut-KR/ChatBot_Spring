package com.TreeNut.ChatBot_Backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
public class ChatBotBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChatBotBackendApplication.class, args);
	}

}

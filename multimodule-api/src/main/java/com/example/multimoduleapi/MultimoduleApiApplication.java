package com.example.multimoduleapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.example.multimoduleapi", "com.example.multimodulecommon"})
public class MultimoduleApiApplication {
	public static void main(String[] args) {
		SpringApplication.run(MultimoduleApiApplication.class, args);
	}
}

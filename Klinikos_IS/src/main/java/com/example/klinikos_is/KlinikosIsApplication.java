package com.example.klinikos_is;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.example.klinikos_is")
public class KlinikosIsApplication {

	public static void main(String[] args) {
		SpringApplication.run(KlinikosIsApplication.class, args);
	}
}

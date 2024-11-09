package com.example.kliniku_is;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.example.kliniku_is")
public class KlinikuIsApplication {

	public static void main(String[] args) {
		SpringApplication.run(KlinikuIsApplication.class, args);
	}
}

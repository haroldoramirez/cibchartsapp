package org.cibiogas.cibchartsapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.scheduling.annotation.EnableAsync;

@EnableAsync
@SpringBootApplication
public class CibchartsappApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(CibchartsappApplication.class, args);
	}
}

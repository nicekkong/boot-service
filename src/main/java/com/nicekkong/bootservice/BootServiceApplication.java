package com.nicekkong.bootservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class BootServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootServiceApplication.class, args);
	}

}

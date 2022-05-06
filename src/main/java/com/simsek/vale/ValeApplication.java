package com.simsek.vale;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class ValeApplication {

	public static void main(String[] args) {
		SpringApplication.run(ValeApplication.class, args);
	}

}

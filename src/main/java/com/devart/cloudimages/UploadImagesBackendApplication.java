package com.devart.cloudimages;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class UploadImagesBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(UploadImagesBackendApplication.class, args);
	}

}

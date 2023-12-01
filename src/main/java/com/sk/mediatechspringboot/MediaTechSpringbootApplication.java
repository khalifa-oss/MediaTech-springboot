package com.sk.mediatechspringboot;

import org.modelmapper.ModelMapper;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MediaTechSpringbootApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(MediaTechSpringbootApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

	}
	@Bean
	public ModelMapper createModelMapper(){
		return new ModelMapper();
	}
}

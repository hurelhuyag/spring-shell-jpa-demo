package com.example.MNSpellBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
//@ComponentScan(basePackages = {"com.example.MNSpellBoot"})
//@EnableJpaRepositories("com.example.MNSpellBoot.Repository")
public class MnSpellBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(MnSpellBootApplication.class, args);
	}
}
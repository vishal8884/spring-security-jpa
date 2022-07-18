package io.vishal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import io.vishal.repository.UserRepository;

@SpringBootApplication
//@EnableJpaRepositories(basePackageClasses =  UserRepository.class)
public class SpringbootSecurityJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootSecurityJpaApplication.class, args);
	}

}

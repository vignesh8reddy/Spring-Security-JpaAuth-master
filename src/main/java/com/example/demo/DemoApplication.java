package com.example.demo;

import com.example.services.MyUserRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = { "com.example.*","com.example.services","com.example.models" })
@EnableJpaRepositories(basePackageClasses = MyUserRepository.class)
@ComponentScan(basePackages = { "com.example.*" })
@EntityScan("com.example.*")
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}

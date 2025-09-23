package com.springtechie;

import com.springtechie.models.User;
import com.springtechie.repos.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class MounicaSpringBootProjectApplication {
	@Autowired
	private UserRepository userRepository;

	public static void main(String[] args) {
		SpringApplication.run(MounicaSpringBootProjectApplication.class, args);
	}




}

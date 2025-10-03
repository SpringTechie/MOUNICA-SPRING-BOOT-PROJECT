package com.springtechie;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.springtechie.impl.UserServiceImpl;
import com.springtechie.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.web.client.RestTemplate;


@SpringBootApplication
public class MounicaSpringBootProjectApplication {

	@Autowired
	private RestTemplate restTemplate;


	public static void main(String[] args) {
		ApplicationContext context =
				SpringApplication.run(MounicaSpringBootProjectApplication.class, args);

		UserServiceImpl bean = (UserServiceImpl) context.getBean("userServiceImpl");
		System.out.println(bean);
		UserServiceImpl bean1 = context.getBean(UserServiceImpl.class);
		System.out.println(bean1);
		RestTemplate bean2 = (RestTemplate) context.getBean("restTemplateObject");
		System.out.println(bean2);

		// Object Mapper
		ObjectMapper objectMapper = new ObjectMapper();

		User user = new User(1,"arun","kumar",23);
		try {
			String stringuser = objectMapper.writeValueAsString(user);
			if(stringuser instanceof String) {
				System.out.println("It is String");
				System.out.println(stringuser);
			}

		}
		catch (JsonProcessingException exception) {
			System.out.println(exception.getMessage());
		}


		try {
			String s = "{\"id\":1,\"firstName\":\"arun\",\"lastName\":\"kumar\",\"age\":23}";

			User user1 = objectMapper.readValue(s,User.class);
			if(user1 instanceof User) {
				System.out.println("It is user");
				System.out.println(user1);
			}

		}
		catch (JsonProcessingException exception) {
			System.out.println(exception.getMessage());
		}


	}




}

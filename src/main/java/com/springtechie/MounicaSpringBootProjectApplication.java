package com.springtechie;

import com.springtechie.controlers.UserController;
import com.springtechie.impl.UserServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.web.client.RestTemplate;


@SpringBootApplication
public class MounicaSpringBootProjectApplication {


	public static void main(String[] args) {
		ApplicationContext context =
				SpringApplication.run(MounicaSpringBootProjectApplication.class, args);

		UserServiceImpl bean = (UserServiceImpl) context.getBean("userServiceImpl");
		System.out.println(bean);
		UserServiceImpl bean1 = context.getBean(UserServiceImpl.class);
		System.out.println(bean1);
		RestTemplate bean2 = (RestTemplate) context.getBean("restTemplateObject");
		System.out.println(bean2);


	}




}

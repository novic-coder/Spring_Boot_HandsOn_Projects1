package com.jpa.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.jpa.test.entity.User;
import com.jpa.test.jao.UserRepository;

@SpringBootApplication
public class SpringJpaApplication {

	public static void main(String[] args) {
		ApplicationContext context =SpringApplication.run(SpringJpaApplication.class, args);
		
		UserRepository userRepository = context.getBean(UserRepository.class);
		
		User user = new User();
		user.setName("Ravi Ranjan");
		user.setAge(25);
		user.setCity("Asansol");
		user.setGender("Male");
		
		User user1 = userRepository.save(user);
		System.out.println(user1);
		
	}

}

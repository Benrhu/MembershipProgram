package com.example.MembershipProgram;

import com.example.MembershipProgram.Repositories.UserRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MembershipProgramApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(MembershipProgramApplication.class, args);
		UserRepository repo = context.getBean(UserRepository.class);

		System.out.println(repo.findAll());
	}

}

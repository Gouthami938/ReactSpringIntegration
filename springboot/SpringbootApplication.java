package com.example.springboot;

import com.example.springboot.model.User;
import com.example.springboot.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootApplication.class, args);
	}

	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args)throws Exception{
		this.userRepository.save(new User("Ramesh","Fadet","rameshf@gmail.com"));
		this.userRepository.save(new User("tej","chak","tejc@gmail.com"));
		this.userRepository.save(new User("arundati","godi","arundati@gmail.com"));


	}



}

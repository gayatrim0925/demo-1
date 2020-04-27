package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.service.ServiceImpl;

@SpringBootApplication
public class Demo1Application implements CommandLineRunner{
	@Autowired
	ServiceImpl serviceImpl;	

	public static void main(String[] args) {
		SpringApplication.run(Demo1Application.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {		
		System.out.println(serviceImpl.getDayParts());
	}
}



package com.opdracht.jibberRest;

import com.opdracht.jibberRest.users.User;
import com.opdracht.jibberRest.users.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

@SpringBootApplication
public class JibberRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(JibberRestApplication.class, args);
	}
}



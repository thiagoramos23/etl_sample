package com.corsair;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.corsair.repository.SqlServerRepository;

@SpringBootApplication
public class EtlApplication implements CommandLineRunner {
	
	@Autowired
	SqlServerRepository sqlServerRepository;

	public static void main(String[] args) {
		SpringApplication.run(EtlApplication.class, args);
	}

	@Override
	public void run(String... arg0) throws Exception {
		sqlServerRepository.getAccounts();
	}
}

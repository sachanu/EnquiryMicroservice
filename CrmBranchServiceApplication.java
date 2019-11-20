package com.educrm.branchservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.educrm.branchservice.dao.BranchDAO;

@SpringBootApplication
@Configuration
@EnableEurekaClient
public class CrmBranchServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrmBranchServiceApplication.class, args);
	}
	
	@Bean
	public BranchDAO branchDAO() {
		return new BranchDAO();
	}
	
}

package com.recipe.WhatToCook;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
public class WhatToCookApplication {

	public static void main(String[] args) {
		SpringApplication.run(WhatToCookApplication.class, args);
	}

}

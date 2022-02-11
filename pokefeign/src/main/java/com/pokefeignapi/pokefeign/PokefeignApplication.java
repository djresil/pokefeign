package com.pokefeignapi.pokefeign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class PokefeignApplication {

	public static void main(String[] args) {
		SpringApplication.run(PokefeignApplication.class, args);
	}

}

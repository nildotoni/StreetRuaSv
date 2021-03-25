package br.com.ragegames.streetruasv;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.web.config.EnableSpringDataWebSupport;

@SpringBootApplication
@EnableSpringDataWebSupport
public class StreetruasvApplication {

	public static void main(String[] args) {
		SpringApplication.run(StreetruasvApplication.class, args);
	}

}

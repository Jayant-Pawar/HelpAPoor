package org.ngo.idonate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
public class IDonateApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(IDonateApplication.class, args);
	}
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(IDonateApplication.class);
	}
}

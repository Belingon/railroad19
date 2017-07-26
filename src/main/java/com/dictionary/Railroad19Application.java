package com.dictionary;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
@ComponentScan
public class Railroad19Application extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(Railroad19Application.class, args);
	}
	
	@Override
	protected final SpringApplicationBuilder configure(final SpringApplicationBuilder application){
	    return application.sources(Railroad19Application.class);
	}
}

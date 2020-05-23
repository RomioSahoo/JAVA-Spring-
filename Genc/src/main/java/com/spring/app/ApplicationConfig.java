package com.spring.app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {

@Bean(name="m")
public Employee em()
{
	return new Employee();
}
@Bean(name="p")
public Passport ps()
{
	return new Passport();
}



	
}
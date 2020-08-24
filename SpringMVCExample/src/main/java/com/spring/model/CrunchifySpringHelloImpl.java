package com.spring.model;

import org.springframework.context.annotation.Bean;
import com.spring.controller.CrunchifySpringHello;

public class CrunchifySpringHelloImpl implements CrunchifySpringHello {
	@Bean
	public void sayHelloCrunchify() {
		System.out.println(" Spring Hello World Example by Crunchify..!!");
		System.out.println(" Example for: How to declare a bean in Spring application?");
	}
}
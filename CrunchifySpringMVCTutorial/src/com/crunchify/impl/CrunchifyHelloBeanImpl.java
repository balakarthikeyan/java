package com.crunchify.impl;

import org.springframework.context.annotation.Bean;
import com.crunchify.controller.CrunchifyHelloBean;

public class CrunchifyHelloBeanImpl implements CrunchifyHelloBean {
	@Bean
	public void sayHelloCrunchify() {
		System.out.println(" Spring Hello World Example : How to declare a bean in Spring application?");
	}
}
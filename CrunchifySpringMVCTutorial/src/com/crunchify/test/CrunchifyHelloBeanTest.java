package com.crunchify.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.crunchify.controller.CrunchifyHelloBean;

public class CrunchifyHelloBeanTest {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("CrunchifyHelloBean.xml");
		CrunchifyHelloBean hello = (CrunchifyHelloBean) context.getBean("CrunchifyBean");
		hello.sayHelloCrunchify();
	}
}
package com.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;
 
@Component("CrunchifySpringProps")
@Scope("singleton")
public class CrunchifySpringProps {
 
    private static boolean springExample;
    private static String springTutorial;
    private static String url;
 
    @Autowired
    public CrunchifySpringProps(
    		@Value("${CRUNCHIFY_URL}") String url, 
    		@Value("${SPRING_TUTORIAL}") String springTutorial,
            @Value("${IS_THIS_SPRING_EXAMPLE}") boolean springExample) {
    	CrunchifySpringProps.springExample = springExample;
    	CrunchifySpringProps.springTutorial = springTutorial;
        CrunchifySpringProps.url = url;
 
    }
 
    @SuppressWarnings({ "resource", "unused" })
    public static void main(String[] args) {
        try {
            ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(new String[] { "spring-servlet.xml" });
        } catch (Throwable e) {
            System.out.println(e);
        }
 
        System.out.println("Loading Properties from Config File during application startup:");
        System.out.println("SPRING_TUTORIAL: " + springTutorial);
        System.out.println("IS_THIS_SPRING_EXAMPLE: " + springExample);
        System.out.println("CRUNCHIFY_URL: " + url);
    }
 
}

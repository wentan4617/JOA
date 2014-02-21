package com.joa.test;

import org.junit.Before;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BaseSpring {
	public ApplicationContext context;
	
	@Before
	public void startSpring(){
		context = new ClassPathXmlApplicationContext("classpath:spring/applicationContext.xml");
	}
}

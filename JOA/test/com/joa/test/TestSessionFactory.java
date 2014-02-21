package com.joa.test;

import org.hibernate.SessionFactory;
import org.junit.Test;

public class TestSessionFactory extends BaseSpring{
	
	@Test
	public void testSessionFactory(){
		SessionFactory factory = (SessionFactory) context.getBean("sessionFactory");
		System.out.println(factory);
	}
	
}

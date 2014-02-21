package com.joa.test;

import org.junit.Test;

import com.joa.domain.Person;
import com.joa.service.PersonService;

public class TestSave extends BaseSpring {
	@Test
	public void test(){
		PersonService personService = (PersonService) context.getBean("personService");
		Person person = new Person();
		person.setPname("aaa");
		personService.savePerson(person);
	}
}

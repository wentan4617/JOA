package com.joa.action;

import com.joa.domain.Person;
import com.joa.service.PersonService;
import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class PersonAction extends ActionSupport {
	
	private PersonService personService;
	//只是增加一个变更。测试一下git gui
	public PersonService getPersonService() {
		return personService;
	}

	public void setPersonService(PersonService personService) {
		this.personService = personService;
	}
	
	public String savePerson(){
		Person person = new Person();
		person.setPname("went");
		this.personService.savePerson(person);
		return null;
	}
	
}

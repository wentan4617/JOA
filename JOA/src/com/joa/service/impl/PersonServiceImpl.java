package com.joa.service.impl;

import com.joa.dao.PersonDao;
import com.joa.domain.Person;
import com.joa.service.PersonService;

public class PersonServiceImpl implements PersonService {
	private PersonDao personDao;
	
	public PersonDao getPersonDao() {
		return personDao;
	}

	public void setPersonDao(PersonDao personDao) {
		this.personDao = personDao;
	}

	@Override
	public void savePerson(Person person) {
		// TODO Auto-generated method stub
		this.personDao.savePerson(person);
	}

}

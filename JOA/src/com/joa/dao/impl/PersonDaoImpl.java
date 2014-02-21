package com.joa.dao.impl;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.joa.dao.PersonDao;
import com.joa.domain.Person;

public class PersonDaoImpl extends HibernateDaoSupport implements PersonDao {
	
	@Override
	public void savePerson(Person person) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().save(person);
	}

}

package com.Person.services;

import java.util.List;

import com.Person.dao.PersonDaoInterface;

public class PersonServicesImpl implements PersonServicesInterface {
	PersonDaoInterface personDao;
	
	public PersonDaoInterface getPersonDao() {
		return personDao;
	}

	public void setPersonDao(PersonDaoInterface personDao) {
		this.personDao = personDao;
	}

	public List searchPerson(int uid){
		return personDao.searchPerson(uid);
	}
	public int Update(int uid,String password){
		return personDao.Update(uid,password);
	}
}

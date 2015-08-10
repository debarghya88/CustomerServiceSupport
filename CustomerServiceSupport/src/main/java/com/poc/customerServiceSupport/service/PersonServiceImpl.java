package com.poc.customerServiceSupport.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.poc.customerServiceSupport.dao.PersonDAO;
import com.poc.customerServiceSupport.model.Person;

@Service
public class PersonServiceImpl implements PersonService {
	private PersonDAO personDAO;
	 
    public void setPersonDAO(PersonDAO personDAO) {
        this.personDAO = personDAO;
    }
    
    @Override
    @Transactional
    public List<Person> listPersons() {
        return this.personDAO.listPersons();
    }
}

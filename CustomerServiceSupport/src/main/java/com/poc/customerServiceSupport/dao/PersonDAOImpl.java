package com.poc.customerServiceSupport.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.poc.customerServiceSupport.model.Person;

@Repository
public class PersonDAOImpl implements PersonDAO {
	
	private SessionFactory sessionFactory;
	
	private static final Logger logger = LoggerFactory.getLogger(PersonDAOImpl.class);
    
    public void setSessionFactory(SessionFactory sf){
        this.sessionFactory = sf;
    }
    
    @SuppressWarnings("unchecked")
    @Override
    public List<Person> listPersons() {
        Session session = this.sessionFactory.getCurrentSession();
        List<Person> personsList = session.createQuery("from Person").list();
        for(Person p : personsList){
            System.out.println("Hello again p ----------------->");
            logger.debug("Person List::"+p);
        }
        return personsList;
    }
}

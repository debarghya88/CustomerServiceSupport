package com.poc.customerServiceSupport.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.servlet.ModelAndView;

import com.poc.customerServiceSupport.service.PersonService;

@Controller
public class HelloWorld {
	
	private PersonService personService;
    
    @Autowired(required=true)
    @Qualifier(value="personService")
    public void setPersonService(PersonService ps){
        this.personService = ps;
    }
	
	@RequestMapping("/welcome")
	public String helloWorld() {
 
		this.personService.listPersons();
		return "welcome" ;
	}
}

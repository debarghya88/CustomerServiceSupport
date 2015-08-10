package com.poc.customerServiceSupport.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ALRGR2SG")
public class Person {

	@Column(name="ALRGR2SG_CREATE_USERS_KEY")
    private String country;
     
	@Column(name="ALRGR2SG_GENRE_KEY")
    private String name;
     
	@Id
	@Column(name="ALRGR2SG_KEY")
    private int id;
}

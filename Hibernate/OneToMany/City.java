package com.ils.common.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "CITY")
public class City {

	@Id
	@Column(name = "IDCITY", nullable = false)
	@GeneratedValue
	private Integer id;

	@Column(name = "NAMACITY", nullable = false, length = 50)
	private String namacity;

	@OneToMany(mappedBy="city")
	private Set<Person> persons;
	

}

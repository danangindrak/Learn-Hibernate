package com.ils.common.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * For a complete reference see <a href=
 * "http://docs.jboss.org/hibernate/stable/annotations/reference/en/html_single/"
 * > Hibernate Annotations Communit Documentations</a> by Danang
 */
@Entity
@Table(name = "PERSON")
public class Person implements Serializable {

	private static final long serialVersionUID = -5527566248002296042L;

	@Id
	@Column(name = "ID")
	@GeneratedValue
	private Integer id;

	@Column(name = "FIRST_NAME", nullable = false, length = 50)
	private String firstName;

	@Column(name = "LAST_NAME")
	private String lastName;

	@Column(name = "NUMBERID")
	private String numberId; // nim or NIK

	@Column(name = "USERNAME", nullable = false, length = 20)
	private String username;

	@Column(name = "PASSWORD")
	private String password;

	@Temporal(value = TemporalType.DATE)
	private Date dob;

	@Column(name = "TELEPHONE")
	private Integer telephone;

	@Column(name = "MONEY")
	private Double money;

	@Column(name = "ADDRESS")
	private String address;

	@ManyToOne
	@JoinColumn(name="IDCITY")
	private City city;
	 
	@Column(name = "EMAIL")
	private String email;


//	Getter setter
}

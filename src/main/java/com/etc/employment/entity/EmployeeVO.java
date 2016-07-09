package com.etc.employment.entity;

import java.io.Serializable;

public class EmployeeVO implements Serializable {

	private Integer id;
	private String firstName;
	private String lastName;
	private static final long serialVersionUID = 1L;

	// Setters and Getters

	public EmployeeVO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EmployeeVO(Integer id, String firstName, String lastName) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "EmployeeVO [id=" + id + ", firstName=" + firstName
				+ ", lastName=" + lastName + "]";
	}

}
package com.Registration.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String userName;
	private int age;
	private String gender;
	private String hobbis;
	private String password;

	public User(Long id, String userName, int age, String gender, String hobbis, String password) {
		super();
		this.id = id;
		this.userName = userName;
		this.age = age;
		this.gender = gender;
		this.hobbis = hobbis;
		this.password = password;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getHobbis() {
		return hobbis;
	}

	public void setHobbis(String hobbis) {
		this.hobbis = hobbis;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public User() {

	}
}

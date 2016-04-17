package com.briup.ch08.bean;

/**
 * Pojo(JavaBean)
 * */
public class Customer {
	private Long id;
	private String name;
	private Integer age;
	private String password;
	private String address;

	public Customer() {

	}

	public Customer(String name, Integer age, String password) {
		this.name = name;
		this.age = age;
		this.password = password;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
}

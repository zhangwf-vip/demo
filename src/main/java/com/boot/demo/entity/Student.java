package com.boot.demo.entity;


public class Student {
	public Integer getID() {
		return ID;
	}

	public void setID(Integer ID) {
		this.ID = ID;
	}

	public String getStudenName() {
		return StudenName;
	}

	public void setStudenName(String studenName) {
		StudenName = studenName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	Integer ID;
	String StudenName;
	String email;
	Integer age;
	String sex;
}
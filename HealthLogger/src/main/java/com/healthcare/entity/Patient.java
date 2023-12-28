package com.healthcare.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Patient {
	
	private String name;
	@Id
	
	private String email;
	private Long phone;
	private int age;
	private String diagnosis;
	private String remark;
	private String gender;
	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Patient(String name, String email, Long phone, int age, String diagnosis, String remark, String gender) {
		super();
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.age = age;
		this.diagnosis = diagnosis;
		this.remark = remark;
		this.gender = gender;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Long getPhone() {
		return phone;
	}
	public void setPhone(Long phone2) {
		this.phone = phone2;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getDiagnosis() {
		return diagnosis;
	}
	public void setDiagnosis(String diagnosis) {
		this.diagnosis = diagnosis;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "Patient [name=" + name + ", email=" + email + ", phone=" + phone + ", age=" + age + ", diagnosis="
				+ diagnosis + ", remark=" + remark + ", gender=" + gender + "]";
	}
}
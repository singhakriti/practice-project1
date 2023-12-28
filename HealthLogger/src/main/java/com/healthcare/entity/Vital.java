package com.healthcare.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="vitals")
public class Vital {

	@Id
	@ManyToOne
    @JoinColumn(name = "email")
	private String email;
	private int bphigh;
	private int bplow;
	private int spo2;
	public Vital() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Vital(String email, int bphigh, int bplow, int spo2) {
		super();
		this.email = email;
		this.bphigh = bphigh;
		this.bplow = bplow;
		this.spo2 = spo2;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getBphigh() {
		return bphigh;
	}
	public void setBphigh(int bphigh) {
		this.bphigh = bphigh;
	}
	public int getBplow() {
		return bplow;
	}
	public void setBplow(int bplow) {
		this.bplow = bplow;
	}
	public int getSpo2() {
		return spo2;
	}
	public void setSpo2(int spo2) {
		this.spo2 = spo2;
	}
	@Override
	public String toString() {
		return "Vital [email=" + email + ", bphigh=" + bphigh + ", bplow=" + bplow + ", spo2=" + spo2 + "]";
	}
	
}

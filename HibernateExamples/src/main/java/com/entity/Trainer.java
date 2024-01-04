package com.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;



@Entity
public class Trainer {
	@Id
	private int tid;
	private String tname;
	@OneToMany    //one trainera handle more than one student.
	@JoinColumn(name="tsid") //  join column  is use to link student class fk column
	private List<Student>listOfStudents;
	
	public Trainer(int tid, String tname) {
		super();
		this.tid = tid;
		this.tname = tname;
	}
	public List<Student> getListOfStudents() {
		return listOfStudents;
	}
	public void setListOfStudents(List<Student> listOfStudents) {
		this.listOfStudents = listOfStudents;
	}
	@Override
	public String toString() {
		return "Trainer [tid=" + tid + ", tname=" + tname + ", listOfStudents=" + listOfStudents + "]";
	}
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public Trainer() {
		super();
		// TODO Auto-generated constructor stub
	}

}

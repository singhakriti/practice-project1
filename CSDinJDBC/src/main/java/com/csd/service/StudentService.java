package com.csd.service;

import com.csd.dao.StudentDAO;

public class StudentService {
	
	StudentDAO sd = new StudentDAO();

	public void createStudent() {
	sd.createStudent();
}
	public void dropStudent() {
		sd.dropStudent();

}
	public void selectStudent() {
		sd.selectStudent();
	}
}

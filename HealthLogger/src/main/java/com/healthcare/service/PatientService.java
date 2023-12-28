package com.healthcare.service;

import java.util.List;

import com.healthcare.dao.PatientDao;
import com.healthcare.entity.Patient;



public class PatientService {
	PatientDao pd = new PatientDao();
	
	public String storePatient(Patient patient) {
		if(patient.getAge()<15) {
			return "Age must be > 15";
		}else if(pd.storePatient(patient)>0) {
			return "Patient details stored successfully";
		}else {
			return "Patient didn't store";
		}
	}
	public List<Patient> findAllPatient() {
		
		return pd.findAllPatient();
	}
    public Patient findPatientById(String emailId) {
		
		return pd.findPatientById(emailId);
	}
    
    public String deletePatientById(String emailId) {
    	if(pd.deletePatient(emailId)>0) {
			return "Patient deleted successfully";
		}else {
			return "Patient not present";
		}
	}
//    public String updatePatient(String email, Patient patient) {
//    	if(pd.updatePatient(email, patient)>0) {
//			return "Patient information updated successfully";
//		}else {
//			return "Patient not present";
//		}
//	}
//    


}

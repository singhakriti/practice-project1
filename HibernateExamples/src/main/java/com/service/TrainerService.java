package com.service;

import java.util.List;

import com.dao.TrainerDao;
import com.entity.Trainer;

public class TrainerService {
	TrainerDao td =new TrainerDao();
	
	public String storeTrainer(Trainer trainer) {
		if(td.storeTrainer(trainer)>0) {
			return "Record insert succcessfully";
		}else {
			return "record not inserted";
		}
	}
	public String deleteTrainer(int tid) {
		if(td.deleteTrainer(tid)>0) {
			return "Trainer reocrd deleted succcessfully";
		}else {
			return "record did't delete";
		}
	}
	public String updateTrainer(Trainer trainer) {
		if(td.updateTrainer(trainer)>0) {
			return "Trainer reocrd updated succcessfully";
		}else {
			return "record did't update";
		}
	}
	public String findTrainer(int tid) {
		Trainer t=td.findTrainer(tid);
		if(t==null) {
			return "Trainer reocrd not present";
		}else {
			return t.toString();
		}
	}
	public List<Trainer> findAllTrainer() {
		return td.findAllTrainers();
	}
	
	public List<String> findAllTrainerNames() {
		return td.findAllTrainerNames();
	}
	public List<Object[]> findAllTrainerIdAndNames() {
		return td.findAllTrainerIdAndName();
	}
	

}

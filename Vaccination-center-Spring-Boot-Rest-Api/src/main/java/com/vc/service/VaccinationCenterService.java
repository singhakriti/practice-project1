package com.vc.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vc.entity.Citizens;
import com.vc.entity.VaccinationCenter;
import com.vc.repository.VaccinationCenterRepository;

@Service
public class VaccinationCenterService {

    @Autowired
    private VaccinationCenterRepository vaccinationCenterRepository;

    public List<VaccinationCenter> findAllVaccinationCenters() {
        return vaccinationCenterRepository.findAll();
    }

    public String findSpecificVaccinationCenter(int vcid) {
        return vaccinationCenterRepository.findById(vcid)
                .map(vc -> vc.toString())
                .orElse("Vaccination Center details not present in the database");
    }
	public String deleteSpecificVaccinationCenter(int vcid) {
		Optional<VaccinationCenter> result = vaccinationCenterRepository.findById(vcid);
		if(result.isPresent()) {
			VaccinationCenter c  = result.get();
			return "deleted Successfully";
		}else {
			return "Citizen details not present in database";
		}
	}

	public String UpdateSpecificVaccinationCenter(int vcid) {
			Optional<VaccinationCenter> result = vaccinationCenterRepository.findById(vcid);
			if(result.isPresent()) {
				VaccinationCenter c  = result.get();
				return "Update Successfully";
			}else {
				return "Citizen details not present in database";
			}
		}
	}
	

    

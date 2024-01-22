package com.vc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.vc.entity.VaccinationCenter;
import com.vc.service.VaccinationCenterService;

@RestController
public class VaccinationController {
	@Autowired
	VaccinationCenterService vaccinationcenterservice;
	
	 // http://localhost:8086/vaccinationcenter/
    @RequestMapping(value = "vaccinationcenter/", method = RequestMethod.GET)
    public List<VaccinationCenter> findAllVaccinationCenters() {
        return vaccinationcenterservice.findAllVaccinationCenters();
    }
    // http://localhost:8086/vaccinationcenter/1
    @RequestMapping(value = "vaccinationcenter/{vcid}", method = RequestMethod.GET)
    public String findVaccinationCenterById(@PathVariable("vcid") int vcid) {
        return vaccinationcenterservice.findSpecificVaccinationCenter(vcid);
    }
    // http://localhost:8086/vaccinationcenter/1
    @RequestMapping(value = "vaccinationcenter/{vcid}", method = RequestMethod.DELETE)
    public String deleteVaccinationCenterById(@PathVariable("vcid") int vcid) {
        return vaccinationcenterservice.deleteSpecificVaccinationCenter(vcid);
    }
    
    // http://localhost:8086/vaccinationcenter/1
    @RequestMapping(value = "vaccinationcenter/{vcid}", method = RequestMethod.PUT)
    public String UpdateVaccinationCenterById(@PathVariable("vcid") int vcid) {
        return vaccinationcenterservice.UpdateSpecificVaccinationCenter(vcid);
    }
    
    
   


}


	

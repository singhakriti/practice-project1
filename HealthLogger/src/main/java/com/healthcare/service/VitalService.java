package com.healthcare.service;

import com.healthcare.dao.VitalDao;
import com.healthcare.entity.Vital;

public class VitalService {
	VitalDao vd = new VitalDao();
	
	public String storeVital(Vital vital) {
		if(vd.storeVital(vital)>0) {
			return "Vitals details stored successfully";
		}else {
			return "Vitals didn't store";
		}
	}

}

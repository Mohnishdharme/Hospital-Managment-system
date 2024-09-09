package com.mdcorporation.hospital.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mdcorporation.hospital.dao.PatientDao;
import com.mdcorporation.hospital.entity.Patient;

@Service
public class PatientService {
	
	@Autowired
	PatientDao dao;
	

	


	public Patient addPatientProcess(Patient patient) {
		 return dao.addPatientProcess(patient);
		
	}


	public Patient searchPatient(int id) {
		return dao.searchPatient(id);
		
	}

}

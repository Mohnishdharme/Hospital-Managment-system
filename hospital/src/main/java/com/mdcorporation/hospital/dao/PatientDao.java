package com.mdcorporation.hospital.dao;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mdcorporation.hospital.controller.PatientController;
import com.mdcorporation.hospital.entity.Patient;

@Repository
public class PatientDao {
	
	
	Logger LOGGER = LoggerFactory.getLogger(PatientController.class);
	
	@Autowired
	SessionFactory factory ;
	



	public Patient addPatientProcess(Patient patient) {
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(patient);
		Patient patient1 = null;
		patient1 = session.get(Patient.class, patient.getId());
		transaction.commit();
		return patient1;
		
	}


	public Patient searchPatient(int id) {
		Session session = factory.openSession();
	    Patient patient = null;

	    try {
	        
	        LOGGER.info("Session opened, querying patient with ID: " + id);
	        patient = session.get(Patient.class, id);
	        if (patient != null) {
	            LOGGER.info("Patient retrieved: " + patient.getName());
	        } else {
	            LOGGER.warn("No patient found with ID: " + id);
	        }
	    } catch (Exception e) {
	        LOGGER.error("Error retrieving patient with ID " + id, e);
	    } finally {
	        if (session != null) {
	            session.close();
	            LOGGER.info("Session closed.");
	        }
	    }
	    return patient;
	}

	


}

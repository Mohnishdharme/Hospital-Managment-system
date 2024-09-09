package com.mdcorporation.hospital.controller;

import java.util.Scanner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.mdcorporation.hospital.entity.Patient;
import com.mdcorporation.hospital.services.PatientService;

@Controller
public class PatientController {
    
    Logger LOGGER = LoggerFactory.getLogger(PatientController.class);

    @Autowired
    PatientService service;

    @GetMapping("/")
    public String showHomePage() {
        // This only loads the home page, no patient is added here
        return "login";
    }

    @PostMapping("addPatientProcess")
    public String addPatientProcess(Model model, @ModelAttribute Patient patient) {
        Patient foundPatient = service.addPatientProcess(patient);
        model.addAttribute("viewPatient", foundPatient);
        LOGGER.info("The patient is successfully added");

        // Redirecting to prevent resubmission on page reload
        return "redirect:/home";
    }

    @GetMapping("/home")
    public String showHomePageAfterAddingPatient(Model model) {
        // This loads the home page after adding a patient, 
        // No new patient is added here on page reload
        return "home";
    }

    @PostMapping("/searchPatient")
    public String searchPatient(Model model, @ModelAttribute Patient patient) {
        LOGGER.info("Inside the search method with Patient ID: " + patient.getId());

        Patient foundPatient = service.searchPatient(patient.getId());

        if (foundPatient != null) {
            LOGGER.info("Patient found: " + foundPatient.getName());
            model.addAttribute("viewPatient", foundPatient);
            return "patientDetails";
        } else {
            LOGGER.warn("No patient found with ID: " + patient.getId());
            model.addAttribute("errorMessage", "Patient not found!");
            return "searchPatient";
        }
    }
}

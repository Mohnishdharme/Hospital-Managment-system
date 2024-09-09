package com.mdcorporation.hospital.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import com.mdcorporation.hospital.entity.Staff;
import com.mdcorporation.hospital.services.AdministratorService;

@Controller
public class AdministratorController {
	
	@Autowired
	AdministratorService service;
	
	Logger LOGGER = LoggerFactory.getLogger(AdministratorController.class);
	
	@GetMapping("administrator")
	public String administrator() {
		LOGGER.debug("this is not working");
		LOGGER.info("in the adminstrator");
		return "administrator";
	}
	
	@PostMapping("addStaff")
	public String addStaff(@ModelAttribute Staff staff) {
	
		LOGGER.info(staff.getName());
		service.addStaff(staff);
		return "administrator"; 
		
	}
	
	 @GetMapping("/showStaff")
	    public String showStaff(Model model) {
	        List<Staff> staffList = service.showStaff();
	        model.addAttribute("staffList", staffList);
	        return "showStaff"; // Returns the name of the JSP page to display the list
	    }

}

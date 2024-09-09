package com.mdcorporation.hospital.services;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mdcorporation.hospital.dao.AdministratorDao;
import com.mdcorporation.hospital.entity.Staff;

@Service
public class AdministratorService {

    @Autowired  // Add this annotation to inject the AdministratorDao bean
    private AdministratorDao dao;

    private Logger LOGGER = LoggerFactory.getLogger(AdministratorService.class);

    
    
    
    public void addStaff(Staff staff) {
        LOGGER.info(staff.getName());
        dao.addStaff(staff);
    }

    public List<Staff> showStaff() {
        return dao.showStaff();
    }
}

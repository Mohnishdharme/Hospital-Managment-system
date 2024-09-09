package com.mdcorporation.hospital.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mdcorporation.hospital.entity.Staff;

@Repository
public class AdministratorDao {

	@Autowired
	SessionFactory factory;
	
	Logger LOGGER = LoggerFactory.getLogger(AdministratorDao.class);
	
	
	public void addStaff(Staff staff) {
		
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(staff);
		transaction.commit();
	}


	public List<Staff> showStaff() {
        Session session = factory.openSession();
        List<Staff> staffList = null;

        try {
            String hql = "FROM Staff"; // HQL query to fetch all records from the Staff entity
            Query<Staff> query = session.createQuery(hql, Staff.class);
            staffList = query.getResultList();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            session.close();
        }

        return staffList;
    }

}

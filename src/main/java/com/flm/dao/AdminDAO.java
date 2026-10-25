package com.flm.dao;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.SelectionQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.flm.model.Admin;

import jakarta.transaction.Transactional;

@Component
public class AdminDAO {
	
	@Autowired
	SessionFactory sf;
	
	@Transactional
	public String signup(Admin admin)
	{
		Session s = sf.getCurrentSession();
		s.persist(admin);
		
		return admin.getUserName();
	}
	
	@Transactional
	public Admin findAdminByUsername(String username)
	{
		Session session = sf.getCurrentSession();
		
		SelectionQuery<Admin> sq = session.createSelectionQuery("from Admin where userName = ?1",Admin.class);
		sq.setParameter(1, username);
		
		Admin admin = sq.uniqueResult();
		
		return admin;
		
	}
	
}

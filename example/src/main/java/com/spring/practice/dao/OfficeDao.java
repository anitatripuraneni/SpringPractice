package com.spring.practice.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Component
@Transactional
@Repository
public class OfficeDao {

	@Autowired
	private SessionFactory sessionFactory;

	public Session session() {

		return sessionFactory.getCurrentSession();
	}

	@SuppressWarnings("unchecked")
	public List<Office> empDetails() {

		return session().createQuery("from Office").list();

	}

	public Integer create(Office emp) {
		int id = (Integer) session().save(emp);
		return id;
	}

}

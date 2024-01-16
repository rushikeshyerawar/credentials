package com.mindscape.DAO;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mindscape.entity.interns;

@Repository
public class InternsDAO {

	@Autowired
	SessionFactory factory;
	
	
	public List<interns> getAllInterns()
	{
		Session session=factory.openSession();
		return session.createCriteria(interns.class).list();		
	}
	
	public interns updateIntern(interns intern)
	{
		
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		session.update(intern);
		tx.commit();
		return intern;
	}
	
	public void saveIntern(interns intern)
	{
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		session.save(intern);
		tx.commit();
	}
	
	public interns deleteIntern(int internid)
	{
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		interns intern1=session.get(interns.class,internid);
		session.delete(intern1);
		tx.commit();
		return intern1;
	}
	public interns getInternByCertificate(String certino)
	{
		interns intern=null;
		Session session=factory.openSession();
		Criteria criteria=session.createCriteria(interns.class).add(Restrictions.eq("internshipcertificateno", certino));
		if(criteria.list().isEmpty())
		{
			return intern;
		}
		else
			return (interns) criteria.list().get(0);
	}
}

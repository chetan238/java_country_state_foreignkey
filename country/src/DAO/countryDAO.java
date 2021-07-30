package DAO;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import VO.countryVO;


public class countryDAO {

	public void insert(countryVO v) {
		SessionFactory ss=new Configuration().configure().buildSessionFactory();
		Session s=ss.openSession();
		Transaction tn=s.beginTransaction();
		s.save(v);
		tn.commit();
		s.close();
		
	}

	public List view(countryVO v) {
		// TODO Auto-generated method stub
		List ls=new ArrayList();
		SessionFactory ss=new Configuration().configure().buildSessionFactory();
		Session s=ss.openSession();
		Transaction tn=s.beginTransaction();
		Query q=s.createQuery("from countryVO");
		ls=q.list();
		tn.commit();
		s.close();
		return ls;
		
	}

	public void delete(countryVO cv) {
		// TODO Auto-generated method stub
		SessionFactory ss=new Configuration().configure().buildSessionFactory();
		Session s=ss.openSession();
		Transaction tn=s.beginTransaction();
		s.delete(cv);
		tn.commit();
		s.close();
		
		
	}

	public List edit(countryVO cv) {
		// TODO Auto-generated method stub
		List ls=new ArrayList();
		SessionFactory ss=new Configuration().configure().buildSessionFactory();
		Session s=ss.openSession();
		Transaction tn=s.beginTransaction();
		Query q=s.createQuery("from countryVO where id="+cv.getId()+"");
		ls=q.list();
		tn.commit();
		s.close();
		return ls;
	}

	public void update(countryVO v) {
		// TODO Auto-generated method stub
		SessionFactory ss=new Configuration().configure().buildSessionFactory();
		Session s=ss.openSession();
		Transaction tn=s.beginTransaction();
		s.update(v);
		tn.commit();
		s.close();
		
	}

	public List getCountry(countryVO v) {
		List ls=new ArrayList();
		SessionFactory ss=new Configuration().configure().buildSessionFactory();
		Session s=ss.openSession();
		Transaction tn=s.beginTransaction();
		Query q=s.createQuery("from countryVO");
		ls=q.list();
		tn.commit();
		s.close();
		return ls;
		
	}
	

}

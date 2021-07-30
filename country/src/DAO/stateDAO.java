package DAO;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import VO.stateVO;

public class stateDAO {

	public void insert(stateVO v) {
		SessionFactory ss=new Configuration().configure().buildSessionFactory();
		Session s=ss.openSession();
		Transaction tn=s.beginTransaction();
		s.save(v);
		tn.commit();
		s.close();
		
	}

	public List view(stateVO v) {
		// TODO Auto-generated method stub
		List ls=new ArrayList();
		SessionFactory ss=new Configuration().configure().buildSessionFactory();
		Session s=ss.openSession();
		Transaction t=s.beginTransaction();
	    Query q=s.createQuery("from stateVO");
	    ls=q.list();
	    t.commit();
	    s.close();
		return ls;
		
	}

	public void delete(stateVO v) {
		SessionFactory ss=new Configuration().configure().buildSessionFactory();
		Session s=ss.openSession();
		Transaction tn=s.beginTransaction();
		s.delete(v);
		tn.commit();
		s.close();
		
	}

	public List editstate(stateVO v) {
		// TODO Auto-generated method stub
		List ls=new ArrayList();
		SessionFactory ss=new Configuration().configure().buildSessionFactory();
		Session s=ss.openSession();
		Transaction t=s.beginTransaction();
	    Query q=s.createQuery("from stateVO where id="+v.getId()+"");
	    ls=q.list();
	    t.commit();
	    s.close();
		return ls;
	}

	public void update(stateVO v) {
		SessionFactory ss=new Configuration().configure().buildSessionFactory();
		Session s=ss.openSession();
		Transaction tn=s.beginTransaction();
		s.update(v);
		tn.commit();
		s.close();
		
	}
	

}

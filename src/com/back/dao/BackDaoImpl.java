package com.back.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.hibernate.Session;
import com.domain.Classes;
import com.domain.Gly;
import com.domain.Shangpin;
import com.utils.HibernateUtils;

public class BackDaoImpl implements BackDao {
	@Override
	public Gly login(String whereSql) {
		// TODO Auto-generated method stub
		Gly gly=new Gly();
		Session session = null;
		session = HibernateUtils.getSession();
		session.beginTransaction();
		List list = session.createSQLQuery(whereSql).list();
		for (Iterator iter=list.iterator(); iter.hasNext();) {
			Object[] obj = (Object[])iter.next();
			gly.setGName((String) obj[1]);
			gly.setPassword((String)obj[2]);
		}
		return gly;
	}

	@Override
	public void addclasses(Classes classes) {
		// TODO Auto-generated method stub
		Session session =null;
		session = HibernateUtils.getSession();
		try{
			session.beginTransaction();
			
			session.save(classes);
			session.getTransaction().commit();
		}catch(Exception e){
			e.printStackTrace();
			session.getTransaction().rollback();
		}finally{
			HibernateUtils.closeSession(session);
		}
	}

	@Override
	public List searchclasses(String sql) {
		// TODO Auto-generated method stub
		Session session = null;
		try {
			ArrayList<Classes> list = new ArrayList<Classes>();
			session = HibernateUtils.getSession();
			session.beginTransaction();
			List classes1 = session.createSQLQuery(sql).list();
			for (Iterator iter=classes1.iterator(); iter.hasNext();) {
				Object[] obj = (Object[])iter.next();
				Classes classes=new Classes();
				classes.setCId((Integer)obj[0]);
				classes.setCName((String)obj[1]);
				classes.setCDetail((String)obj[2]);
				list.add(classes);
			}
			session.getTransaction().commit();
			return list;
		}catch(Exception e) {
			e.printStackTrace();
			session.getTransaction().rollback();
		}finally {
			HibernateUtils.closeSession(session);
		}
		return null;
	}


	@Override
	public Classes checkclasses(String sql) {
		// TODO Auto-generated method stub
		Classes classes=new Classes();
		Session session = null;
		session = HibernateUtils.getSession();
		session.beginTransaction();
		List list = session.createSQLQuery(sql).list();
		for (Iterator iter=list.iterator(); iter.hasNext();) {
			Object[] obj = (Object[])iter.next();
			classes.setCId((Integer) obj[0]);
			classes.setCName((String) obj[1]);
		}
		return classes;
	}
	

	@Override
	public void delete(String sql) {
		// TODO Auto-generated method stub
		Session session = HibernateUtils.getSession();
		try {
			session.beginTransaction();
			session.createQuery(sql)
					.executeUpdate();
			session.getTransaction().commit();
		}catch(Exception e) {
			e.printStackTrace();
			session.getTransaction().rollback();
		}finally {
			HibernateUtils.closeSession(session);
		}
	}

	@Override
	public Shangpin checkShangpin(String sql) {
		// TODO Auto-generated method stub
		Shangpin shangpin=new Shangpin();
		Session session = null;
		session = HibernateUtils.getSession();
		session.beginTransaction();
		List list = session.createSQLQuery(sql).list();
		for (Iterator iter=list.iterator(); iter.hasNext();) {
			Object[] obj = (Object[])iter.next();
			shangpin.setCId((Integer) obj[2]);
		}
		return shangpin;
	}

}

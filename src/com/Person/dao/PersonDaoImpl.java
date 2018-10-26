package com.Person.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;

import com.domain.Car;
import com.domain.Shangpin;
import com.domain.Users;
import com.utils.HibernateUtils;

public class PersonDaoImpl implements PersonDaoInterface {
	public List searchPerson(int Uid){

		List list=new ArrayList();
		Session session = null;
		try {
			session = HibernateUtils.getSession();
			session.beginTransaction();
			
			List user = session.createQuery("from Users where UId=?").setParameter(0,Uid).list();
			for (Iterator iter=user.iterator(); iter.hasNext();) {
				Users users= (Users)iter.next();
				int uid=users.getUId();
				String uname=users.getUName();
				String password=users.getPassword();
				String email=users.getEmail();
				String sex=users.getSex();
				String phone=users.getPhone();
				
				Users u=new Users();
			    u.setUId(uid);
			    u.setUName(uname);
			    u.setPassword(password);
			    u.setEmail(email);
			    u.setSex(sex);
			    u.setPhone(phone);
				list.add(u);
			
			}
			session.getTransaction().commit();
		}catch(Exception e) {
			e.printStackTrace();
			session.getTransaction().rollback();
		}finally {
			HibernateUtils.closeSession(session);
		}
		return list;
		
		
		
	}
	
	public int Update(int uid,String password){
		int rowN=0;
		Session session = null;
		try {
			session = HibernateUtils.getSession();
			session.beginTransaction();
			
			rowN=session.createQuery("update Users u set u.password=? where u.UId=?")
					.setParameter(0,password)
					.setParameter(1,uid)
					.executeUpdate();
			
			session.getTransaction().commit();
		}catch(Exception e) {
			e.printStackTrace();
			session.getTransaction().rollback();
		}finally {
			HibernateUtils.closeSession(session);
		}
		return rowN;
	}
}

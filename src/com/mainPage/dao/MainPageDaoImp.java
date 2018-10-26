package com.mainPage.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;

import com.domain.Users;
import com.utils.HibernateUtils;

public class MainPageDaoImp implements MainPageDao {

	@Override
	public List getUserName(String userName) {
		// TODO Auto-generated method stub
		Session session = null;
		try {
			ArrayList list = new ArrayList();
			session = HibernateUtils.getSession();
			session.beginTransaction();
			
			List userInfo = session.createSQLQuery("select * from Users where u_name='"+userName+"'").list();
			for (Iterator iter=userInfo.iterator(); iter.hasNext();) {
				Object[] obj = (Object[])iter.next();
				Users uif = new Users();
				uif.setUId((Integer) obj[0]);
				uif.setUName((String)obj[1]);
				uif.setPassword((String) obj[2]);
				uif.setName((String)obj[3]);
				uif.setEmail((String) obj[4]);
				uif.setSex((String)obj[5]);
				uif.setPhone((String)obj[6]);
				list.add(uif);
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
	public void insertUserInfo(Users user) {
		// TODO Auto-generated method stub
		Session session = null;
		try {
			session=HibernateUtils.getSession();
			session.beginTransaction();
			session.save(user);
			session.getTransaction().commit();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			session.getTransaction().rollback();
		}finally {
			HibernateUtils.closeSession(session);
		}
	}
}

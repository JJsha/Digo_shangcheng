package com.search.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;

import com.domain.Shangpin;
import com.utils.HibernateUtils;

public class SearchdaoImpl implements Searchdao {
	public List searchGoods(String whereSql) {
		// TODO Auto-generated method stub
		Session session = null;
		try {
			ArrayList list = new ArrayList();
			session = HibernateUtils.getSession();
			session.beginTransaction();
			
			List Goods = session.createSQLQuery(whereSql).list();
			for (Iterator iter=Goods.iterator(); iter.hasNext();) {
				Object[] obj = (Object[])iter.next();
				Shangpin Shangpin = new Shangpin();
				Shangpin.setSId((Integer) obj[0]);
				Shangpin.setSName((String)obj[1]);
				Shangpin.setSMoney((Double) obj[3]);
				Shangpin.setSDetails((String)obj[4]);
				Shangpin.setKucun((Integer) obj[5]);
				Shangpin.setImg((String)obj[6]);
				
				list.add(Shangpin);
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
}

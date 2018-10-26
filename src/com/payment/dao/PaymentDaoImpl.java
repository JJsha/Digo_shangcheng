package com.payment.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;


import com.domain.Ddetail;
import com.domain.DdetailId;
import com.domain.Dingdan;
import com.domain.Shangpin;
import com.utils.HibernateUtils;

public class PaymentDaoImpl implements PaymentDao {
	public List searchDD(String whereSql){
		Session session = null;
		try {
			ArrayList list = new ArrayList();
			session = HibernateUtils.getSession();
			session.beginTransaction();
			
			List dingdan = session.createSQLQuery(whereSql).list();
			for (Iterator iter=dingdan.iterator(); iter.hasNext();) {
				Object[] obj = (Object[])iter.next();
				Ddetail detail = new Ddetail();
				DdetailId DdetailId = new DdetailId();
				DdetailId.setDId((Integer)obj[0]);
				DdetailId.setSId((Integer)obj[1]);
				detail.setId(DdetailId);
				detail.setNumber((Integer)obj[2]);
				list.add(detail);
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
	public void createdd(Dingdan dingdan) {
			Session session = null;
			try {
				session = HibernateUtils.getSession();
				session.beginTransaction();
				
				session.createQuery("update Dingdan d set d.createtime=?,d.shName=?,d.phone=?,d.address=?,d.dstate=? where d.DId = ?")
						.setParameter(0, dingdan.getCreatetime())
						.setParameter(1, dingdan.getShName())
						.setParameter(2, dingdan.getPhone())
						.setParameter(3, dingdan.getAddress())
						.setParameter(4, dingdan.getDstate())
						.setParameter(5, dingdan.getDId())
						.executeUpdate();
				
				session.getTransaction().commit();
			}catch(Exception e) {
				e.printStackTrace();
				session.getTransaction().rollback();
			}finally {
				HibernateUtils.closeSession(session);
			}
		}
	public int searchddid(String whereSql){
		Session session = null;
		try {
			session = HibernateUtils.getSession();
			session.beginTransaction();
			 Query q = session.createQuery(whereSql);
			    if(q.iterate().hasNext()){
			    Dingdan D = (Dingdan)q.uniqueResult();
			    int Ddid=D.getDId();
			    return Ddid;
			    }
			    session.getTransaction().commit();
		}catch(Exception e) {
			e.printStackTrace();
			session.getTransaction().rollback();
		}finally {
			HibernateUtils.closeSession(session);
		}
		return 0;
	}
	public boolean updatakucun(String whereSql){
		Session session = null;
		try {
			session = HibernateUtils.getSession();
			session.beginTransaction();
			
			session.createQuery(whereSql)
					.executeUpdate();
			session.getTransaction().commit();
			return true;
		}catch(Exception e) {
			e.printStackTrace();
			session.getTransaction().rollback();
		}finally {
			HibernateUtils.closeSession(session);
		}
		return false;
	}
}

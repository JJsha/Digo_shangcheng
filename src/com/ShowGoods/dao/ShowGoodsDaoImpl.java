package com.ShowGoods.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.hibernate.Session;

import com.domain.*;
import com.utils.*;

public class ShowGoodsDaoImpl implements ShowGoodsDao {

	@Override
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

	@Override
	public void addcar(int uId, int sId, int count) {
		// TODO Auto-generated method stub
		Session session = HibernateUtils.getSession();
		try {
		session.beginTransaction();
		Car car=new Car();
		CarId carid =new CarId();
		carid.setSId(sId);
		carid.setUId(uId);
		car.setCCount(count);
		car.setId(carid);
		session.save(car);	
		session.getTransaction().commit();
		} catch (Exception e) {
		e.printStackTrace();
		session.getTransaction().rollback();
		} finally{
		HibernateUtils.closeSession(session);
		}
	}

	@Override
	public int searchCar(String whereSql) {
		// TODO Auto-generated method stub
		Session session = null;
		try {
			ArrayList list = new ArrayList();
			session = HibernateUtils.getSession();
			session.beginTransaction();
			
			List car = session.createSQLQuery(whereSql).list();
			if(car.iterator().hasNext())
				{Object[] obj = (Object[])car.iterator().next();
				  int count=(Integer) obj[2];
				  return count;
				}
			
		}catch(Exception e) {
			e.printStackTrace();
			session.getTransaction().rollback();
		}finally {
			HibernateUtils.closeSession(session);
		}
		return 0;
	}

	@Override
	public void updatecar(String whereSql) {
		// TODO Auto-generated method stub
		Session session = null;
		try {
			session = HibernateUtils.getSession();
			session.beginTransaction();
			
			session.createQuery(whereSql)
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
	public void addfavorites(int uId, int sId) {
		// TODO Auto-generated method stub
		Session session = HibernateUtils.getSession();
		try {
		session.beginTransaction();
		Favorites favorites=new Favorites();
		FavoritesId favoritesid =new FavoritesId();
		favoritesid.setSId(sId);
		favoritesid.setUId(uId);
		favorites.setId(favoritesid);
		session.save(favorites);	
		session.getTransaction().commit();
		} catch (Exception e) {
		e.printStackTrace();
		session.getTransaction().rollback();
		} finally{
		HibernateUtils.closeSession(session);
		}
	}

}

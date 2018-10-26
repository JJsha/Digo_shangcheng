package com.Collection.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;

import com.domain.*;
import com.utils.*;

public class CollectionDaoImpl implements CollectionDaoInterface {
	
	public List searchCollcetion(int Uid)
	{
		List list=new ArrayList();
		Session session = null;
		try {
			session = HibernateUtils.getSession();
			session.beginTransaction();
			
			
			List Fav = session.createQuery("from Favorites f where f.id.UId=?").setParameter(0,Uid).list();
			for (Iterator iter=Fav.iterator(); iter.hasNext();) {
				 Favorites favirous = (Favorites)iter.next();
				
				int sid=favirous.getId().getSId();
				 List shangpins=session.createQuery("from Shangpin where SId=?").setParameter(0,sid).list();
				   for(Iterator iter1=shangpins.iterator(); iter1.hasNext();){
					   Shangpin shangpin=(Shangpin)iter1.next();
					   int uid=favirous.getId().getUId();
				       String sname=shangpin.getSName();
				       Double smoney=shangpin.getSMoney();
				       String sdetails=shangpin.getSDetails();
				       String img=shangpin.getImg();
				
				
				CarDelete fd=new CarDelete();
				fd.setUId(uid);
				fd.setSId(sid);
				fd.setSName(sname);
				fd.setSMoney(smoney);
				fd.setSDetails(sdetails);
				fd.setImg(img);
				list.add(fd);
				}
			
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
	
	public int deletecollection(int uid,int sid){
		
		Session session = null;
		int rowN=0;
		try {
			session = HibernateUtils.getSession();
			session.beginTransaction();
			
			rowN=session.createQuery("delete from Favorites f where f.id.UId=? and f.id.SId=?")
					.setParameter(0,uid)
					.setParameter(1,sid)
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

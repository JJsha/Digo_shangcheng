package com.Car.dao;


import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.domain.Car;
import com.domain.CarDelete;

import com.domain.Ddetail;
import com.domain.DdetailId;
import com.domain.Dingdan;

import com.domain.Shangpin;


import com.utils.HibernateUtils;

public class CarDaoImpl implements CarDaoInterface {

	public List searchCar(int Uid){

		List list=new ArrayList();
		Session session = null;
		try {
			session = HibernateUtils.getSession();
			session.beginTransaction();
			
			List car = session.createQuery("from Car c where c.id.UId=?").setParameter(0,Uid).list();
			   for (Iterator iter=car.iterator(); iter.hasNext();) {
				Car cars = (Car)iter.next();
				int sid=cars.getId().getSId();
				  List shangpins=session.createQuery("from Shangpin where SId=?").setParameter(0,sid).list();
				   for(Iterator iter1=shangpins.iterator(); iter1.hasNext();){
				
				 Shangpin shangpin=(Shangpin)iter1.next();
				int ccount=cars.getCCount();
				int kucun=shangpin.getKucun();
				int uid=cars.getId().getUId();
				
				String sname=shangpin.getSName();
				Double smoney=shangpin.getSMoney();
				String sdetails=shangpin.getSDetails();
				String img=shangpin.getImg();
				
				CarDelete cd=new CarDelete();
				cd.setKucun(kucun);
				cd.setCCount(ccount);
				cd.setUId(uid);
				cd.setSId(sid);
				cd.setSName(sname);
				cd.setSMoney(smoney);
				cd.setSDetails(sdetails);
				cd.setImg(img);
				list.add(cd);
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
	
	public int deletecar(int uid,int sid){
		
		Session session = null;
		int rowN=0;
		try {
			session = HibernateUtils.getSession();
			session.beginTransaction();
			
			rowN=session.createQuery("delete from Car c where c.id.UId=? and c.id.SId=?")
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
	
	public int insert(String cuan,String cuan2,int uid){
		   String res1=cuan.trim();
		   String[] result1=res1.split(" ");
		   String res2=cuan2.trim();
		   String[] result2=res2.split(" ");
		   Date date1=new Date(System.currentTimeMillis());
		  
		   Session session = HibernateUtils.getSession();
			 int rowN=0;
			try {
					session.beginTransaction();
				    Query q = session.createQuery("from Dingdan where UId=? and dstate=?")
				    		.setParameter(0,uid).setParameter(1,"Œ¥ÕÍ…∆");
				    if(q.iterate().hasNext()){
				    Dingdan D = (Dingdan)q.uniqueResult();
				    int Ddid=D.getDId();
				    session.getTransaction().commit();
				    
				    session.beginTransaction();
				    session.createQuery("delete from Ddetail d  where d.id.DId=? ")
					.setParameter(0,Ddid)
					.executeUpdate();
				    session.getTransaction().commit();
				   
				    session.beginTransaction();
				    session.createQuery("delete from Dingdan  where UId=? and dstate=?")
					.setParameter(0,uid)
					.setParameter(1,"Œ¥ÕÍ…∆")
					.executeUpdate();
				    session.getTransaction().commit();
				    }
				    session.beginTransaction();
					Dingdan dd = new Dingdan();
					dd.setCreatetime(date1);
					dd.setDstate("Œ¥ÕÍ…∆");
					dd.setUId(uid);
					session.save(dd);
		            session.flush();
				    session.getTransaction().commit();
				   
				    
				     q = session.createQuery("from Dingdan order by DId desc");
				    q.setMaxResults(1);
				    Dingdan D = (Dingdan)q.uniqueResult();
				     int Ddid=D.getDId();
				  
				   
				   for(int i=0;i<result1.length;i++){
					   session.beginTransaction();
					   Ddetail detail=new Ddetail();
					   DdetailId  ddetailId=new  DdetailId();
					   ddetailId.setDId(Ddid);
					   ddetailId.setSId(Integer.parseInt(result1[i]));
					   detail.setId(ddetailId);
			           detail.setNumber(Integer.parseInt(result2[i]));
			           session.save(detail);
					   session.getTransaction().commit();
					   
				   }
				   
				   rowN=Ddid;
				   
				    
			} catch (Exception e) {
				e.printStackTrace();
				session.getTransaction().rollback();
			} finally{
				HibernateUtils.closeSession(session);
			}
			return rowN;
	}
	
}

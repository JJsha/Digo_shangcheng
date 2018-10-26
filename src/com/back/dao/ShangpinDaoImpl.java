package com.back.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.domain.Classes;
import com.domain.Shangpin;
import com.utils.HibernateUtils;

public class ShangpinDaoImpl implements ShangpinDao {

		Session session=HibernateUtils.getSession();     
	@Override
	public void insert(Shangpin shangpin) {
		// TODO Auto-generated method stub
		
		try{
            session.beginTransaction();
           
            shangpin.setSName(shangpin.getSName());
    		shangpin.setSMoney(shangpin.getSMoney());
    		shangpin.setKucun(shangpin.getKucun());
    		shangpin.setSDetails(shangpin.getSDetails());
    		shangpin.setImg(shangpin.getImg());   
    		shangpin.setCId(shangpin.getCId());
            session.save(shangpin);
            session.getTransaction().commit();
       
           }catch(Exception e){
               e.printStackTrace();
               session.getTransaction().rollback();
           }
           finally{
               HibernateUtils.closeSession(session);
           }
   }
	

	@Override
	public void update(Shangpin shangpin) {
		// TODO Auto-generated method stub
		 try{
             session.beginTransaction();
             //Shangpin n=(Shangpin) session.get(Shangpin.class, shangpin.getSId());

             String hql="update Shangpin shangpin set shangpin.SName=?,"
             		+ "shangpin.SMoney=?,shangpin.kucun=?,shangpin.SDetails=?,shangpin.img=?,"
             		+ "shangpin.CId=? where SId = ?";        
             
            session.createQuery(hql)
            .setParameter(0, shangpin.getSName())
            .setParameter(1, shangpin.getSMoney())
            .setParameter(2, shangpin.getKucun())
            .setParameter(3, shangpin.getSDetails())        
            .setParameter(4, shangpin.getImg())
            .setParameter(5, shangpin.getCId())
            .setParameter(6, shangpin.getSId())
            .executeUpdate();
            
            // session.saveOrUpdate(shangpin);
             //session.update(shangpin);
             session.getTransaction().commit();
        
            }catch(Exception e){
                e.printStackTrace();
                session.getTransaction().rollback();
            }
            finally{
                HibernateUtils.closeSession(session);
            }
	}

	@Override
	public void delete(Integer SId) {
		// TODO Auto-generated method stub
		try{
            session.beginTransaction();
            Shangpin n = (Shangpin) session.get(Shangpin.class, SId);
            session.delete(n);
            session.getTransaction().commit();
       
           }catch(Exception e){
               e.printStackTrace();
               session.getTransaction().rollback();
           }
           finally{
               HibernateUtils.closeSession(session);
           }
	}

	@Override
	public List<Shangpin> select() {
		// TODO Auto-generated method stub
		Transaction tx=null;
		List<Shangpin> list=null;
		String hql="";
		try{
			Session session=HibernateUtils.getSession();
			tx=session.beginTransaction();
			hql="from Shangpin";
			Query query=session.createQuery(hql);
			list=query.list();
			return list;
		}catch(Exception e){
			e.printStackTrace();
			tx.commit();
			return list;
		}finally{
			if(tx!=null){
				tx=null;
			}
		}
	}
	
	public List<Classes> selectClasses() {
		Transaction tx=null;
		List<Classes> list=null;
		String hql="";
		try{
			Session session=HibernateUtils.getSession();
			tx=session.beginTransaction();
			hql="from Classes";
			Query query=session.createQuery(hql);
			list=query.list();
			return list;
		}catch(Exception e){
			e.printStackTrace();
			tx.commit();
			return list;
		}finally{
			if(tx!=null){
				tx=null;
			}
		}
	}

	@Override
	public List<Shangpin> selectSid(Integer SId) {
		// TODO Auto-generated method stub
		Transaction tx=null;
		List<Shangpin> list=null;
		try{
			Session session=HibernateUtils.getSession();
			String hql="from Shangpin shangpin where shangpin.SId = ?";
			Query query=session.createQuery(hql);
			query.setInteger(0, SId);
			 list=query.list();
			 return list;
		}catch(Exception e){
			e.printStackTrace();
			tx.commit();
			return list;
		}finally{
			if(tx!=null){
				tx=null;
			}
		}
	}
	
	public Classes selectClasses(Integer CId){
		Transaction tx=null;
		Classes classes=null;
		try{
			Session session=HibernateUtils.getSession();
			tx=session.beginTransaction();
			classes=(Classes)session.get(Classes.class, CId);
			return classes;
		}catch(Exception e){
			e.printStackTrace();
			tx.commit();
			return classes;
		}finally{
			if(tx!=null){
				tx=null;
			}
		}
	}


	@Override
	public List<Classes> checkClasses(String sql) {
		// TODO Auto-generated method stub
		Classes classes=new Classes();
		Session session = null;
		session = HibernateUtils.getSession();
		session.beginTransaction();
		List list = session.createSQLQuery(sql).list();
		List<Classes> list1=new ArrayList<Classes>();
		for (Iterator iter=list.iterator(); iter.hasNext();) {
			Object[] obj = (Object[])iter.next();
			classes.setCId((Integer) obj[0]);
			classes.setCName((String) obj[1]);
			list1.add(classes);
		}
		return list1;
	}

}

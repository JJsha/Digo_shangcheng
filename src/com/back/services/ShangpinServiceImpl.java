package com.back.services;

import java.util.List;

import com.back.dao.ShangpinDao;
import com.back.dao.ShangpinDaoImpl;
import com.domain.Classes;
import com.domain.Shangpin;

public class ShangpinServiceImpl implements ShangpinService {

	ShangpinDao shangpinDao=new ShangpinDaoImpl();
	@Override
	public void insert(Shangpin shangpin) {
		// TODO Auto-generated method stub
		shangpinDao.insert(shangpin);
	}

	@Override
	public void update(Shangpin shangpin) {
		// TODO Auto-generated method stub
		shangpinDao.update(shangpin);
	}

	@Override
	public void delete(Integer SId) {
		// TODO Auto-generated method stub
		shangpinDao.delete(SId);
	}

	@Override
	public List<Shangpin> select() {
		// TODO Auto-generated method stub
		return shangpinDao.select();
	}

	@Override
	public  List<Shangpin> selectSid(Integer SId) {
		// TODO Auto-generated method stub
		return shangpinDao.selectSid(SId);
	}
	
	public List<Classes> selectClasses(){
		return shangpinDao.selectClasses();
	}
	
	public Classes selectClasses(Integer CId){
		return shangpinDao.selectClasses(CId);
	}

	@Override
	public List checkClasses(String sql) {
		// TODO Auto-generated method stub
		return shangpinDao.checkClasses(sql);
	}
}

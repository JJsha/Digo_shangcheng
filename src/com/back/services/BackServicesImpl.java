package com.back.services;

import java.util.List;

import com.back.dao.BackDao;
import com.back.dao.BackDaoImpl;
import com.domain.Classes;
import com.domain.Gly;
import com.domain.Shangpin;

public class BackServicesImpl implements BackServices {
	BackDao bd=new BackDaoImpl();

	@Override
	public Gly login(String whereSql) {
		// TODO Auto-generated method stub
		return bd.login(whereSql);
	}

	@Override
	public void addclasses(Classes classes) {
		// TODO Auto-generated method stub
		bd.addclasses(classes);
	}

	@Override
	public Classes checkclasses(String sql) {
		// TODO Auto-generated method stub
		return bd.checkclasses(sql);
	}

	@Override
	public List searchclasses(String sql) {
		// TODO Auto-generated method stub
		return bd.searchclasses(sql);
	}

	@Override
	public void delete(String sql) {
		// TODO Auto-generated method stub
		bd.delete(sql);
	}

	@Override
	public Shangpin checkShangpin(String sql) {
		// TODO Auto-generated method stub
		return bd.checkShangpin(sql);
	}

}

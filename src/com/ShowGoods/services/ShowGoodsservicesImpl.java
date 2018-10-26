package com.ShowGoods.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.ShowGoods.dao.*;

public class ShowGoodsservicesImpl implements ShowGoodsservices {
	@Autowired
	ShowGoodsDao ShowGoodsDao;
	
	public ShowGoodsDao getShowGoodsDao() {
		return ShowGoodsDao;
	}
	public void setShowGoodsDao(ShowGoodsDao showGoodsDao) {
		ShowGoodsDao = showGoodsDao;
	}
	@Override
	public List searchGoods(String whereSql) {
		
		return ShowGoodsDao.searchGoods(whereSql);
	}
	@Override
	public void addcar(int uId,int sId,int count) {
		// TODO Auto-generated method stub
		ShowGoodsDao.addcar(uId, sId, count);
	}
	@Override
	public int searchCar(String whereSql) {
		// TODO Auto-generated method stub
		return ShowGoodsDao.searchCar(whereSql);
	}
	@Override
	public void updatecar(String whereSql) {
		// TODO Auto-generated method stub
		ShowGoodsDao.updatecar(whereSql);
	}
	@Override
	public void addfavorites(int uId, int sId) {
		// TODO Auto-generated method stub
		ShowGoodsDao.addfavorites(uId, sId);
	}
	

}

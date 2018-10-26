package com.Car.services;
import java.util.List;

import com.Car.dao.CarDaoInterface;

public class CarServicesImpl implements CarServicesInterface {
	CarDaoInterface carDao;
	
	public CarDaoInterface getCarDao() {
		return carDao;
	}

	public void setCarDao(CarDaoInterface carDao) {
		this.carDao = carDao;
	}

	public List searchCar(int Uid){
		return carDao.searchCar(Uid);	
	}
	public int deleteCar(int uid,int sid){
		return carDao.deletecar(uid, sid);
	}
	public int insert(String cuan,String cuan2,int uid){
		
		return carDao.insert(cuan,cuan2,uid);
	}
}

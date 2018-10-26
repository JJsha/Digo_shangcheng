package com.Car.dao;

import java.util.List;

public interface CarDaoInterface {
	   public List searchCar(int Uid);
	   public int deletecar(int uid,int sid);
	   public int insert(String cuan,String cuan2,int uid);
}

package com.Car.services;

import java.util.List;

public interface CarServicesInterface {
	public List searchCar(int Uid);
	public int deleteCar(int uid,int sid);
	public int insert(String cuan,String cuan2,int uid);
}

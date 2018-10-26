package com.mainPage.services;

import java.util.List;

import com.domain.Users;
import com.mainPage.dao.MainPageDao;

public class MainPageServiceImp implements MainPageService {
	
	MainPageDao MainPageDao;
	
	
	public MainPageDao getMainPageDao() {
		return MainPageDao;
	}


	public void setMainPageDao(MainPageDao mainPageDao) {
		MainPageDao = mainPageDao;
	}


	@Override
	public List getUserName(String userName) {
		// TODO Auto-generated method stub
		return MainPageDao.getUserName(userName);
	}

	@Override
	public void insertUserInfo(Users user) {
		// TODO Auto-generated method stub
		MainPageDao.insertUserInfo(user);
	}
	
}

package com.mainPage.dao;

import java.util.List;

import com.domain.Users;

public interface MainPageDao {
	public List getUserName(String userName);
	public void insertUserInfo(Users user) ;
}

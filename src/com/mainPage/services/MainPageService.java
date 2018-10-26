package com.mainPage.services;

import java.util.List;

import com.domain.Users;

public interface MainPageService {
	public List getUserName(String userName);
	public void insertUserInfo(Users user) ;
}

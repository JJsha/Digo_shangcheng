package com.mainPage.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.domain.Users;
import com.mainPage.services.MainPageService;
import com.opensymphony.xwork2.ActionSupport;

public class Digo_LogupAction extends ActionSupport{
	public String userName;
	public String password;
	public String trueName;
	public String email;
	public String sex;
	public String phone;
	
	MainPageService mainPageService;
	public MainPageService getMainPageService() {
		return mainPageService;
	}
	public void setMainPageService(MainPageService mainPageService) {
		this.mainPageService = mainPageService;
	}
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getTrueName() {
		return trueName;
	}
	public void setTrueName(String trueName) {
		this.trueName = trueName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String LogupFB() {
		List uif = mainPageService.getUserName(getUserName().trim());
		if(!uif.isEmpty()){
			HttpServletRequest req = ServletActionContext.getRequest();
			req.setAttribute("exist","用户名已存在!");
			return "exist";
		}else{
			Users userInfo=new Users();
			userInfo.setUName(getUserName().trim());
			userInfo.setPassword(getPassword().trim());
			userInfo.setName(getTrueName().trim());
			userInfo.setEmail(getEmail().trim());
			userInfo.setPhone(getPhone().trim());
			mainPageService.insertUserInfo(userInfo);
			HttpServletRequest req = ServletActionContext.getRequest();
			req.setAttribute("ok","注册成功!");
			return "ok";
		}
	}
}

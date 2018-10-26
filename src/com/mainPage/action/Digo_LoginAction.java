package com.mainPage.action;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;

import com.domain.Users;
import com.mainPage.services.MainPageService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class Digo_LoginAction extends ActionSupport{
	public String userName;
	public String password;
	 private String prePage;
	public String getPrePage() {
		return prePage;
	}

	public void setPrePage(String prePage) {
		this.prePage = prePage;
	}

	@Autowired
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

	public String loginFB(){
		List uif =mainPageService.getUserName(getUserName());
		if(!uif.isEmpty()){
			Users users=(Users)uif.get(0);
			if(users.getUName().trim().equals(getUserName().trim())&&users.getPassword().trim().equals(getPassword().trim())){
				HttpServletRequest request = ServletActionContext.getRequest();  
				HttpSession sessions = request.getSession();
				  prePage= (String) sessions.getAttribute("prePage");//清除session中的数据
				  
				   
    			sessions.setAttribute("userName", getUserName());
    			sessions.setAttribute("uid", users.getUId());
    			if(sessions.getAttribute("prePage")==null){
    				return "main";
    			}
				return "ok";
			}else{
				HttpServletRequest req = ServletActionContext.getRequest();
				req.setAttribute("error","用户名或密码错误!");
				return "login";
			}
			
		}else{
			HttpServletRequest req = ServletActionContext.getRequest();
			req.setAttribute("empty","用户名不存在!");
			return "empty";
		}
	}
}

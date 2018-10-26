package com.back.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.domain.*;
import com.back.services.*;

public class LoginAction extends ActionSupport {
	private String GName;
	private String password;
	public String getGName() {
		return GName;
	}
	public void setGName(String gName) {
		GName = gName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String login(){
		Gly gly=new Gly();
		BackServicesImpl bs=new BackServicesImpl();
		gly = bs.login("select * from Gly where g_name='"+this.GName+"'");
		if(this.GName.equals(gly.getGName())&&this.password.equals(gly.getPassword())){
			ActionContext.getContext().put("gly", gly);
			return "success";
		}else{
			addActionMessage("<script>alert('用户名或密码错误！');</script>");
			return "input";
		}
		
	}
	
}

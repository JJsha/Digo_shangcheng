package com.Person.Action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.Person.services.PersonServicesInterface;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class PersonAction extends ActionSupport {
     PersonServicesInterface personServices;
     private Integer UId;
 	private String UName;
 	private String password;
 	private String name;
 	private String email;
 	private String sex;
 	private String phone;
	public PersonServicesInterface getPersonServices() {
		return personServices;
	}
	public void setPersonServices(PersonServicesInterface personServices) {
		this.personServices = personServices;
	}
	public Integer getUId() {
		return UId;
	}
	public void setUId(Integer uId) {
		UId = uId;
	}
	public String getUName() {
		return UName;
	}
	public void setUName(String uName) {
		UName = uName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	
	public String person(){
		HttpServletRequest request = ServletActionContext.getRequest();  
		HttpSession sessions = request.getSession();
		int uid = (Integer) sessions.getAttribute("uid");
		List list=personServices.searchPerson(uid);
		
		if(list!=null)
		{
		    ActionContext.getContext().put("list",list);
			return SUCCESS;
		}else{
			return ERROR;
		}
	}
	
	public String update(){
		HttpServletRequest request = ServletActionContext.getRequest();  
		HttpSession sessions = request.getSession();
		int uid = (Integer) sessions.getAttribute("uid");
	   if(password!=null){
         personServices.Update(uid,password);
         List list=personServices.searchPerson(uid);
         ActionContext.getContext().put("list",list);
		   return SUCCESS;
	    }else{
	    	
	    	return ERROR;
	    }
	    
	}
}

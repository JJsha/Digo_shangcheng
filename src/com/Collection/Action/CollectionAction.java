package com.Collection.Action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.Collection.services.*;
import com.domain.Classes;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
public class CollectionAction extends ActionSupport {
 CollectionServicesInterface collectionServices;
 
 private Integer SId;
	private Classes classes;
	private String SName;
	private String CName;
	private Double SMoney;
	private String SDetails;
	private Integer kucun;
	private String img;
 
public Integer getSId() {
		return SId;
	}

	public void setSId(Integer sId) {
		SId = sId;
	}

	public Classes getClasses() {
		return classes;
	}

	public void setClasses(Classes classes) {
		this.classes = classes;
	}

	public String getSName() {
		return SName;
	}

	public void setSName(String sName) {
		SName = sName;
	}

	public String getCName() {
		return CName;
	}

	public void setCName(String cName) {
		CName = cName;
	}

	public Double getSMoney() {
		return SMoney;
	}

	public void setSMoney(Double sMoney) {
		SMoney = sMoney;
	}

	public String getSDetails() {
		return SDetails;
	}

	public void setSDetails(String sDetails) {
		SDetails = sDetails;
	}

	public Integer getKucun() {
		return kucun;
	}

	public void setKucun(Integer kucun) {
		this.kucun = kucun;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}



public CollectionServicesInterface getCollectionServices() {
	return collectionServices;
}

public void setCollectionServices(CollectionServicesInterface collectionServices) {
	this.collectionServices = collectionServices;
}

public String collect(){
	HttpServletRequest request = ServletActionContext.getRequest();  
	HttpSession sessions = request.getSession();
	int uid = (Integer) sessions.getAttribute("uid");
	  List list=collectionServices.searchCollection(uid);
	     if(list!=null){
	     
	     ActionContext.getContext().put("list",list);
	     return SUCCESS;
	     }else{
	    	 
	    	 return ERROR;
	     }
}


}

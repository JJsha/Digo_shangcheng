package com.Car.Action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.Car.services.CarServicesInterface;
import com.domain.Classes;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class CarAction extends ActionSupport {
	CarServicesInterface carServices;
	private Integer UId;
	private Integer CCount;
	public Integer getCCount() {
		return CCount;
	}
	public void setCCount(Integer cCount) {
		CCount = cCount;
	}
	public Integer getUId() {
		return UId;
	}
	public void setUId(Integer uId) {
		UId = uId;
	}

	private Integer SId;
	private Classes classes;
	private String SName;
	private String CName;
	private Double SMoney;
	private String SDetails;
	private Integer kucun;
	private String img;
	public CarServicesInterface getCarServices() {
		return carServices;
	}
	public void setCarServices(CarServicesInterface carServices) {
		this.carServices = carServices;
	}
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
	
	public String car(){
		HttpServletRequest request = ServletActionContext.getRequest();  
		HttpSession sessions = request.getSession();
		
		int uid = (Integer) sessions.getAttribute("uid");
		List list=carServices.searchCar(uid);
		
		if(list!=null)
		{
		    ActionContext.getContext().put("list",list);
			return SUCCESS;
		}else{
			return ERROR;
		}
		
	}
	
	
}

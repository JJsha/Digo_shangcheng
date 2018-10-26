package com.Collection.Action;

import java.util.List;

import com.Collection.services.CollectionServicesInterface;
import com.domain.Classes;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class DeleteCollectionAction extends ActionSupport {
	CollectionServicesInterface collectionServices;
	public CollectionServicesInterface getCollectionServices() {
		return collectionServices;
	}
	public void setCollectionServices(CollectionServicesInterface collectionServices) {
		this.collectionServices = collectionServices;
	}
	
	private Integer UId;
	private Integer SId;
	private Classes classes;
	private String SName;
	private String CName;
	private Double SMoney;
	private String SDetails;
	private Integer kucun;
	private String img;
	public Integer getUId() {
		return UId;
	}
	public void setUId(Integer uId) {
		UId = uId;
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
	
	public String deletecollection(){
		if(SId!=0&&UId!=0){
			collectionServices.deleteCollection(UId,SId);
			List list=collectionServices.searchCollection(1);
			 ActionContext.getContext().put("list",list);
			return SUCCESS;
		}else{
			
			return ERROR;
		}
	}
	
}

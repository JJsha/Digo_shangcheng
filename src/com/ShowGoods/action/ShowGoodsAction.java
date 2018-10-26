package com.ShowGoods.action;


import java.util.List;

import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.ShowGoods.services.*;
public class ShowGoodsAction extends ActionSupport {
	private Integer SId;

	private String SName;
	private Double SMoney;
	private String SDetails;
	private Integer kucun;
	private Integer count;
	private String img;
	
	@Autowired
	ShowGoodsservices ShowGoodsservices;
	public Integer getCount() {
		return count;
	}
	public void setCount(Integer count) {
		this.count = count;
	}
	public ShowGoodsservices getShowGoodsservices() {
		return ShowGoodsservices;
	}
	public void setShowGoodsservices(ShowGoodsservices showGoodsservices) {
		ShowGoodsservices = showGoodsservices;
	}

	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	public Integer getSId() {
		return SId;
	}
	public void setSId(Integer sId) {
		SId = sId;
	}
	public String getSName() {
		return SName;
	}
	public void setSName(String sName) {
		SName = sName;
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
	
	public String getGoods(){
		List shangpin=ShowGoodsservices.searchGoods("select * from Shangpin where s_id="+this.SId);
		ActionContext.getContext().put("list", shangpin);
		return "success";
	}
	public String addcar(){
		HttpServletRequest request = ServletActionContext.getRequest();  
		HttpSession sessions = request.getSession();
		int uid = (Integer) sessions.getAttribute("uid");
		int count=ShowGoodsservices.searchCar("select * from Car where s_id="+this.SId+"and u_id="+uid);
		List shangpin=ShowGoodsservices.searchGoods("select * from Shangpin where s_id="+this.SId);
			if((count+this.count)>5)
			{
				ActionContext.getContext().put("list", shangpin);
				request.setAttribute("error", "error");  
			    return "max";
	
			}
			else if(count!=0)
			{
				ShowGoodsservices.updatecar("update Car  set c_count=c_count+"+this.count+"where s_id="+this.SId+"and u_id="+uid);
			}
			else
			{
				ShowGoodsservices.addcar(uid,this.SId,this.count);
			}
			List other=ShowGoodsservices.searchGoods("SELECT TOP 5 * FROM Shangpin order by newid()");
			ActionContext.getContext().put("other", other);
			ActionContext.getContext().put("addcarsuccess", shangpin);
		return "success";
		
	}
	public String addfavorites(){
		HttpServletRequest request = ServletActionContext.getRequest();  
		HttpSession sessions = request.getSession();
		int uid = (Integer) sessions.getAttribute("uid");
		ShowGoodsservices.addfavorites(uid,this.SId);
		return "success";
	}
}

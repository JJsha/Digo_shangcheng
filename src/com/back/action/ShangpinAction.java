package com.back.action;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.hibernate.Session;

import com.domain.Classes;
import com.domain.Shangpin;
import com.back.services.ShangpinServiceImpl;
import com.back.services.ShangpinService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class ShangpinAction extends ActionSupport {
	private Shangpin shangpin=new Shangpin();
	private Classes classes=new Classes();
	private ShangpinService shangpinService=new ShangpinServiceImpl();
	private Integer SId;
	private Integer CId;
	private List<Classes> clist;
	private String SName;
	private Double SMoney;
	private String SDetails;
	private Integer kucun;
	private String img;
	private String CName;
	private String CDetail;
	
	//查询所有
	public String query(){
		List<Shangpin> list=shangpinService.select();
		if(list.size()>0&&list!=null){
			ActionContext.getContext().put("allshangpin", list);
			return "query_success";
		}else{
			return INPUT;
		}
	}
	//跳转到添加
	public String addInput(){
		
		return "addInput";
	}
	//添加
	public String add(){
		shangpin.setSId(SId);
		shangpin.setSName(SName);
		shangpin.setSMoney(SMoney);
		shangpin.setKucun(kucun);
		shangpin.setSDetails(SDetails);
		shangpin.setImg(img);	
		shangpin.setCId(CId);	
		shangpinService.insert(shangpin);
		return "add";
		
	}
	//删除
	public String delete(){
		shangpinService.delete(SId);
		return "del";
	} 
	//跳转到更新
	public String toup(){
		List<Shangpin> list=shangpinService.selectSid(SId);
		if(list.size()>0&&list!=null){
			ActionContext.getContext().put("allshangpin", list);
			return "toup";
		}else{
			return INPUT;
		}

	}
	//更新
	public String update(){
		shangpin.setSId(SId);
		shangpin.setSName(SName);
		shangpin.setSMoney(SMoney);
		shangpin.setKucun(kucun);
		shangpin.setSDetails(SDetails);
		shangpin.setImg(img);	
		shangpin.setCId(CId);
		shangpinService.update(shangpin);		
		return "up";
	}
	//详细数据
	public String news(){
		List<Shangpin> list= shangpinService.selectSid(SId);
		if(list.size()>0&&list!=null){
			ActionContext.getContext().put("allshangpin", list);
			return "news";
		}else{
			return INPUT;
		}
	}
	public String checkClasses(){
		ArrayList<Classes> list=new ArrayList<Classes>();
		list = (ArrayList<Classes>) shangpinService.checkClasses("select * from Classes");
		ActionContext.getContext().put("list", list);
		return "success";
	}
	
	public Integer getSId() {
		return SId;
	}



	public void setSId(Integer sId) {
		SId = sId;
	}



	public Integer getCId() {
		return CId;
	}



	public void setCId(Integer cId) {
		CId = cId;
	}



	public Shangpin getShangpin() {
		return shangpin;
	}



	public void setShangpin(Shangpin shangpin) {
		this.shangpin = shangpin;
	}



	public Classes getClasses() {
		return classes;
	}



	public void setClasses(Classes classes) {
		this.classes = classes;
	}



	public ShangpinService getShangpinService() {
		return shangpinService;
	}



	public void setShangpinService(ShangpinService shangpinService) {
		this.shangpinService = shangpinService;
	}
	public List<Classes> getClist() {
		return clist;
	}
	public void setClist(List<Classes> clist) {
		this.clist = clist;
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
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	public String getCName() {
		return CName;
	}
	public void setCName(String cName) {
		CName = cName;
	}
	public String getCDetail() {
		return CDetail;
	}
	public void setCDetail(String cDetail) {
		CDetail = cDetail;
	}
	
	
}

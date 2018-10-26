package com.back.action;

import java.util.List;

import com.back.services.BackServices;
import com.back.services.BackServicesImpl;
import com.domain.Classes;
import com.domain.Shangpin;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class ClassesAction extends ActionSupport {
	private Integer CId;
	private String CName;
	private String CDetail;
	BackServices bs=new BackServicesImpl();
	public Integer getCId() {
		return CId;
	}
	public void setCId(Integer cId) {
		CId = cId;
	}
	public BackServices getBs() {
		return bs;
	}
	public void setBs(BackServices bs) {
		this.bs = bs;
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
	public String addclasses(){
		Classes classes=new Classes();
		String check=bs.checkclasses("select * from Classes where c_name='"+this.CName+"'").getCName();
		if(check!=null){
			addActionMessage("<script>alert('品牌"+this.CName+"已存在！');</script>"); 
			return "input";
		}else{
			classes.setCName(this.CName);
			classes.setCDetail(this.CDetail);
			bs.addclasses(classes);
			addActionMessage("<script>alert('品牌"+this.CName+"添加成功！');</script>");
			return "success";
		}
	}
	public String showclasses(){
		List classes=bs.searchclasses("select * from Classes");
		ActionContext.getContext().put("list", classes);
		return "success";
	}
	public String deleteclasses(){
		Integer check=bs.checkShangpin("select * from Shangpin where c_id="+this.CId).getCId();
		this.CName=bs.checkclasses("select * from Classes where c_id='"+this.CId+"'").getCName();
		if(check!=null){
			addActionMessage("<script>alert('删除品牌"+this.CName+"失败！');</script>");
			return "input";
		}else{
			bs.delete("delete from Classes where c_id="+this.CId);
			return "success";
		}
	}

}

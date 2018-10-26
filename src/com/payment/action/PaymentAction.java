package com.payment.action;


import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;


import com.domain.Ddetail;
import com.domain.Dingdan;
import com.domain.Shangpin;
import com.domain.payment;
import com.opensymphony.xwork2.ActionContext;
import com.payment.services.*;
public class PaymentAction {
	private Integer DId;
	private Date createtime;
	private String shName;
	private String phone;
	private String address;
	private String dstate;
	private Integer UId;
	private Integer SId;
	private Integer number;
	@Autowired
	Paymentservices Paymentservices;
	
	public Integer getSId() {
		return SId;
	}
	public void setSId(Integer sId) {
		SId = sId;
	}
	public Integer getNumber() {
		return number;
	}
	public void setNumber(Integer number) {
		this.number = number;
	}
	public Paymentservices getPaymentservices() {
		return Paymentservices;
	}
	public void setPaymentservices(Paymentservices paymentservices) {
		Paymentservices = paymentservices;
	}
	public Integer getDId() {
		return DId;
	}
	public void setDId(Integer dId) {
		DId = dId;
	}
	public Date getCreatetime() {
		return createtime;
	}
	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}
	
	public String getShName() {
		return shName;
	}
	public void setShName(String shName) {
		this.shName = shName;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getDstate() {
		return dstate;
	}
	public void setDstate(String dstate) {
		this.dstate = dstate;
	}
	public Integer getUId() {
		return UId;
	}
	public void setUId(Integer uId) {
		UId = uId;
	}
	public String getgoods(){
		HttpServletRequest request = ServletActionContext.getRequest();  
		HttpSession sessions = request.getSession();
		int uid = (Integer) sessions.getAttribute("uid");
		int did=Paymentservices.searchddid("from Dingdan where UId="+uid+" and dstate='Î´ÍêÉÆ'");
		List dingdan=Paymentservices.searchDD("select * from ddetail where d_id="+did);
		ArrayList goods = new ArrayList();
		for (Iterator iter=dingdan.iterator(); iter.hasNext();) {
			Ddetail detail = (Ddetail) iter.next();
			payment goodsmsg=new payment();
			List shangpin=Paymentservices.searchGoods("select * from Shangpin where s_id="+detail.getId().getSId());
			Shangpin sp = (Shangpin) shangpin.iterator().next();
			goodsmsg.setDId(did);
			goodsmsg.setSName(sp.getSName());
			goodsmsg.setCount(detail.getNumber());
			goodsmsg.setSMoney(sp.getSMoney());
			Double sum=detail.getNumber()*sp.getSMoney();
			goodsmsg.setImg(sp.getImg());
			goodsmsg.setSum(sum);
			goodsmsg.setSId(sp.getSId());
			goods.add(goodsmsg);
		}
		ActionContext.getContext().put("goods", goods);
		return "success";
	}
	public String createdd(){
	
		Dingdan Dingdan=new Dingdan();
		Dingdan.setDId(this.DId);
		Dingdan.setAddress(this.address);
		Dingdan.setCreatetime(new Date());
		Dingdan.setDstate("´ý·¢»õ");
		Dingdan.setPhone(this.phone);
		Dingdan.setShName(this.shName);
		List dingdan=Paymentservices.searchDD("select * from ddetail where d_id="+this.DId);
		for (Iterator iter=dingdan.iterator(); iter.hasNext();) {
			Ddetail detail = (Ddetail) iter.next();
			Shangpin shangpin=(Shangpin)Paymentservices.searchGoods("select * from Shangpin where s_id="+detail.getId().getSId()).iterator().next();
			if(shangpin.getKucun()<detail.getNumber()){
				return "error";
			}
			else
			Paymentservices.updatakucun("update Shangpin s set s.kucun=s.kucun-"+detail.getNumber()+" where s.SId ="+detail.getId().getSId());
		}
		Paymentservices.createdd(Dingdan);
		
		return "success";
	}
}

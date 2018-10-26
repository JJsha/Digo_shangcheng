package com.domain;

import java.util.Date;

/**
 * Dingdan entity. @author MyEclipse Persistence Tools
 */

public class Dingdan implements java.io.Serializable {

	// Fields

	private Integer DId;
	private Date createtime;
	private String shName;
	private String phone;
	private String address;
	private String dstate;
	private Integer UId;

	// Constructors

	/** default constructor */
	public Dingdan() {
	}

	/** minimal constructor */
	public Dingdan(Integer DId, String dstate, Integer UId) {
		this.DId = DId;
		this.dstate = dstate;
		this.UId = UId;
	}

	/** full constructor */
	public Dingdan(Integer DId, Date createtime, String shName, String phone, String address, String dstate,
			Integer UId) {
		this.DId = DId;
		this.createtime = createtime;
		this.shName = shName;
		this.phone = phone;
		this.address = address;
		this.dstate = dstate;
		this.UId = UId;
	}

	// Property accessors

	public Integer getDId() {
		return this.DId;
	}

	public void setDId(Integer DId) {
		this.DId = DId;
	}

	public Date getCreatetime() {
		return this.createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

	public String getShName() {
		return this.shName;
	}

	public void setShName(String shName) {
		this.shName = shName;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDstate() {
		return this.dstate;
	}

	public void setDstate(String dstate) {
		this.dstate = dstate;
	}

	public Integer getUId() {
		return this.UId;
	}

	public void setUId(Integer UId) {
		this.UId = UId;
	}

}
package com.domain;

/**
 * Users entity. @author MyEclipse Persistence Tools
 */

public class Users implements java.io.Serializable {

	// Fields

	private Integer UId;
	private String UName;
	private String password;
	private String name;
	private String email;
	private String sex;
	private String phone;

	// Constructors

	/** default constructor */
	public Users() {
	}

	/** minimal constructor */
	public Users(Integer UId, String UName, String password, String name) {
		this.UId = UId;
		this.UName = UName;
		this.password = password;
		this.name = name;
	}

	/** full constructor */
	public Users(Integer UId, String UName, String password, String name, String email, String sex, String phone) {
		this.UId = UId;
		this.UName = UName;
		this.password = password;
		this.name = name;
		this.email = email;
		this.sex = sex;
		this.phone = phone;
	}

	// Property accessors

	public Integer getUId() {
		return this.UId;
	}

	public void setUId(Integer UId) {
		this.UId = UId;
	}

	public String getUName() {
		return this.UName;
	}

	public void setUName(String UName) {
		this.UName = UName;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSex() {
		return this.sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

}
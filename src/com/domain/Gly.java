package com.domain;

/**
 * Gly entity. @author MyEclipse Persistence Tools
 */

public class Gly implements java.io.Serializable {

	// Fields

	private Integer GId;
	private String GName;
	private String password;

	// Constructors

	/** default constructor */
	public Gly() {
	}

	/** full constructor */
	public Gly(Integer GId, String GName, String password) {
		this.GId = GId;
		this.GName = GName;
		this.password = password;
	}

	// Property accessors

	public Integer getGId() {
		return this.GId;
	}

	public void setGId(Integer GId) {
		this.GId = GId;
	}

	public String getGName() {
		return this.GName;
	}

	public void setGName(String GName) {
		this.GName = GName;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
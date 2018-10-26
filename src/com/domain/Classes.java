package com.domain;

/**
 * Classes entity. @author MyEclipse Persistence Tools
 */

public class Classes implements java.io.Serializable {

	// Fields

	private Integer CId;
	private String CName;
	private String CDetail;

	// Constructors

	/** default constructor */
	public Classes() {
	}

	/** minimal constructor */
	public Classes(Integer CId, String CName) {
		this.CId = CId;
		this.CName = CName;
	}

	/** full constructor */
	public Classes(Integer CId, String CName, String CDetail) {
		this.CId = CId;
		this.CName = CName;
		this.CDetail = CDetail;
	}

	// Property accessors

	public Integer getCId() {
		return this.CId;
	}

	public void setCId(Integer CId) {
		this.CId = CId;
	}

	public String getCName() {
		return this.CName;
	}

	public void setCName(String CName) {
		this.CName = CName;
	}

	public String getCDetail() {
		return this.CDetail;
	}

	public void setCDetail(String CDetail) {
		this.CDetail = CDetail;
	}

}
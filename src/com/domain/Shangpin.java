package com.domain;

/**
 * Shangpin entity. @author MyEclipse Persistence Tools
 */

public class Shangpin implements java.io.Serializable {

	// Fields

	private Integer SId;
	private String SName;
	private Integer CId;
	private Double SMoney;
	private String SDetails;
	private Integer kucun;
	private String img;

	// Constructors

	/** default constructor */
	public Shangpin() {
	}

	/** minimal constructor */
	public Shangpin(Integer SId, String SName, Integer CId, Double SMoney, Integer kucun, String img) {
		this.SId = SId;
		this.SName = SName;
		this.CId = CId;
		this.SMoney = SMoney;
		this.kucun = kucun;
		this.img = img;
	}

	/** full constructor */
	public Shangpin(Integer SId, String SName, Integer CId, Double SMoney, String SDetails, Integer kucun, String img) {
		this.SId = SId;
		this.SName = SName;
		this.CId = CId;
		this.SMoney = SMoney;
		this.SDetails = SDetails;
		this.kucun = kucun;
		this.img = img;
	}

	// Property accessors

	public Integer getSId() {
		return this.SId;
	}

	public void setSId(Integer SId) {
		this.SId = SId;
	}

	public String getSName() {
		return this.SName;
	}

	public void setSName(String SName) {
		this.SName = SName;
	}

	public Integer getCId() {
		return this.CId;
	}

	public void setCId(Integer CId) {
		this.CId = CId;
	}

	public Double getSMoney() {
		return this.SMoney;
	}

	public void setSMoney(Double SMoney) {
		this.SMoney = SMoney;
	}

	public String getSDetails() {
		return this.SDetails;
	}

	public void setSDetails(String SDetails) {
		this.SDetails = SDetails;
	}

	public Integer getKucun() {
		return this.kucun;
	}

	public void setKucun(Integer kucun) {
		this.kucun = kucun;
	}

	public String getImg() {
		return this.img;
	}

	public void setImg(String img) {
		this.img = img;
	}

}
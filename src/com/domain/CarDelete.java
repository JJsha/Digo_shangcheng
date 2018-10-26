package com.domain;

public class CarDelete {
	private Integer SId;
	private Classes classes;
	private String SName;
	private String flag;
	private Double SMoney;
	private String SDetails;
	private Integer kucun;
	private String img;
	private Integer UId;
	private Integer CCount;
	
	public Integer getCCount() {
		return CCount;
	}
	public void setCCount(Integer cCount) {
		CCount = cCount;
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
	public String getFlag() {
		return flag;
	}
	public void setFlag(String flag) {
		this.flag = flag;
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
	public Integer getUId() {
		return UId;
	}
	public void setUId(Integer uId) {
		UId = uId;
	}
}

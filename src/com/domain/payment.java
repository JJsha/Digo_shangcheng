package com.domain;

public class payment {
	private String SName;
	private Double SMoney;
	private Integer count;
	private Double Sum;
	private String img;
	private Integer SId;
	private Integer DId;
	
	public Integer getDId() {
		return DId;
	}
	public void setDId(Integer dId) {
		DId = dId;
	}
	public Integer getSId() {
		return SId;
	}
	public void setSId(Integer sId) {
		SId = sId;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
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
	public Integer getCount() {
		return count;
	}
	public void setCount(Integer count) {
		this.count = count;
	}
	public Double getSum() {
		return Sum;
	}
	public void setSum(Double sum) {
		Sum = sum;
	}
}

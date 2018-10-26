package com.domain;

/**
 * Car entity. @author MyEclipse Persistence Tools
 */

public class Car implements java.io.Serializable {

	// Fields

	private CarId id;
	private Integer CCount;

	// Constructors

	/** default constructor */
	public Car() {
	}

	/** full constructor */
	public Car(CarId id, Integer CCount) {
		this.id = id;
		this.CCount = CCount;
	}

	// Property accessors

	public CarId getId() {
		return this.id;
	}

	public void setId(CarId id) {
		this.id = id;
	}

	public Integer getCCount() {
		return this.CCount;
	}

	public void setCCount(Integer CCount) {
		this.CCount = CCount;
	}

}
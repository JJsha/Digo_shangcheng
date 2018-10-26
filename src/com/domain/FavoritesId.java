package com.domain;

/**
 * FavoritesId entity. @author MyEclipse Persistence Tools
 */

public class FavoritesId implements java.io.Serializable {

	// Fields

	private Integer UId;
	private Integer SId;

	// Constructors

	/** default constructor */
	public FavoritesId() {
	}

	/** full constructor */
	public FavoritesId(Integer UId, Integer SId) {
		this.UId = UId;
		this.SId = SId;
	}

	// Property accessors

	public Integer getUId() {
		return this.UId;
	}

	public void setUId(Integer UId) {
		this.UId = UId;
	}

	public Integer getSId() {
		return this.SId;
	}

	public void setSId(Integer SId) {
		this.SId = SId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof FavoritesId))
			return false;
		FavoritesId castOther = (FavoritesId) other;

		return ((this.getUId() == castOther.getUId())
				|| (this.getUId() != null && castOther.getUId() != null && this.getUId().equals(castOther.getUId())))
				&& ((this.getSId() == castOther.getSId()) || (this.getSId() != null && castOther.getSId() != null
						&& this.getSId().equals(castOther.getSId())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getUId() == null ? 0 : this.getUId().hashCode());
		result = 37 * result + (getSId() == null ? 0 : this.getSId().hashCode());
		return result;
	}

}
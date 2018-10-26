package com.domain;

/**
 * Favorites entity. @author MyEclipse Persistence Tools
 */

public class Favorites implements java.io.Serializable {

	// Fields

	private FavoritesId id;

	// Constructors

	/** default constructor */
	public Favorites() {
	}

	/** full constructor */
	public Favorites(FavoritesId id) {
		this.id = id;
	}

	// Property accessors

	public FavoritesId getId() {
		return this.id;
	}

	public void setId(FavoritesId id) {
		this.id = id;
	}

}
package com.kate.app.model;

/**
 * AbstractStarVedio entity provides the base persistence definition of the
 * StarVedio entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractStarVedio implements java.io.Serializable {

	// Fields

	private Integer id;
	private String vedio;

	// Constructors

	/** default constructor */
	public AbstractStarVedio() {
	}

	/** full constructor */
	public AbstractStarVedio(String vedio) {
		this.vedio = vedio;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getVedio() {
		return this.vedio;
	}

	public void setVedio(String vedio) {
		this.vedio = vedio;
	}

}
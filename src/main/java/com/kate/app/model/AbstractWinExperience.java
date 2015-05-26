package com.kate.app.model;

import java.sql.Timestamp;

/**
 * AbstractWinExperience entity provides the base persistence definition of the
 * WinExperience entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractWinExperience implements java.io.Serializable {

	// Fields

	private Integer id;
	private StarInfo starInfo;
	private String detail;
	private Timestamp time;

	// Constructors

	/** default constructor */
	public AbstractWinExperience() {
	}

	/** full constructor */
	public AbstractWinExperience(StarInfo starInfo, String detail,
			Timestamp time) {
		this.starInfo = starInfo;
		this.detail = detail;
		this.time = time;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public StarInfo getStarInfo() {
		return this.starInfo;
	}

	public void setStarInfo(StarInfo starInfo) {
		this.starInfo = starInfo;
	}

	public String getDetail() {
		return this.detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public Timestamp getTime() {
		return this.time;
	}

	public void setTime(Timestamp time) {
		this.time = time;
	}

}
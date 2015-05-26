package com.kate.app.model;

import java.sql.Timestamp;

/**
 * AbstractTrainDetail entity provides the base persistence definition of the
 * TrainDetail entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractTrainDetail implements java.io.Serializable {

	// Fields

	private Integer id;
	private Train train;
	private String title;
	private String detail;
	private Timestamp time;
	private String trainImg;

	// Constructors

	/** default constructor */
	public AbstractTrainDetail() {
	}

	/** full constructor */
	public AbstractTrainDetail(Train train, String title, String detail,
			Timestamp time, String trainImg) {
		this.train = train;
		this.title = title;
		this.detail = detail;
		this.time = time;
		this.trainImg = trainImg;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Train getTrain() {
		return this.train;
	}

	public void setTrain(Train train) {
		this.train = train;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
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

	public String getTrainImg() {
		return this.trainImg;
	}

	public void setTrainImg(String trainImg) {
		this.trainImg = trainImg;
	}

}
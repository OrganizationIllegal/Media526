package com.kate.app.model;

import java.util.HashSet;
import java.util.Set;

/**
 * AbstractTrain entity provides the base persistence definition of the Train
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractTrain implements java.io.Serializable {

	// Fields

	private Integer id;
	private String trainName;
	private String trainDesc;
	private String trainImage;
	private Set trainDetails = new HashSet(0);

	// Constructors

	/** default constructor */
	public AbstractTrain() {
	}

	/** full constructor */
	public AbstractTrain(String trainName, String trainDesc, String trainImage,
			Set trainDetails) {
		this.trainName = trainName;
		this.trainDesc = trainDesc;
		this.trainImage = trainImage;
		this.trainDetails = trainDetails;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTrainName() {
		return this.trainName;
	}

	public void setTrainName(String trainName) {
		this.trainName = trainName;
	}

	public String getTrainDesc() {
		return this.trainDesc;
	}

	public void setTrainDesc(String trainDesc) {
		this.trainDesc = trainDesc;
	}

	public String getTrainImage() {
		return this.trainImage;
	}

	public void setTrainImage(String trainImage) {
		this.trainImage = trainImage;
	}

	public Set getTrainDetails() {
		return this.trainDetails;
	}

	public void setTrainDetails(Set trainDetails) {
		this.trainDetails = trainDetails;
	}

}
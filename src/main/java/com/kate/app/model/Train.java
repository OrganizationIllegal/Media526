package com.kate.app.model;


import java.util.Set;

/**
 * Train entity. @author MyEclipse Persistence Tools
 */
public class Train extends AbstractTrain implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public Train() {
	}

	/** full constructor */
	public Train(String trainName, String trainDesc, String trainImage,
			Set trainDetails) {
		super(trainName, trainDesc, trainImage, trainDetails);

	}

}

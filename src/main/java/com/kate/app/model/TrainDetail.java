package com.kate.app.model;


import java.sql.Timestamp;

/**
 * TrainDetail entity. @author MyEclipse Persistence Tools
 */
public class TrainDetail extends AbstractTrainDetail implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public TrainDetail() {
	}

	/** full constructor */
	public TrainDetail(Train train, String title, String detail,
			Timestamp time, String trainImg) {
		super(train, title, detail, time, trainImg);
	}


}

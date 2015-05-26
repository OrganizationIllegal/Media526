package com.kate.app.model;

import java.sql.Timestamp;

/**
 * NewsTrends entity. @author MyEclipse Persistence Tools
 */
public class NewsTrends extends AbstractNewsTrends implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public NewsTrends() {
	}

	/** full constructor */
	public NewsTrends(String title, Timestamp time, String detail, String image) {
		super(title, time, detail, image);
	}

}

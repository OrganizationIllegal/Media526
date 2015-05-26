package com.kate.app.model;

import java.util.Set;

/**
 * StarInfo entity. @author MyEclipse Persistence Tools
 */
public class StarInfo extends AbstractStarInfo implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public StarInfo() {
	}

	/** full constructor */
	public StarInfo(String chineseName, String starImg, String starDetail,
			String englishName, String bieming, String nation,
			String constellation, String bloodtype, String height,
			String weight, String birthplace, String birthday,
			String occupation, String brokerfirm, String animal,
			String representativeworks, String residence,
			String gratuateunivercity, String achivements, String nationality,
			String sex, String specialty, String musicalstyle,
			Set winExperiences) {
		super(chineseName, starImg, starDetail, englishName, bieming, nation,
				constellation, bloodtype, height, weight, birthplace, birthday,
				occupation, brokerfirm, animal, representativeworks, residence,
				gratuateunivercity, achivements, nationality, sex, specialty,
				musicalstyle, winExperiences);
	}

}

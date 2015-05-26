package com.kate.app.model;

import java.util.HashSet;
import java.util.Set;

/**
 * AbstractStarInfo entity provides the base persistence definition of the
 * StarInfo entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractStarInfo implements java.io.Serializable {

	// Fields

	private Integer id;
	private String chineseName;
	private String starImg;
	private String starDetail;
	private String englishName;
	private String bieming;
	private String nation;
	private String constellation;
	private String bloodtype;
	private String height;
	private String weight;
	private String birthplace;
	private String birthday;
	private String occupation;
	private String brokerfirm;
	private String animal;
	private String representativeworks;
	private String residence;
	private String gratuateunivercity;
	private String achivements;
	private String nationality;
	private String sex;
	private String specialty;
	private String musicalstyle;
	private Set winExperiences = new HashSet(0);

	// Constructors

	/** default constructor */
	public AbstractStarInfo() {
	}

	/** full constructor */
	public AbstractStarInfo(String chineseName, String starImg,
			String starDetail, String englishName, String bieming,
			String nation, String constellation, String bloodtype,
			String height, String weight, String birthplace, String birthday,
			String occupation, String brokerfirm, String animal,
			String representativeworks, String residence,
			String gratuateunivercity, String achivements, String nationality,
			String sex, String specialty, String musicalstyle,
			Set winExperiences) {
		this.chineseName = chineseName;
		this.starImg = starImg;
		this.starDetail = starDetail;
		this.englishName = englishName;
		this.bieming = bieming;
		this.nation = nation;
		this.constellation = constellation;
		this.bloodtype = bloodtype;
		this.height = height;
		this.weight = weight;
		this.birthplace = birthplace;
		this.birthday = birthday;
		this.occupation = occupation;
		this.brokerfirm = brokerfirm;
		this.animal = animal;
		this.representativeworks = representativeworks;
		this.residence = residence;
		this.gratuateunivercity = gratuateunivercity;
		this.achivements = achivements;
		this.nationality = nationality;
		this.sex = sex;
		this.specialty = specialty;
		this.musicalstyle = musicalstyle;
		this.winExperiences = winExperiences;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getChineseName() {
		return this.chineseName;
	}

	public void setChineseName(String chineseName) {
		this.chineseName = chineseName;
	}

	public String getStarImg() {
		return this.starImg;
	}

	public void setStarImg(String starImg) {
		this.starImg = starImg;
	}

	public String getStarDetail() {
		return this.starDetail;
	}

	public void setStarDetail(String starDetail) {
		this.starDetail = starDetail;
	}

	public String getEnglishName() {
		return this.englishName;
	}

	public void setEnglishName(String englishName) {
		this.englishName = englishName;
	}

	public String getBieming() {
		return this.bieming;
	}

	public void setBieming(String bieming) {
		this.bieming = bieming;
	}

	public String getNation() {
		return this.nation;
	}

	public void setNation(String nation) {
		this.nation = nation;
	}

	public String getConstellation() {
		return this.constellation;
	}

	public void setConstellation(String constellation) {
		this.constellation = constellation;
	}

	public String getBloodtype() {
		return this.bloodtype;
	}

	public void setBloodtype(String bloodtype) {
		this.bloodtype = bloodtype;
	}

	public String getHeight() {
		return this.height;
	}

	public void setHeight(String height) {
		this.height = height;
	}

	public String getWeight() {
		return this.weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

	public String getBirthplace() {
		return this.birthplace;
	}

	public void setBirthplace(String birthplace) {
		this.birthplace = birthplace;
	}

	public String getBirthday() {
		return this.birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getOccupation() {
		return this.occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	public String getBrokerfirm() {
		return this.brokerfirm;
	}

	public void setBrokerfirm(String brokerfirm) {
		this.brokerfirm = brokerfirm;
	}

	public String getAnimal() {
		return this.animal;
	}

	public void setAnimal(String animal) {
		this.animal = animal;
	}

	public String getRepresentativeworks() {
		return this.representativeworks;
	}

	public void setRepresentativeworks(String representativeworks) {
		this.representativeworks = representativeworks;
	}

	public String getResidence() {
		return this.residence;
	}

	public void setResidence(String residence) {
		this.residence = residence;
	}

	public String getGratuateunivercity() {
		return this.gratuateunivercity;
	}

	public void setGratuateunivercity(String gratuateunivercity) {
		this.gratuateunivercity = gratuateunivercity;
	}

	public String getAchivements() {
		return this.achivements;
	}

	public void setAchivements(String achivements) {
		this.achivements = achivements;
	}

	public String getNationality() {
		return this.nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getSex() {
		return this.sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getSpecialty() {
		return this.specialty;
	}

	public void setSpecialty(String specialty) {
		this.specialty = specialty;
	}

	public String getMusicalstyle() {
		return this.musicalstyle;
	}

	public void setMusicalstyle(String musicalstyle) {
		this.musicalstyle = musicalstyle;
	}

	public Set getWinExperiences() {
		return this.winExperiences;
	}

	public void setWinExperiences(Set winExperiences) {
		this.winExperiences = winExperiences;
	}

}
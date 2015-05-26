package com.kate.app.dao;

import com.kate.app.model.StarInfo;

import java.util.List;
import java.util.Set;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

/**
 * A data access object (DAO) providing persistence and search support for
 * StarInfo entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.kate.app.model.StarInfo
 * @author MyEclipse Persistence Tools
 */
@Repository 
public class StarInfoDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory
			.getLogger(StarInfoDAO.class);
	// property constants
	public static final String CHINESE_NAME = "chineseName";
	public static final String STAR_IMG = "starImg";
	public static final String STAR_DETAIL = "starDetail";
	public static final String ENGLISH_NAME = "englishName";
	public static final String BIEMING = "bieming";
	public static final String NATION = "nation";
	public static final String CONSTELLATION = "constellation";
	public static final String BLOODTYPE = "bloodtype";
	public static final String HEIGHT = "height";
	public static final String WEIGHT = "weight";
	public static final String BIRTHPLACE = "birthplace";
	public static final String BIRTHDAY = "birthday";
	public static final String OCCUPATION = "occupation";
	public static final String BROKERFIRM = "brokerfirm";
	public static final String ANIMAL = "animal";
	public static final String REPRESENTATIVEWORKS = "representativeworks";
	public static final String RESIDENCE = "residence";
	public static final String GRATUATEUNIVERCITY = "gratuateunivercity";
	public static final String ACHIVEMENTS = "achivements";
	public static final String NATIONALITY = "nationality";
	public static final String SEX = "sex";
	public static final String SPECIALTY = "specialty";
	public static final String MUSICALSTYLE = "musicalstyle";

	public void save(StarInfo transientInstance) {
		log.debug("saving StarInfo instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(StarInfo persistentInstance) {
		log.debug("deleting StarInfo instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public StarInfo findById(java.lang.Integer id) {
		log.debug("getting StarInfo instance with id: " + id);
		try {
			StarInfo instance = (StarInfo) getSession().get(
					"com.kate.app.model.StarInfo", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(StarInfo instance) {
		log.debug("finding StarInfo instance by example");
		try {
			List results = getSession()
					.createCriteria("com.kate.app.model.StarInfo")
					.add(Example.create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding StarInfo instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from StarInfo as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByChineseName(Object chineseName) {
		return findByProperty(CHINESE_NAME, chineseName);
	}

	public List findByStarImg(Object starImg) {
		return findByProperty(STAR_IMG, starImg);
	}

	public List findByStarDetail(Object starDetail) {
		return findByProperty(STAR_DETAIL, starDetail);
	}

	public List findByEnglishName(Object englishName) {
		return findByProperty(ENGLISH_NAME, englishName);
	}

	public List findByBieming(Object bieming) {
		return findByProperty(BIEMING, bieming);
	}

	public List findByNation(Object nation) {
		return findByProperty(NATION, nation);
	}

	public List findByConstellation(Object constellation) {
		return findByProperty(CONSTELLATION, constellation);
	}

	public List findByBloodtype(Object bloodtype) {
		return findByProperty(BLOODTYPE, bloodtype);
	}

	public List findByHeight(Object height) {
		return findByProperty(HEIGHT, height);
	}

	public List findByWeight(Object weight) {
		return findByProperty(WEIGHT, weight);
	}

	public List findByBirthplace(Object birthplace) {
		return findByProperty(BIRTHPLACE, birthplace);
	}

	public List findByBirthday(Object birthday) {
		return findByProperty(BIRTHDAY, birthday);
	}

	public List findByOccupation(Object occupation) {
		return findByProperty(OCCUPATION, occupation);
	}

	public List findByBrokerfirm(Object brokerfirm) {
		return findByProperty(BROKERFIRM, brokerfirm);
	}

	public List findByAnimal(Object animal) {
		return findByProperty(ANIMAL, animal);
	}

	public List findByRepresentativeworks(Object representativeworks) {
		return findByProperty(REPRESENTATIVEWORKS, representativeworks);
	}

	public List findByResidence(Object residence) {
		return findByProperty(RESIDENCE, residence);
	}

	public List findByGratuateunivercity(Object gratuateunivercity) {
		return findByProperty(GRATUATEUNIVERCITY, gratuateunivercity);
	}

	public List findByAchivements(Object achivements) {
		return findByProperty(ACHIVEMENTS, achivements);
	}

	public List findByNationality(Object nationality) {
		return findByProperty(NATIONALITY, nationality);
	}

	public List findBySex(Object sex) {
		return findByProperty(SEX, sex);
	}

	public List findBySpecialty(Object specialty) {
		return findByProperty(SPECIALTY, specialty);
	}

	public List findByMusicalstyle(Object musicalstyle) {
		return findByProperty(MUSICALSTYLE, musicalstyle);
	}

	public List findAll() {
		log.debug("finding all StarInfo instances");
		try {
			String queryString = "from StarInfo";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public StarInfo merge(StarInfo detachedInstance) {
		log.debug("merging StarInfo instance");
		try {
			StarInfo result = (StarInfo) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(StarInfo instance) {
		log.debug("attaching dirty StarInfo instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(StarInfo instance) {
		log.debug("attaching clean StarInfo instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}
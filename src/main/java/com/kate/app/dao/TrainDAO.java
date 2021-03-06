package com.kate.app.dao;

import com.kate.app.model.Train;

import java.util.List;
import java.util.Set;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

/**
 * A data access object (DAO) providing persistence and search support for Train
 * entities. Transaction control of the save(), update() and delete() operations
 * can directly support Spring container-managed transactions or they can be
 * augmented to handle user-managed Spring transactions. Each of these methods
 * provides additional information for how to configure it for the desired type
 * of transaction control.
 * 
 * @see com.kate.app.model.Train
 * @author MyEclipse Persistence Tools
 */
@Repository 
public class TrainDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory.getLogger(TrainDAO.class);
	// property constants
	public static final String TRAIN_NAME = "trainName";
	public static final String TRAIN_DESC = "trainDesc";
	public static final String TRAIN_IMAGE = "trainImage";

	public void save(Train transientInstance) {
		log.debug("saving Train instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Train persistentInstance) {
		log.debug("deleting Train instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Train findById(java.lang.Integer id) {
		log.debug("getting Train instance with id: " + id);
		try {
			Train instance = (Train) getSession().get(
					"com.kate.app.model.Train", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Train instance) {
		log.debug("finding Train instance by example");
		try {
			List results = getSession()
					.createCriteria("com.kate.app.model.Train")
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
		log.debug("finding Train instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Train as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByTrainName(Object trainName) {
		return findByProperty(TRAIN_NAME, trainName);
	}

	public List findByTrainDesc(Object trainDesc) {
		return findByProperty(TRAIN_DESC, trainDesc);
	}

	public List findByTrainImage(Object trainImage) {
		return findByProperty(TRAIN_IMAGE, trainImage);
	}

	public List findAll() {
		log.debug("finding all Train instances");
		try {
			String queryString = "from Train";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Train merge(Train detachedInstance) {
		log.debug("merging Train instance");
		try {
			Train result = (Train) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Train instance) {
		log.debug("attaching dirty Train instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Train instance) {
		log.debug("attaching clean Train instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}
package com.kate.app.dao;

import com.kate.app.model.TrainDetail;

import java.sql.Timestamp;
import java.util.List;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

/**
 * A data access object (DAO) providing persistence and search support for
 * TrainDetail entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.kate.app.model.TrainDetail
 * @author MyEclipse Persistence Tools
 */
@Repository 
public class TrainDetailDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory
			.getLogger(TrainDetailDAO.class);
	// property constants
	public static final String TITLE = "title";
	public static final String DETAIL = "detail";
	public static final String TRAIN_IMG = "trainImg";

	public void save(TrainDetail transientInstance) {
		log.debug("saving TrainDetail instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(TrainDetail persistentInstance) {
		log.debug("deleting TrainDetail instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public TrainDetail findById(java.lang.Integer id) {
		log.debug("getting TrainDetail instance with id: " + id);
		try {
			TrainDetail instance = (TrainDetail) getSession().get(
					"com.kate.app.model.TrainDetail", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(TrainDetail instance) {
		log.debug("finding TrainDetail instance by example");
		try {
			List results = getSession()
					.createCriteria("com.kate.app.model.TrainDetail")
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
		log.debug("finding TrainDetail instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from TrainDetail as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByTitle(Object title) {
		return findByProperty(TITLE, title);
	}

	public List findByDetail(Object detail) {
		return findByProperty(DETAIL, detail);
	}

	public List findByTrainImg(Object trainImg) {
		return findByProperty(TRAIN_IMG, trainImg);
	}

	public List findAll() {
		log.debug("finding all TrainDetail instances");
		try {
			String queryString = "from TrainDetail";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public TrainDetail merge(TrainDetail detachedInstance) {
		log.debug("merging TrainDetail instance");
		try {
			TrainDetail result = (TrainDetail) getSession().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(TrainDetail instance) {
		log.debug("attaching dirty TrainDetail instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(TrainDetail instance) {
		log.debug("attaching clean TrainDetail instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}
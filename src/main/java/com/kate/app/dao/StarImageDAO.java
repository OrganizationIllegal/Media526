package com.kate.app.dao;

import com.kate.app.model.StarImage;

import java.util.List;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

/**
 * A data access object (DAO) providing persistence and search support for
 * StarImage entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.kate.app.model.StarImage
 * @author MyEclipse Persistence Tools
 */
@Repository 
public class StarImageDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory
			.getLogger(StarImageDAO.class);
	// property constants
	public static final String IMG = "img";

	public void save(StarImage transientInstance) {
		log.debug("saving StarImage instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(StarImage persistentInstance) {
		log.debug("deleting StarImage instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public StarImage findById(java.lang.Integer id) {
		log.debug("getting StarImage instance with id: " + id);
		try {
			StarImage instance = (StarImage) getSession().get(
					"com.kate.app.model.StarImage", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(StarImage instance) {
		log.debug("finding StarImage instance by example");
		try {
			List results = getSession()
					.createCriteria("com.kate.app.model.StarImage")
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
		log.debug("finding StarImage instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from StarImage as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByImg(Object img) {
		return findByProperty(IMG, img);
	}

	public List findAll() {
		log.debug("finding all StarImage instances");
		try {
			String queryString = "from StarImage";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public StarImage merge(StarImage detachedInstance) {
		log.debug("merging StarImage instance");
		try {
			StarImage result = (StarImage) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(StarImage instance) {
		log.debug("attaching dirty StarImage instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(StarImage instance) {
		log.debug("attaching clean StarImage instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}
package com.kate.app.dao;

import com.kate.app.model.StarVedio;

import java.util.List;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

/**
 * A data access object (DAO) providing persistence and search support for
 * StarVedio entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.kate.app.model.StarVedio
 * @author MyEclipse Persistence Tools
 */
@Repository 
public class StarVedioDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory
			.getLogger(StarVedioDAO.class);
	// property constants
	public static final String VEDIO = "vedio";

	public void save(StarVedio transientInstance) {
		log.debug("saving StarVedio instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(StarVedio persistentInstance) {
		log.debug("deleting StarVedio instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public StarVedio findById(java.lang.Integer id) {
		log.debug("getting StarVedio instance with id: " + id);
		try {
			StarVedio instance = (StarVedio) getSession().get(
					"com.kate.app.model.StarVedio", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(StarVedio instance) {
		log.debug("finding StarVedio instance by example");
		try {
			List results = getSession()
					.createCriteria("com.kate.app.model.StarVedio")
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
		log.debug("finding StarVedio instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from StarVedio as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByVedio(Object vedio) {
		return findByProperty(VEDIO, vedio);
	}

	public List findAll() {
		log.debug("finding all StarVedio instances");
		try {
			String queryString = "from StarVedio";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public StarVedio merge(StarVedio detachedInstance) {
		log.debug("merging StarVedio instance");
		try {
			StarVedio result = (StarVedio) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(StarVedio instance) {
		log.debug("attaching dirty StarVedio instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(StarVedio instance) {
		log.debug("attaching clean StarVedio instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}
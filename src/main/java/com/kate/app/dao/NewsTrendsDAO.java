package com.kate.app.dao;

import java.sql.Timestamp;
import java.util.List;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.kate.app.model.NewsTrends;

/**
 * A data access object (DAO) providing persistence and search support for
 * NewsTrends entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.kate.app.model.NewsTrends
 * @author MyEclipse Persistence Tools
 */


@Repository 
public class NewsTrendsDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory
			.getLogger(NewsTrendsDAO.class);
	// property constants
	public static final String TITLE = "title";
	public static final String DETAIL = "detail";
	public static final String IMAGE = "image";

	public void save(NewsTrends transientInstance) {
		log.debug("saving NewsTrends instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(NewsTrends persistentInstance) {
		log.debug("deleting NewsTrends instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public NewsTrends findById(java.lang.Integer id) {
		log.debug("getting NewsTrends instance with id: " + id);
		try {
			NewsTrends instance = (NewsTrends) getSession().get(
					"com.kate.app.model.NewsTrends", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(NewsTrends instance) {
		log.debug("finding NewsTrends instance by example");
		try {
			List results = getSession()
					.createCriteria("com.kate.app.model.NewsTrends")
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
		log.debug("finding NewsTrends instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from NewsTrends as model where model."
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

	public List findByImage(Object image) {
		return findByProperty(IMAGE, image);
	}

	public List findAll() {
		log.debug("finding all NewsTrends instances");
		try {
			String queryString = "from NewsTrends";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public NewsTrends merge(NewsTrends detachedInstance) {
		log.debug("merging NewsTrends instance");
		try {
			NewsTrends result = (NewsTrends) getSession().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(NewsTrends instance) {
		log.debug("attaching dirty NewsTrends instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(NewsTrends instance) {
		log.debug("attaching clean NewsTrends instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}
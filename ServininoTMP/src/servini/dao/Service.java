package servini.dao;

import java.util.List;

import org.hibernate.Session;

import util.HibernateUtil;

public class Service<T> {

	public void addObjet(T o) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		session.save(o);
		session.getTransaction().commit();
	}

	public List<T> getAllObjets(String obj) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		List<T> liste = session.createQuery("from " + obj).list();
		return liste;
	}

	public T getById(Class<T> obj, int id) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		T o = (T) session.get(obj, id);
		session.getTransaction().commit();
		return o;
	}

	public void deleteObjet(Class<T> obj, int id) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		T o = (T) session.get(obj, id);
		session.delete(o);
		session.getTransaction().commit();
	}

	public void updateObjet(T obj) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		session.update(obj);
		session.getTransaction().commit();
	}
}

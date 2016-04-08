package com.home.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.home.dao.CanchaDao;
import com.home.model.Cancha;


@Repository
public class CanchaDaoImpl implements CanchaDao {
	
	@Autowired
	private SessionFactory session;
	
	@Override
	public void add(Cancha cancha) {
		session.getCurrentSession().save(cancha);
	}

	@Override
	public void edit(Cancha cancha) {
		session.getCurrentSession().update(cancha);
	}

	@Override
	public void delete(int canchaId) {		
		session.getCurrentSession().delete(getCancha(canchaId));
	}

	@Override
	public Cancha getCancha(int canchaId) {
		return (Cancha)session.getCurrentSession().get(Cancha.class, canchaId);
	}

	@Override
	public List getAllCancha() {
		return session.getCurrentSession().createQuery("from Cancha").list();
	}


}

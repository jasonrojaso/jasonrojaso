package com.home.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.home.dao.CanchaDao;
import com.home.model.Cancha;
import com.home.service.CanchaService;


@Service
public class CanchaServiceImpl implements CanchaService {
	
	@Autowired 
	private CanchaDao canchaDao;

	@Transactional
	public void add(Cancha cancha) {
		canchaDao.add(cancha);
	}

	@Transactional
	public void edit(Cancha cancha) {
		canchaDao.edit(cancha);
	}

	@Transactional
	public void delete(int canchaId) {
		canchaDao.delete(canchaId);
	}

	@Transactional
	public Cancha getCancha(int canchaId) {
		return canchaDao.getCancha(canchaId);
	}

	@Transactional
	public List getAllCancha() {
		return canchaDao.getAllCancha();
	}

}

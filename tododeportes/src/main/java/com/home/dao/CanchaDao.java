package com.home.dao;

import java.util.List;

import com.home.model.Cancha;

public interface CanchaDao {
	public void add(Cancha Cancha);
	public void edit(Cancha Cancha);
	public void delete(int canchaId);
	public Cancha getCancha(int canchatId);
	public List getAllCancha();
}


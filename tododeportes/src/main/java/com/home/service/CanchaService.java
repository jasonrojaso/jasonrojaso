package com.home.service;

import java.util.List;

import com.home.model.Cancha;

public interface CanchaService {
	public void add(Cancha Cancha);
	public void edit(Cancha Cancha);
	public void delete(int canchaId);
	public Cancha getCancha(int canchatId);
	public List getAllCancha();

}

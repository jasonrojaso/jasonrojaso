package com.home.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity 
public class Cancha {
	
	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.AUTO) //Para autonumerar
	private int canchaId;
	@Column
	private String nombre;
	@Column
	private String ubicacion;
	@Column
	private String tipo;
	@Column
	private String subtipo;
	@Column
	private String estado;
	@Column
	private int valor;
	
	public Cancha(){}
	
	public Cancha(int canchaId, String nombre, String ubicacion, String tipo, String subtipo, String estado,
			int valor) {
		super();
		this.canchaId = canchaId;
		this.nombre = nombre;
		this.ubicacion = ubicacion;
		this.tipo = tipo;
		this.subtipo = subtipo;
		this.estado = estado;
		this.valor = valor;
	}

	public int getCanchaId() {
		return canchaId;
	}

	public void setCanchaId(int canchaId) {
		this.canchaId = canchaId;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getSubtipo() {
		return subtipo;
	}

	public void setSubtipo(String subtipo) {
		this.subtipo = subtipo;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}
	
	
}

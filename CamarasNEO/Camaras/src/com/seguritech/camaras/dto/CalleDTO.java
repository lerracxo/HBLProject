package com.seguritech.camaras.dto;

import java.io.Serializable;

public class CalleDTO implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -6234715437047303135L;
	/**
	 * @return the id_calle
	 */
	public int getId_calle() {
		return id_calle;
	}
	/**
	 * @param id_calle the id_calle to set
	 */
	public void setId_calle(int id_calle) {
		this.id_calle = id_calle;
	}
	/**
	 * @return the id_colonia
	 */
	public int getId_colonia() {
		return id_colonia;
	}
	/**
	 * @param id_colonia the id_colonia to set
	 */
	public void setId_colonia(int id_colonia) {
		this.id_colonia = id_colonia;
	}
	/**
	 * @return the nombre
	 */
	public int getNombre() {
		return nombre;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(int nombre) {
		this.nombre = nombre;
	}
	private int id_calle;
	private int id_colonia;
	private int nombre;
}

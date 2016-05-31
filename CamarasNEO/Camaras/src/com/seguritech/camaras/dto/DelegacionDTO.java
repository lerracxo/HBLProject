package com.seguritech.camaras.dto;

import java.io.Serializable;

public class DelegacionDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4836873426058595649L;
	private int id_delegacion;
	private String nombre;
	/**
	 * @return the id_delegacion
	 */
	public int getId_delegacion() {
		return id_delegacion;
	}
	/**
	 * @param id_delegacion the id_delegacion to set
	 */
	public void setId_delegacion(int id_delegacion) {
		this.id_delegacion = id_delegacion;
	}
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
}
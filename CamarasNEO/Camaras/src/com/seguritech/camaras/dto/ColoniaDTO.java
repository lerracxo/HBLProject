package com.seguritech.camaras.dto;

import java.io.Serializable;

public class ColoniaDTO implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 4670211585258457863L;
	
	private int id_colonia;
	private int id_municipio;
	private String nombre;
	
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
	 * @return the id_municipio
	 */
	public int getId_municipio() {
		return id_municipio;
	}
	/**
	 * @param id_municipio the id_municipio to set
	 */
	public void setId_municipio(int id_municipio) {
		this.id_municipio = id_municipio;
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

package com.seguritech.camaras.dto;

import java.io.Serializable;

public class CamaraDTO implements Serializable 	{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1812791786778580581L;
	
	private int id_camara;
	private int id_delegacion;
	private int id_municipio;
	private int id_colonia;
	private int id_calle;
	private String url;
	private String nombre;
	
	/**
	 * @return the id_camara
	 */
	public int getId_camara() {
		return id_camara;
	}
	/**
	 * @param id_camara the id_camara to set
	 */
	public void setId_camara(int id_camara) {
		this.id_camara = id_camara;
	}
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
	 * @return the url
	 */
	public String getUrl() {
		return url;
	}
	/**
	 * @param url the url to set
	 */
	public void setUrl(String url) {
		this.url = url;
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

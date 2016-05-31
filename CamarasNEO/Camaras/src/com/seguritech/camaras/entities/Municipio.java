package com.seguritech.camaras.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="municipio")
public class Municipio {
	
	@Id
	private int id_municipio;
	@Column
	private int id_delegacion;
	@Column
	private String nombre;
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

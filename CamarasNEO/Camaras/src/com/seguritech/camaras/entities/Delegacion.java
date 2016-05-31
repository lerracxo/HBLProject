package com.seguritech.camaras.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="delegacion")
public class Delegacion {
	@Id
	private int id_delegacion;
	@Column
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

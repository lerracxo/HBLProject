package com.mx.ozz.dto;

import java.io.Serializable;
import java.util.Date;

public class UsuarioDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -9220986635802095617L;
	
	private Long id;
	private String nombre;
	private String apellido_p;
	private String apellido_m;
	private Date fecha_nacimiento;
	
	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
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
	/**
	 * @return the apellido_p
	 */
	public String getApellido_p() {
		return apellido_p;
	}
	/**
	 * @param apellido_p the apellido_p to set
	 */
	public void setApellido_p(String apellido_p) {
		this.apellido_p = apellido_p;
	}
	/**
	 * @return the apellido_m
	 */
	public String getApellido_m() {
		return apellido_m;
	}
	/**
	 * @param apellido_m the apellido_m to set
	 */
	public void setApellido_m(String apellido_m) {
		this.apellido_m = apellido_m;
	}
	/**
	 * @return the fecha_nacimiento
	 */
	public Date getFecha_nacimiento() {
		return fecha_nacimiento;
	}
	/**
	 * @param fecha_nacimiento the fecha_nacimiento to set
	 */
	public void setFecha_nacimiento(Date fecha_nacimiento) {
		this.fecha_nacimiento = fecha_nacimiento;
	}
	
	@Override 
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append(this.nombre).append(" ").append(this.apellido_m).append(this.apellido_p).append(" de ");
		sb.append(this.fecha_nacimiento.toString());
		return sb.toString();
	}
	

}

package com.mx.ozz.mb;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name="personaMB")
@SessionScoped
public class PersonaMB implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -6093116272636247658L;
	
	private String leyenda="Valor de leyenda";

	public String getLeyenda() {
		return leyenda;
	}

	public void setLeyenda(String leyenda) {
		this.leyenda = leyenda;
	}
}

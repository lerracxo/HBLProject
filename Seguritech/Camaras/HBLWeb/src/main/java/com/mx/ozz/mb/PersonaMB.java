package com.mx.ozz.mb;

import java.io.Serializable;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.mx.ozz.bs.UsuarioServiceLocal;

@ManagedBean(name = "personaMB")
@SessionScoped
public class PersonaMB implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -6093116272636247658L;

	@EJB(name = "UsuarioServiceBean", mappedName = "UsuarioServiceBean")
	private UsuarioServiceLocal usuarioService;

	private String leyenda = "Valor de leyenda";

	public String getLeyenda() {
		return usuarioService.loggin("", "").toString();
	}

	public void setLeyenda(String leyenda) {
		this.leyenda = leyenda;
	}
}

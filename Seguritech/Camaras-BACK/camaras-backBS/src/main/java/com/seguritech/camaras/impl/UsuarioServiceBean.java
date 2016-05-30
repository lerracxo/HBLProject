package com.seguritech.camaras.impl;

import java.util.Date;

import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import com.seguritech.camaras.bs.UsuarioServiceLocal;
import com.seguritech.camaras.bs.UsuarioServiceRemote;
import com.seguritech.camaras.dto.UsuarioDTO;

@Stateless(name = "UsuarioServiceBean", mappedName = "UsuarioServiceBean")
@WebService(name = "UsuarioServiceBean", serviceName = "UsuarioServiceBean", portName = "IaaTifCetActoServicePort")
public class UsuarioServiceBean implements UsuarioServiceLocal, UsuarioServiceRemote{

	/* (non-Javadoc)
	 * @see com.mx.ozz.bs.UsuarioIService#loggin(java.lang.String, java.lang.String)
	 */
	@Override
	@WebMethod
	public UsuarioDTO loggin(@WebParam(name="user",mode=WebParam.Mode.IN)String user,
			@WebParam(name="passwd", mode=WebParam.Mode.IN)String passwd){
		UsuarioDTO usuario = new UsuarioDTO();
		usuario.setNombre("Oscarin");
		usuario.setApellido_m("Martinez");
		usuario.setApellido_p("Santoyo");
		usuario.setFecha_nacimiento(new Date());
		return new UsuarioDTO();
	}
}

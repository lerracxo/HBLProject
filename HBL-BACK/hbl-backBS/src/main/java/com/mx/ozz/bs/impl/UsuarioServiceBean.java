package com.mx.ozz.bs.impl;

import javax.ejb.Stateless;
import javax.jws.WebService;

import com.mx.ozz.bs.UsuarioServiceLocal;
import com.mx.ozz.bs.UsuarioServiceRemote;
import com.mx.ozz.dto.UsuarioDTO;

@Stateless(name = "UsuarioServiceBean", mappedName = "UsuarioServiceBean")
@WebService(name = "UsuarioServiceBean", serviceName = "UsuarioServiceBean", portName = "IaaTifCetActoServicePort")
public class UsuarioServiceBean implements UsuarioServiceLocal, UsuarioServiceRemote{

	public UsuarioDTO loggin(String user, String passwd){
		
		return new UsuarioDTO();
	}
}

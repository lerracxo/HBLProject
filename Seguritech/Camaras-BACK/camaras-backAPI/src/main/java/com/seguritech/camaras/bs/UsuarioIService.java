package com.seguritech.camaras.bs;

import com.seguritech.camaras.dto.UsuarioDTO;

public interface UsuarioIService {

	/**
	 * @param user
	 * @param passwd
	 * @return
	 */
	UsuarioDTO loggin(String user, String passwd);
	

}

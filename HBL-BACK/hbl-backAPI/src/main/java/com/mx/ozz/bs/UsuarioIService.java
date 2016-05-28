package com.mx.ozz.bs;

import com.mx.ozz.dto.UsuarioDTO;

public interface UsuarioIService {

	/**
	 * @param user
	 * @param passwd
	 * @return
	 */
	UsuarioDTO loggin(String user, String passwd);
	

}

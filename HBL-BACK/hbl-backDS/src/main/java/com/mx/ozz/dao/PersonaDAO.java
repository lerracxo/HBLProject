package com.mx.ozz.dao;

import javax.ejb.Local;
import com.mx.ozz.entity.Persona;

@Local
public interface PersonaDAO extends GenericDAO<Persona,Long>{

	/**
	 * 
	 */
	void crear();

}

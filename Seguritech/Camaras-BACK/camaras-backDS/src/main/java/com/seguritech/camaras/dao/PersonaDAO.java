package com.seguritech.camaras.dao;

import javax.ejb.Local;

import com.seguritech.camaras.entity.Persona;

@Local
public interface PersonaDAO extends GenericDAO<Persona,Long>{

	/**
	 * 
	 */
	void crear();

}
